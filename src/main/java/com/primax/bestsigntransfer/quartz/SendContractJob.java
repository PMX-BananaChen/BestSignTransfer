package com.primax.bestsigntransfer.quartz;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.houbb.opencc4j.util.ZhConverterUtil;
import com.primax.bestsigntransfer.admin.domain.entity.*;
import com.primax.bestsigntransfer.admin.domain.to.*;
import com.primax.bestsigntransfer.admin.mapper.*;
import com.primax.bestsigntransfer.admin.service.IEducationIdlService;
import com.primax.bestsigntransfer.config.BestSignConfig;
import com.primax.bestsigntransfer.model.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Component
@EnableScheduling
@DS("HREntryRegistration")
public class SendContractJob extends BestSignConfig {
    private static final Logger logger = LoggerFactory.getLogger(SendContractJob.class);

    @Resource
    private EmployeinfoMapper employeinfoMapper;

    @Resource
    private SigncontractMapper signcontractMapper;

    @Resource
    private EmployeeinfoNewaddMapper employeeinfoNewaddMapper;

    @Resource
    private OutcompanyMapper outcompanyMapper;

    @Resource
    private DlEmployeeMapper dlEmployeeMapper;

    @Resource
    private DlFamiliesMapper dlFamiliesMapper;

    @Resource
    private DlLinkmanMapper dlLinkmanMapper;

    @Resource
    private DlWorkexperienceMapper dlWorkexperienceMapper;

    @Resource
    private DlRelativesincompanyMapper dlRelativesincompanyMapper;

    @Resource
    private SysEducationMapper sysEducationMapper;

    @Resource
    private SysRelationshipMapper sysRelationshipMapper;

    @Resource
    private AreasalaryMapper areasalaryMapper;

    @Resource
    private EmployedeptMapper employedeptMapper;

    @Resource
    private SysApplychannelMapper sysApplychannelMapper;

    @Autowired
    private IEducationIdlService educationIdlService;

    @Resource
    private ContractyearMapper contractyearMapper;

    @Resource
    private FacepicinfoMapper FacepicinfoMapper;

    /**
     * 发起上上签DL员工合同
     */
    public void sendContractTask() {
        /**
         * 合同模板配置正式ZS/派遣PQ
         */
        Signcontract zsdg = signcontractMapper.selectOne(Wrappers.<Signcontract>query().lambda().eq(Signcontract::getTypes, "ZS").eq(Signcontract::getStatus, "1").eq(Signcontract::getArea, "DG"));
        Signcontract pqdg = signcontractMapper.selectOne(Wrappers.<Signcontract>query().lambda().eq(Signcontract::getTypes, "PQ").eq(Signcontract::getStatus, "1").eq(Signcontract::getArea, "DG"));
        Signcontract zscq = signcontractMapper.selectOne(Wrappers.<Signcontract>query().lambda().eq(Signcontract::getTypes, "ZS").eq(Signcontract::getStatus, "1").eq(Signcontract::getArea, "CQ"));
        Signcontract pqcq = signcontractMapper.selectOne(Wrappers.<Signcontract>query().lambda().eq(Signcontract::getTypes, "PQ").eq(Signcontract::getStatus, "1").eq(Signcontract::getArea, "CQ"));
        Signcontract zsks = signcontractMapper.selectOne(Wrappers.<Signcontract>query().lambda().eq(Signcontract::getTypes, "ZS").eq(Signcontract::getStatus, "1").eq(Signcontract::getArea, "KS"));
        Signcontract pqks = signcontractMapper.selectOne(Wrappers.<Signcontract>query().lambda().eq(Signcontract::getTypes, "PQ").eq(Signcontract::getStatus, "1").eq(Signcontract::getArea, "KS"));

        List<Employeinfo> employeinfos = employeinfoMapper.selectList(Wrappers.<Employeinfo>query().lambda().eq(Employeinfo::getContractStatus, "N"));
        if (employeinfos != null && employeinfos.size() > 0) {
            for (Employeinfo employeinfo :
                    employeinfos) {
                /**
                 * 获取员工电话号码(即上上签账号
                 */
                String userAccount = "";
                String idcardno = employeinfo.getIdcardno();
                if (StringUtils.isNotBlank(idcardno)) {
                    List<DlEmployee> employees = dlEmployeeMapper.selectList(Wrappers.<DlEmployee>query().lambda().eq(DlEmployee::getIdentityno, idcardno).orderByDesc(DlEmployee::getUpdatetime));
                    if (employees != null && employees.size() > 0) {
                        if (employees.get(0) != null && StringUtils.isNotBlank(employees.get(0).getPhonenumber())) {
                            userAccount = employees.get(0).getPhonenumber();
                        }
                    } else {
                        logger.info("发送合同时无法获取员工电话,即上上签账号,请检查emp信息是否同步!!!");
                    }
                }
                /**
                 * 组装数据
                 */
                List<EmployeeinfoNewadd> employeeinfoNewadds= employeeinfoNewaddMapper.selectList(Wrappers.<EmployeeinfoNewadd>query().lambda().eq(EmployeeinfoNewadd::getEmpno, employeinfo.getEmpno()).orderByDesc(EmployeeinfoNewadd::getCreatedate));

                if (StringUtils.isNotBlank(userAccount) && employeeinfoNewadds!=null && employeeinfoNewadds.size()>0) {
                    EmployeeinfoNewadd employeeinfoNewadd = employeeinfoNewadds.get(0);
                    String usertype = employeeinfoNewadd.getUsertype();
                    String salary = employeeinfoNewadd.getSalary();
                    String outCompanyID=employeeinfoNewadd.getOutcompanyid();
                    /**
                     * 组装发送合同的入参
                     */
                    Map<String, Object> sendContractInfoMap = new HashMap<>();
                    Map<String, Object> sender = new HashMap<>();
                    sender.put("bizName", "人事业务线");
                    List<Map<String, Object>> roles = new ArrayList<>();
                    Map<String, Object> empRole = new HashMap<>();
                    Map<String, Object> comRole = new HashMap<>();
                    Map<String, Object> userInfo = new HashMap<>();
                    userInfo.put("userAccount", userAccount);
                    Map<String, Object> companyInfo = new HashMap<>();
                    List<Map<String, Object>> textLabels = new ArrayList<>();
                    List<Map<String, Object>> imageLabels = new ArrayList<>();
                    Map<String, Object> textLabel;
                    Map<String, Object> imageLabel;
                    List<DlEmployee> dlEmployees = dlEmployeeMapper.selectList(Wrappers.<DlEmployee>query().lambda().eq(DlEmployee::getIdentityno, employeinfo.getIdcardno()).orderByDesc(DlEmployee::getCreatetime));
                    List<Education> educations = new ArrayList<>();
                    /**
                     * 合同模板性质usertype(5派遣/1正式
                     */
                    if (StringUtils.isNotBlank(usertype) && StringUtils.isNotBlank(salary) && dlEmployees!=null && dlEmployees.size()>0) {
                        DlEmployee dlEmployee = dlEmployees.get(0);
                        if (usertype.equals("5")) {
                            if (salary.equals("D1") || salary.equals("D3")) {
                                sendContractInfoMap.put("templateId", pqdg.getContract());
                                //员工roleId
                                empRole.put("roleId", pqdg.getEmployeeroleid());
                                //企业roleId
                                comRole.put("roleId", pqdg.getCompanyroleid());
                                if (dlEmployee != null) {
                                    educations = educationIdlService.selectEducationIdlDGList(dlEmployee.getId());
                                }
                                logger.info("PQ"+pqdg.getEmployeeroleid());
                            } else if (salary.equals("C1") || salary.equals("C3")) {
                                sendContractInfoMap.put("templateId", pqcq.getContract());
                                //员工roleId
                                empRole.put("roleId", pqcq.getEmployeeroleid());
                                //企业roleId
                                comRole.put("roleId", pqcq.getCompanyroleid());
                                if (dlEmployee != null) {
                                    educations = educationIdlService.selectEducationIdlCQList(dlEmployee.getId());
                                }
                            } else if (salary.equals("K1")) {
                                sendContractInfoMap.put("templateId", pqks.getContract());
                                //员工roleId
                                empRole.put("roleId", pqks.getEmployeeroleid());
                                //企业roleId
                                comRole.put("roleId", pqks.getCompanyroleid());
                                if (dlEmployee != null) {
                                    educations = educationIdlService.selectEducationIdlKSList(dlEmployee.getId());
                                }
                            }
                        } else if (usertype.equals("1")) {
                            /**
                             * 正式工
                             */
                            if (salary.equals("D1")) {
                                sendContractInfoMap.put("templateId", zsdg.getContract());
                                //员工roleId
                                empRole.put("roleId", zsdg.getEmployeeroleid());
                                if (dlEmployee != null) {
                                    educations = educationIdlService.selectEducationIdlDGList(dlEmployee.getId());
                                }
                                sender.put("enterpriseName", "东莞东聚电子电讯制品有限公司");
                                sender.put("account", zsdg.getAccount());
                                sendContractInfoMap.put("sender", sender);
                                logger.info("ZS"+pqdg.getEmployeeroleid());
                                logger.info("ZS"+zsdg.getAccount());
                            } else if (salary.equals("C1")) {
                                sendContractInfoMap.put("templateId", zscq.getContract());
                                //员工roleId
                                empRole.put("roleId", zscq.getEmployeeroleid());
                                if (dlEmployee != null) {
                                    educations = educationIdlService.selectEducationIdlCQList(dlEmployee.getId());
                                }
                                sender.put("enterpriseName", "致伸科技(重庆)有限公司");
                                sender.put("account", zscq.getAccount());
                                sendContractInfoMap.put("sender", sender);
                            } else if (salary.equals("K1")) {
                                sendContractInfoMap.put("templateId", zsks.getContract());
                                //员工roleId
                                empRole.put("roleId", zsks.getEmployeeroleid());
                                if (dlEmployee != null) {
                                    educations = educationIdlService.selectEducationIdlKSList(dlEmployee.getId());
                                }
                                sender.put("enterpriseName", "昆山致伸东聚电子有限公司");
                                sender.put("account", zsks.getAccount());
                                sendContractInfoMap.put("sender", sender);
                            }
                        }

                        /**
                         * 外服人力公司信息
                         */
                        Outcompany outcompany = outcompanyMapper.selectOne(Wrappers.<Outcompany>query().lambda().eq(Outcompany::getOutcompanyid, employeeinfoNewadd.getOutcompanyid()));
                        if (outcompany != null) {
                            if (StringUtils.isNotBlank(outcompany.getContact())) {
                                String contact = outcompany.getContact();
                                companyInfo.put("userAccount", contact);
                            }
                            if (StringUtils.isNotBlank(outcompany.getOutcompanyname())) {
                                textLabel = new HashMap<>();
                                textLabel.put("name", "甲方单位名称");
                                textLabel.put("value", ZhConverterUtil.toSimple(outcompany.getOutcompanyname().substring(3)));
                                textLabels.add(textLabel);
                                companyInfo.put("enterpriseName", ZhConverterUtil.toSimple(outcompany.getOutcompanyname().substring(3).trim()));
                            }
                            if (StringUtils.isNotBlank(outcompany.getCorporation())) {
                                textLabel = new HashMap<>();
                                textLabel.put("name", "甲方法人代表");
                                textLabel.put("value", ZhConverterUtil.toSimple(outcompany.getCorporation()));
                                textLabels.add(textLabel);
                            }
                            if (StringUtils.isNotBlank(outcompany.getAddress())) {
                                textLabel = new HashMap<>();
                                textLabel.put("name", "甲方注册地址");
                                textLabel.put("value", ZhConverterUtil.toSimple(outcompany.getAddress()));
                                textLabels.add(textLabel);
                            }
                            if (StringUtils.isNotBlank(outcompany.getEconomy())) {
                                textLabel = new HashMap<>();
                                textLabel.put("name", "甲方经济类型");
                                textLabel.put("value", ZhConverterUtil.toSimple(outcompany.getEconomy()));
                                textLabels.add(textLabel);
                            }
                            if (StringUtils.isNotBlank(outcompany.getContactnumber())) {
                                textLabel = new HashMap<>();
                                textLabel.put("name", "甲方联系电话");
                                textLabel.put("value", outcompany.getContactnumber());
                                textLabels.add(textLabel);
                            }
                            comRole.put("userInfo", companyInfo);
                            //增加派遣工员工类型是正式工的增加roleId
                            if(usertype.equals("1") && salary.equals("D1") && StringUtils.isNotBlank(outCompanyID))
                            {
                                /**sendAction 上上签核就可以自动签了*/
                                sendContractInfoMap.put("sendAction", "SEND_AND_SIGN");
                            }
                            else {
                                roles.add(comRole);
                            }
                        } else {
                            /**sendAction 上上签核就可以自动签了*/
                            sendContractInfoMap.put("sendAction", "SEND_AND_SIGN");
                        }
//                        sendContractInfoMap.put("sender", sender);
                        /**
                         * 签约员工和企业配置
                         */
                        empRole.put("userInfo", userInfo);
                        roles.add(empRole);
                        sendContractInfoMap.put("roles", roles);
                        /**
                         * 劳动者信息
                         */
                        textLabel = new HashMap<>();
                        textLabel.put("name", "姓名");
                        textLabel.put("value", ZhConverterUtil.toSimple(employeinfo.getEmpname()));
                        textLabels.add(textLabel);
                        textLabel = new HashMap<>();
                        textLabel.put("name", "身份证号");
                        textLabel.put("value", employeinfo.getIdcardno());
                        textLabels.add(textLabel);
                        if (StringUtils.isNotBlank(employeinfo.getBirthday())) {
                            textLabel = new HashMap<>();
                            textLabel.put("name", "出生日期");
                            textLabel.put("value", employeinfo.getBirthday());
                            textLabels.add(textLabel);
                        }
                        if (StringUtils.isNotBlank(employeinfo.getAddress()) && employeinfo.getAddress().length() >= 2) {
                            textLabel = new HashMap<>();
                            textLabel.put("name", "籍贯");
                            textLabel.put("value", ZhConverterUtil.toSimple(employeinfo.getAddress().substring(0, 2)));
                            textLabels.add(textLabel);
                        }

                        if (dlEmployee != null) {
                            if (StringUtils.isNotBlank(dlEmployee.getAddress())) {
                                textLabel = new HashMap<>();
                                textLabel.put("name", "现住地址");
                                textLabel.put("value", ZhConverterUtil.toSimple(dlEmployee.getAddress()));
                                textLabels.add(textLabel);
                            }
                            if (StringUtils.isNotBlank(dlEmployee.getPhonenumber())) {
                                /*测试环境字段*/
                                textLabel = new HashMap<>();
                                textLabel.put("name", "电话");
                                textLabel.put("value", dlEmployee.getPhonenumber());
                                textLabels.add(textLabel);
                                /*正式环境字段*/
                                textLabel = new HashMap<>();
                                textLabel.put("name", "联系方式");
                                textLabel.put("value", dlEmployee.getPhonenumber());
                                textLabels.add(textLabel);
                            }
                            if (StringUtils.isNotBlank(dlEmployee.getWechatno())) {
                                textLabel = new HashMap<>();
                                textLabel.put("name", "微信");
                                textLabel.put("value", dlEmployee.getWechatno());
                                textLabels.add(textLabel);
                                textLabel = new HashMap<>();
                                textLabel.put("name", "微信号");
                                textLabel.put("value", dlEmployee.getWechatno());
                                textLabels.add(textLabel);
                            }
                            SysApplychannel applychannel = sysApplychannelMapper.selectOne(Wrappers.<SysApplychannel>query().lambda().eq(SysApplychannel::getApplychannelid, dlEmployee.getApplychannel()));
                            if (applychannel != null && StringUtils.isNotBlank(applychannel.getApplychannel())) {
                                textLabel = new HashMap<>();
                                textLabel.put("name", "应聘渠道");
                                textLabel.put("value", ZhConverterUtil.toSimple(applychannel.getApplychannel()));
                                textLabels.add(textLabel);
                            }
                            if (StringUtils.isNotBlank(dlEmployee.getMarriage())) {
                                textLabel = new HashMap<>();
                                textLabel.put("name", "婚姻状况");
                                textLabel.put("value", dlEmployee.getMarriage().trim().equals("1") ? "已婚" : "未婚");
                                textLabels.add(textLabel);
                            }
                            if (StringUtils.isNotBlank(dlEmployee.getIsreligiousbelief())) {
                                textLabel = new HashMap<>();
                                textLabel.put("name", "有无宗教信仰");
                                textLabel.put("value", dlEmployee.getIsreligiousbelief().trim().equals("1") ? "有" : "无");
                                textLabels.add(textLabel);
                            }
                            if (StringUtils.isNotBlank(dlEmployee.getIsreligiousbelief())) {
                                textLabel = new HashMap<>();
                                String religiousBelief = "无";
                                textLabel.put("name", "宗教信仰教派");
                                if (StringUtils.isNotBlank(dlEmployee.getReligiousbelief())) {
                                    if (dlEmployee.getReligiousbelief().trim().equals("1")) {
                                        religiousBelief = "佛教";
                                    } else if (dlEmployee.getReligiousbelief().trim().equals("2")) {
                                        religiousBelief = "伊斯兰教";
                                    } else if (dlEmployee.getReligiousbelief().trim().equals("3")) {
                                        religiousBelief = "基督教";
                                    } else if (dlEmployee.getReligiousbelief().trim().equals("4")) {
                                        religiousBelief = "天主教";
                                    } else if (dlEmployee.getReligiousbelief().trim().equals("5")) {
                                        religiousBelief = "其他";
                                    }
                                }
                                textLabel.put("value", religiousBelief);
                                textLabels.add(textLabel);
                            }
                            if (StringUtils.isNotBlank(employeinfo.getNation())) {
                                textLabel = new HashMap<>();
                                textLabel.put("name", "民族");
                                textLabel.put("value", ZhConverterUtil.toSimple(employeinfo.getNation()));
                                textLabels.add(textLabel);
                            }
                            if (StringUtils.isNotBlank(dlEmployee.getHousehold())) {
                                textLabel = new HashMap<>();
                                textLabel.put("name", "户口性质");
                                textLabel.put("value", dlEmployee.getHousehold().trim().contains("1") ? "城镇" : "农业");
                                textLabels.add(textLabel);
                            }
                            if (StringUtils.isNotBlank(employeinfo.getAddress())) {
                                /*测试环境字段*/
                                textLabel = new HashMap<>();
                                textLabel.put("name", "身份证地址");
                                textLabel.put("value", ZhConverterUtil.toSimple(employeinfo.getAddress()));
                                textLabels.add(textLabel);
                                /*正式环境字段*/
                                textLabel = new HashMap<>();
                                textLabel.put("name", "户籍地址");
                                textLabel.put("value", ZhConverterUtil.toSimple(employeinfo.getAddress()));
                                textLabels.add(textLabel);
                            }
                            if (educations != null && educations.size() > 0) {
                                Education education = educations.get(0);
                                SysEducation education1 = sysEducationMapper.selectOne(Wrappers.<SysEducation>query().lambda().eq(SysEducation::getEduno, education.getEducation()));
                                if (education != null && StringUtils.isNotBlank(education1.getEduname())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "最高学历");
                                    textLabel.put("value", ZhConverterUtil.toSimple(education1.getEduname()));
                                    textLabels.add(textLabel);
                                }
                                if (StringUtils.isNotBlank(education.getCertificate())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "证书1");
                                    textLabel.put("value", education.getCertificate().trim().equals("00") ? "毕业" : "肄业");
                                    textLabels.add(textLabel);
                                }
                                if (StringUtils.isNotBlank(education.getEntrancedate())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "入学日期1");
                                    textLabel.put("value", education.getEntrancedate());
                                    textLabels.add(textLabel);
                                }
                                if (StringUtils.isNotBlank(education.getGraduationdate())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "毕业日期1");
                                    textLabel.put("value", education.getGraduationdate());
                                    textLabels.add(textLabel);
                                }
                                if (StringUtils.isNotBlank(education.getSchool())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "毕业学校1");
                                    textLabel.put("value", ZhConverterUtil.toSimple(education.getSchool()));
                                    textLabels.add(textLabel);
                                }
                            }
                            /**
                             * 家庭成员信息
                             */
                            List<DlFamilies> dlFamilies = dlFamiliesMapper.selectList(Wrappers.<DlFamilies>query().lambda().eq(DlFamilies::getParentid, dlEmployee.getId()));
                            if (dlFamilies != null && dlFamilies.size() > 0) {
                                DlFamilies dlFamilies1 = dlFamilies.get(0);
                                if (StringUtils.isNotBlank(dlFamilies1.getName())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "家庭成员姓名1");
                                    textLabel.put("value", ZhConverterUtil.toSimple(dlFamilies1.getName()));
                                    textLabels.add(textLabel);
                                }
                                SysRelationship sysRelationship = sysRelationshipMapper.selectOne(Wrappers.<SysRelationship>query().lambda().eq(SysRelationship::getRelno, dlFamilies1.getRelationship()));
                                if (sysRelationship != null && StringUtils.isNotBlank(sysRelationship.getRelname())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "家庭成员关系1");
                                    textLabel.put("value", ZhConverterUtil.toSimple(sysRelationship.getRelname()));
                                    textLabels.add(textLabel);
                                }
                                if (StringUtils.isNotBlank(dlFamilies1.getOccupation())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "家庭成员职业1");
                                    textLabel.put("value", ZhConverterUtil.toSimple(dlFamilies1.getOccupation()));
                                    textLabels.add(textLabel);
                                }
                                if (StringUtils.isNotBlank(dlFamilies1.getPhonenumber())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "家庭成员电话1");
                                    textLabel.put("value", dlFamilies1.getPhonenumber());
                                    textLabels.add(textLabel);
                                }
                                if (StringUtils.isNotBlank(dlFamilies1.getAddress())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "家庭成员地址1");
                                    textLabel.put("value", ZhConverterUtil.toSimple(dlFamilies1.getAddress()));
                                    textLabels.add(textLabel);
                                }
                                if (dlFamilies.size() > 1) {
                                    DlFamilies dlFamilies2 = dlFamilies.get(1);
                                    if (StringUtils.isNotBlank(dlFamilies2.getName())) {
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "家庭成员姓名2");
                                        textLabel.put("value", ZhConverterUtil.toSimple(dlFamilies2.getName()));
                                        textLabels.add(textLabel);
                                    }
                                    SysRelationship sysRelationship1 = sysRelationshipMapper.selectOne(Wrappers.<SysRelationship>query().lambda().eq(SysRelationship::getRelno, dlFamilies2.getRelationship()));
                                    if (sysRelationship1 != null && StringUtils.isNotBlank(sysRelationship1.getRelname())) {
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "家庭成员关系2");
                                        textLabel.put("value", ZhConverterUtil.toSimple(sysRelationship1.getRelname()));
                                        textLabels.add(textLabel);
                                    }
                                    if (StringUtils.isNotBlank(dlFamilies2.getOccupation())) {
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "家庭成员职业2");
                                        textLabel.put("value", ZhConverterUtil.toSimple(dlFamilies2.getOccupation()));
                                        textLabels.add(textLabel);
                                    }
                                    if (StringUtils.isNotBlank(dlFamilies2.getPhonenumber())) {
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "家庭成员电话2");
                                        textLabel.put("value", dlFamilies2.getPhonenumber());
                                        textLabels.add(textLabel);
                                    }
                                    if (StringUtils.isNotBlank(dlFamilies2.getAddress())) {
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "家庭成员地址2");
                                        textLabel.put("value", ZhConverterUtil.toSimple(dlFamilies2.getAddress()));
                                        textLabels.add(textLabel);
                                    }
                                }
                            }
                            /**
                             * 三类亲
                             */
                            List<DlRelativesincompany> dlRelativesincompanies = dlRelativesincompanyMapper.selectList(Wrappers.<DlRelativesincompany>query().lambda().eq(DlRelativesincompany::getParentid, dlEmployee.getId()));
                            if (dlRelativesincompanies != null && dlRelativesincompanies.size() > 0) {
                                DlRelativesincompany relativesincompany1 = dlRelativesincompanies.get(0);
                                SysRelationship sysRelationship = sysRelationshipMapper.selectOne(Wrappers.<SysRelationship>query().lambda().eq(SysRelationship::getRelno, relativesincompany1.getRelationship()));
                                if (sysRelationship != null && StringUtils.isNotBlank(sysRelationship.getRelname())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "亲属关系1");
                                    textLabel.put("value", sysRelationship.getRelname());
                                    textLabels.add(textLabel);
                                }
                                if (StringUtils.isNotBlank(relativesincompany1.getName())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "亲属姓名1");
                                    textLabel.put("value", ZhConverterUtil.toSimple(relativesincompany1.getName()));
                                    textLabels.add(textLabel);
                                }
                                if (StringUtils.isNotBlank(relativesincompany1.getDepartment())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "部门1");
                                    textLabel.put("value", ZhConverterUtil.toSimple(relativesincompany1.getDepartment().trim()));
                                    textLabels.add(textLabel);
                                }
                                if (StringUtils.isNotBlank(relativesincompany1.getPhonenumber())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "电话1");
                                    textLabel.put("value", relativesincompany1.getPhonenumber());
                                    textLabels.add(textLabel);
                                }
                                if (StringUtils.isNotBlank(relativesincompany1.getEmpno())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "工号1");
                                    textLabel.put("value", relativesincompany1.getEmpno());
                                    textLabels.add(textLabel);
                                }
                                if (dlRelativesincompanies.size() > 1) {
                                    DlRelativesincompany relativesincompany2 = dlRelativesincompanies.get(1);
                                    SysRelationship sysRelationship1 = sysRelationshipMapper.selectOne(Wrappers.<SysRelationship>query().lambda().eq(SysRelationship::getRelno, relativesincompany1.getRelationship()));
                                    if (sysRelationship1 != null && StringUtils.isNotBlank(sysRelationship1.getRelname())) {
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "亲属关系2");
                                        textLabel.put("value", sysRelationship1.getRelname());
                                        textLabels.add(textLabel);
                                    }
                                    if (StringUtils.isNotBlank(relativesincompany2.getName())) {
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "亲属姓名2");
                                        textLabel.put("value", ZhConverterUtil.toSimple(relativesincompany2.getName()));
                                        textLabels.add(textLabel);
                                    }
                                    if (StringUtils.isNotBlank(relativesincompany2.getDepartment())) {
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "部门2");
                                        textLabel.put("value", ZhConverterUtil.toSimple(relativesincompany2.getDepartment().trim()));
                                        textLabels.add(textLabel);
                                    }
                                    if (StringUtils.isNotBlank(relativesincompany2.getPhonenumber())) {
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "电话2");
                                        textLabel.put("value", relativesincompany2.getPhonenumber());
                                        textLabels.add(textLabel);
                                    }
                                    if (StringUtils.isNotBlank(relativesincompany2.getEmpno())) {
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "工号2");
                                        textLabel.put("value", relativesincompany2.getEmpno());
                                        textLabels.add(textLabel);
                                    }
                                }
                            }
                            /**
                             * 工作经历
                             */
                            List<DlWorkexperience> dlWorkexperiences = dlWorkexperienceMapper.selectList(Wrappers.<DlWorkexperience>query().lambda().eq(DlWorkexperience::getParentid, dlEmployee.getId()).orderByDesc(DlWorkexperience::getResignationdate));
                            if (dlWorkexperiences != null && dlWorkexperiences.size() > 0) {
                                DlWorkexperience dlWorkexperience1 = dlWorkexperiences.get(0);
                                if (StringUtils.isNotBlank(dlWorkexperience1.getCompany())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "工作单位1");
                                    textLabel.put("value", ZhConverterUtil.toSimple(dlWorkexperience1.getCompany()));
                                    textLabels.add(textLabel);
                                }
                                if (StringUtils.isNotBlank(dlWorkexperience1.getJob())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "工作岗位1");
                                    textLabel.put("value", ZhConverterUtil.toSimple(dlWorkexperience1.getJob()));
                                    textLabels.add(textLabel);
                                }
                                if (StringUtils.isNotBlank(dlWorkexperience1.getReason())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "离职原因1");
                                    textLabel.put("value", ZhConverterUtil.toSimple(dlWorkexperience1.getReason()));
                                    textLabels.add(textLabel);
                                }
                                if (StringUtils.isNotBlank(dlWorkexperience1.getSalary())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "薪资1");
                                    textLabel.put("value", dlWorkexperience1.getSalary());
                                    textLabels.add(textLabel);
                                }
                                if (dlWorkexperience1.getEmploymentdate() != null) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "最近工作经历开始日期");
                                    LocalDate localDate1 = dlWorkexperience1.getEmploymentdate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                                    textLabel.put("value", localDate1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                                    textLabels.add(textLabel);
                                }
                                if (dlWorkexperience1.getResignationdate() != null) {
                                    textLabel = new HashMap<>();
                                    LocalDate localDate2 = dlWorkexperience1.getResignationdate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                                    textLabel.put("name", "最近工作经历结束日期");
                                    textLabel.put("value", localDate2);
                                    textLabels.add(textLabel);
                                }
                                if (dlWorkexperiences.size() > 1) {
                                    DlWorkexperience dlWorkexperience2 = dlWorkexperiences.get(1);
                                    if (StringUtils.isNotBlank(dlWorkexperience2.getCompany())) {
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "工作单位2");
                                        textLabel.put("value", ZhConverterUtil.toSimple(dlWorkexperience2.getCompany()));
                                        textLabels.add(textLabel);
                                    }
                                    if (StringUtils.isNotBlank(dlWorkexperience2.getJob())) {
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "工作岗位2");
                                        textLabel.put("value", ZhConverterUtil.toSimple(dlWorkexperience2.getJob()));
                                        textLabels.add(textLabel);
                                    }
                                    if (StringUtils.isNotBlank(dlWorkexperience2.getReason())) {
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "离职原因2");
                                        textLabel.put("value", ZhConverterUtil.toSimple(dlWorkexperience2.getReason()));
                                        textLabels.add(textLabel);
                                    }
                                    if (StringUtils.isNotBlank(dlWorkexperience2.getSalary())) {
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "薪资2");
                                        textLabel.put("value", dlWorkexperience2.getSalary());
                                        textLabels.add(textLabel);
                                    }
                                    if (dlWorkexperience2.getEmploymentdate() != null) {
                                        textLabel = new HashMap<>();
                                        LocalDate localDate3 = dlWorkexperience2.getEmploymentdate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                                        textLabel.put("name", "开始日期2");
                                        textLabel.put("value", localDate3);
                                        textLabels.add(textLabel);
                                    }
                                    if (null != dlWorkexperience2.getResignationdate()) {
                                        textLabel = new HashMap<>();
                                        LocalDate localDate4 = dlWorkexperience2.getResignationdate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                                        textLabel.put("name", "结束日期2");
                                        textLabel.put("value", localDate4);
                                        textLabels.add(textLabel);
                                    }
                                }
                            }
                            /**
                             * 犯罪记录
                             */
                            if (StringUtils.isNotBlank(dlEmployee.getCrime())) {
                                textLabel = new HashMap<>();
                                textLabel.put("name", "主动申报个人犯罪记录");
                                textLabel.put("value", dlEmployee.getCrime().trim().equals("1") ? "曾有违法犯罪记录" : "无违法记录或有未满18岁犯罪记录");
                                textLabels.add(textLabel);
                                textLabel = new HashMap<>();
                                textLabel.put("name", "主动申报个人犯罪记录（此项申报不作为录用的判断依据）");
                                textLabel.put("value", dlEmployee.getCrime().trim().equals("1") ? "曾有违法犯罪记录" : "无违法记录或有未满18岁犯罪记录");
                                textLabels.add(textLabel);
                            }
                            if (StringUtils.isNotBlank(dlEmployee.getCrimestatus())) {
                                textLabel = new HashMap<>();
                                textLabel.put("name", "请简述违法犯罪状况");
                                textLabel.put("value", ZhConverterUtil.toSimple(dlEmployee.getCrimestatus()));
                                textLabels.add(textLabel);
                            }
                            /**
                             *紧急联系人信息
                             */
                            List<DlLinkman> dlLinkmans = dlLinkmanMapper.selectList(Wrappers.<DlLinkman>query().lambda().eq(DlLinkman::getParentid, dlEmployee.getId()).orderByDesc(DlLinkman::getId));
                            if (dlLinkmans != null && dlLinkmans.size()>0) {
                                DlLinkman dlLinkman = dlLinkmans.get(0);
                                if (StringUtils.isNotBlank(dlLinkman.getName())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "紧急联络人姓名");
                                    textLabel.put("value", ZhConverterUtil.toSimple(dlLinkman.getName()));
                                    textLabels.add(textLabel);
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "紧急联络人");
                                    textLabel.put("value", ZhConverterUtil.toSimple(dlLinkman.getName()));
                                    textLabels.add(textLabel);
                                }
                                if (StringUtils.isNotBlank(dlLinkman.getPhonenumber())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "紧急联络人电话");
                                    textLabel.put("value", dlLinkman.getPhonenumber());
                                    textLabels.add(textLabel);
                                }
                                if (StringUtils.isNotBlank(dlLinkman.getAddress())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "紧急联络人地址");
                                    textLabel.put("value", ZhConverterUtil.toSimple(dlLinkman.getAddress()));
                                    textLabels.add(textLabel);
                                }
                                SysRelationship relationship = sysRelationshipMapper.selectOne(Wrappers.<SysRelationship>query().lambda().eq(SysRelationship::getRelno, dlLinkman.getRelationship()));
                                if (null != relationship && StringUtils.isNotBlank(relationship.getRelname())) {
                                    textLabel = new HashMap<>();
                                    textLabel.put("name", "紧急联络人关系");
                                    textLabel.put("value", relationship.getRelname());
                                    textLabels.add(textLabel);
                                }
                            }
                        }


                        /**
                         * 日期信息(合同/入职/报到
                         */
                        String empIndate = employeinfo.getEmpIndate();
                        if (StringUtils.isNotBlank(empIndate)) {
                            textLabel = new HashMap<>();
                            textLabel.put("name", "入职日期");
                            textLabel.put("value", empIndate);
                            textLabels.add(textLabel);
                            textLabel = new HashMap<>();
                            textLabel.put("name", "报到日");
                            textLabel.put("value", empIndate);
                            textLabels.add(textLabel);

                            textLabel = new HashMap<>();
                            textLabel.put("name", "合约开始日期1");
                            textLabel.put("value", empIndate);
                            textLabels.add(textLabel);

                            if (StringUtils.isNotBlank(employeeinfoNewadd.getContractyear())) {
                                Contractyear contractyear = contractyearMapper.selectOne(Wrappers.<Contractyear>query().lambda().eq(Contractyear::getContractyearid, employeeinfoNewadd.getContractyear()));
                                if (contractyear != null && contractyear.getContractyear() != null) {
                                    if (contractyear.getContractyear().contains("3")) {
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "合约结束日期1");
                                        LocalDate localDate = LocalDate.parse(empIndate, DateTimeFormatter.ofPattern("yyyy-MM-dd")).plusYears(3);
                                        textLabel.put("value", localDate.minusDays(1));
                                        textLabels.add(textLabel);
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "试用期开始日期");
                                        textLabel.put("value", empIndate);
                                        textLabels.add(textLabel);
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "试用期结束日期");
                                        textLabel.put("value", LocalDate.parse(empIndate, DateTimeFormatter.ofPattern("yyyy-MM-dd")).plusMonths(employeeinfoNewadd.getProbation()).minusDays(1));
                                        textLabels.add(textLabel);
                                    } else if (contractyear.getContractyear().contains("5")) {
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "合约结束日期1");
                                        //合约2开始时间
                                        LocalDate localDate = LocalDate.parse(empIndate, DateTimeFormatter.ofPattern("yyyy-MM-dd")).plusMonths(5);
                                        textLabel.put("value", localDate.minusDays(1));
                                        textLabels.add(textLabel);
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "试用期开始日期");
                                        textLabel.put("value", "/");
                                        textLabels.add(textLabel);
                                        textLabel = new HashMap<>();
                                        textLabel.put("name", "试用期结束日期");
                                        textLabel.put("value", "/");
                                        textLabels.add(textLabel);
                                    }
                                }
                            }
                        }
                        /**
                         * 工资
                         */
                        Areasalary areasalary = areasalaryMapper.selectOne(Wrappers.<Areasalary>query().lambda().eq(Areasalary::getAreaid, employeinfo.getAreaid()));
                        if (areasalary != null) {
                            if (areasalary.getSalary() != null) {
                                textLabel = new HashMap<>();
                                textLabel.put("name", "工资");
                                textLabel.put("value", String.valueOf(areasalary.getSalary()));
                                textLabels.add(textLabel);
                                textLabel = new HashMap<>();
                                textLabel.put("name", "薪资");
                                textLabel.put("value", String.valueOf(areasalary.getSalary()));
                                textLabels.add(textLabel);
                            }
                        }

                        /**
                         *工作申请书
                         */
                        Employedept employedept = employedeptMapper.selectEmployedeptByEmpno(employeinfo.getEmpno());
                        if (employedept != null && StringUtils.isNotBlank(employedept.getDeptname())) {
                            textLabel = new HashMap<>();
                            textLabel.put("name", "部门");
                            textLabel.put("value", employedept.getDeptname().trim());
                            textLabels.add(textLabel);
                        }
                        if (StringUtils.isNotBlank(employeinfo.getEmpno())) {
                            textLabel = new HashMap<>();
                            textLabel.put("name", "工号");
                            textLabel.put("value", employeinfo.getEmpno());
                            textLabels.add(textLabel);
                        }
                        if (StringUtils.isNotBlank(employeinfo.getSex())) {
                            textLabel = new HashMap<>();
                            textLabel.put("name", "性别");
                            textLabel.put("value", employeinfo.getSex().trim().equals("M") ? "男" : "女");
                            textLabels.add(textLabel);
                        }

                        /**
                         * 身份证头像
                         */
                        List<Facepicinfo> Facepicinfos = FacepicinfoMapper.selectList(Wrappers.<Facepicinfo>query().lambda().eq(Facepicinfo::getEmpno, employeinfo.getEmpno()));
                        if (Facepicinfos!=null && Facepicinfos.size()>0){
                            Facepicinfo picInfo = Facepicinfos.get(0);
                            String picpath = picInfo.getPicpath();
                            if (StringUtils.isNotBlank(picpath)){
                                byte[] b = new byte[0];
                                try {
                                    b = Files.readAllBytes(Paths.get(picpath));
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                String base64 = Base64.getEncoder().encodeToString(b);
                                imageLabel = new HashMap<>();
                                imageLabel.put("name", "图片");
                                imageLabel.put("value", base64);
                                imageLabels.add(imageLabel);
                            }
                        }
                        /**
                        /**
                         * 组装完成
                         */
                        sendContractInfoMap.put("textLabels", textLabels);
                        sendContractInfoMap.put("imageLabels", imageLabels);
                        String s = JSONObject.toJSONString(sendContractInfoMap);
                        logger.info("发送合同组装参数:" + s);
                        JSONObject jsonObject = JSONObject.parseObject(s);
                        String result = bestSignClient.executeRequest(BestSignConfig.SEND_CONTRACTS_SYNC_V2, "POST", jsonObject);
                        logger.info("员工信息" + employeinfo.getEmpno() + "上上签返回消息:" + result);
                        /**
                         * 更新合同发送状态
                         */
                        JSONObject object = JSONObject.parseObject(result);
                        if (object != null && object.getString("code").equals("0")) {
                            Employeinfo employeinfo1 = new Employeinfo();
                            BeanUtils.copyProperties(employeinfo, employeinfo1);
                            employeinfo1.setContractStatus("Y");
                            employeinfoMapper.updateEmployeinfo(employeinfo1);
                        }else {

                        }
                    } else {
                        logger.info("入职时间为空!!!");
                    }
                }
            }
        }
    }
}
