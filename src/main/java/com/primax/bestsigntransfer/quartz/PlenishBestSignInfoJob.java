package com.primax.bestsigntransfer.quartz;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.houbb.opencc4j.util.ZhConverterUtil;
import com.primax.bestsigntransfer.admin.domain.entity.Employeinfo;
import com.primax.bestsigntransfer.admin.domain.entity.Signcabinet;
import com.primax.bestsigntransfer.admin.domain.to.*;
import com.primax.bestsigntransfer.admin.mapper.*;
import com.primax.bestsigntransfer.config.BestSignConfig;
import com.primax.bestsigntransfer.model.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@EnableScheduling
@DS("HREntryRegistration")
public class PlenishBestSignInfoJob extends BestSignConfig {
    private static final Logger logger = LoggerFactory.getLogger(PlenishBestSignInfoJob.class);

    @Resource
    private EmployeinfoMapper employeinfoMapper;

    @Resource
    private OutcompanyMapper outcompanyMapper;

    @Resource
    private EmployeeinfoNewaddMapper employeeinfoNewaddMapper;

    @Resource
    private SigncabinetMapper signcabinetMapper;

    @Resource
    private AreasalaryMapper areasalaryMapper;

    @Resource
    private EmployedeptMapper employedeptMapper;

    @Resource
    private SapcodeMapper sapcodeMapper;

    @Resource
    private ContractyearMapper contractyearMapper;

    @Resource
    private DlEmployeeMapper dlEmployeeMapper;

    @Resource
    private IdlEmployeeMapper idlEmployeeMapper;
    /**
     * 回传上上签档案柜定时任务
     */
    public void plenishBestSignInfoTask() {
        try {
            /**
             * 档案柜配置
             */
            Signcabinet signcabinetIDLDG = signcabinetMapper.selectOne(Wrappers.<Signcabinet>query().lambda().eq(Signcabinet::getTypes, "IDL").eq(Signcabinet::getStatus, "1").eq(Signcabinet::getArea,"DG"));
            Signcabinet signcabinetDLDG = signcabinetMapper.selectOne(Wrappers.<Signcabinet>query().lambda().eq(Signcabinet::getTypes, "DL").eq(Signcabinet::getStatus, "1").eq(Signcabinet::getArea,"DG"));
            Signcabinet signcabinetIDLCQ = signcabinetMapper.selectOne(Wrappers.<Signcabinet>query().lambda().eq(Signcabinet::getTypes, "IDL").eq(Signcabinet::getStatus, "1").eq(Signcabinet::getArea,"CQ"));
            Signcabinet signcabinetDLCQ = signcabinetMapper.selectOne(Wrappers.<Signcabinet>query().lambda().eq(Signcabinet::getTypes, "DL").eq(Signcabinet::getStatus, "1").eq(Signcabinet::getArea,"CQ"));
            Signcabinet signcabinetIDLKS = signcabinetMapper.selectOne(Wrappers.<Signcabinet>query().lambda().eq(Signcabinet::getTypes, "IDL").eq(Signcabinet::getStatus, "1").eq(Signcabinet::getArea,"KS"));
            Signcabinet signcabinetDLKS = signcabinetMapper.selectOne(Wrappers.<Signcabinet>query().lambda().eq(Signcabinet::getTypes, "DL").eq(Signcabinet::getStatus, "1").eq(Signcabinet::getArea,"KS"));

            List<Employeinfo> employeinfos = employeinfoMapper.selectList(Wrappers.<Employeinfo>query().lambda().eq(Employeinfo::getFilecabinetStatus, "N"));
            if (employeinfos != null && employeinfos.size() > 0) {
                for (Employeinfo employeinfo1 :
                        employeinfos) {
                    /**
                     * 获取员工电话号码(即上上签账号,判断员工类型DL/IDL,获取档案柜id
                     */
                    String account = "";
                    String archiveId = "";
                    String idcardno = employeinfo1.getIdcardno();
                    if (StringUtils.isNotBlank(idcardno)) {

                        List<DlEmployee> employees = dlEmployeeMapper.selectList(Wrappers.<DlEmployee>query().lambda().eq(DlEmployee::getIdentityno, idcardno).orderByDesc(DlEmployee::getCreatetime).isNotNull(DlEmployee::getWechatno));
                        List<IdlEmployee> employeeIdls = idlEmployeeMapper.selectList(Wrappers.<IdlEmployee>query().lambda().eq(IdlEmployee::getIdentityno, idcardno).orderByDesc(IdlEmployee::getCreatetime).isNotNull(IdlEmployee::getWechatno));
                        if (employees != null && employees.size() > 0) {
                            if (employees.get(0) != null && StringUtils.isNotBlank(employees.get(0).getPhonenumber())) {
                                account = employees.get(0).getPhonenumber();
                                logger.info("手机号码"+account+";"+employeinfo1.getAreaname());
                                if (employeinfo1.getAreaname().contains("昆山")){
                                    archiveId = signcabinetDLKS.getCabinet();
                                }else if (employeinfo1.getAreaname().contains("重慶")){
                                    archiveId = signcabinetDLCQ.getCabinet();
                                }else {
                                    archiveId = signcabinetDLDG.getCabinet();
                                }
                            }
                        } else if (employeeIdls != null && employeeIdls.size() > 0) {
                            if (employeeIdls.get(0) != null && StringUtils.isNotBlank(employeeIdls.get(0).getPhonenumber())) {
                                account = employeeIdls.get(0).getPhonenumber();
                                if (employeinfo1.getAreaname().contains("昆山")){
                                    archiveId = signcabinetIDLKS.getCabinet();
                                }else if (employeinfo1.getAreaname().contains("重慶")){
                                    archiveId = signcabinetIDLCQ.getCabinet();
                                }else {
                                    archiveId = signcabinetIDLDG.getCabinet();
                                }
                            }
                        } else {
                            logger.info("回传档案柜补充资料时无法获取员工"+employeinfo1.getEmpno()+"的联系电话,即上上签账号,请检查emp信息是否同步!!!");
                        }
                    }
                    logger.info("档案柜号"+archiveId);
                    /**
                     * 组装数据
                     */
                    List<EmployeeinfoNewadd> employeeinfoNewadds = employeeinfoNewaddMapper.selectList(Wrappers.<EmployeeinfoNewadd>query().lambda().eq(EmployeeinfoNewadd::getEmpno, employeinfo1.getEmpno()).orderByDesc(EmployeeinfoNewadd::getCreatedate));
                    if (StringUtils.isNotBlank(account) && StringUtils.isNotBlank(archiveId)) {
                        Map<String, Object> bestSignInfoMap = new HashMap<>();
                        Map<String, Object> fieldMap;
                        bestSignInfoMap.put("account", account);
                        bestSignInfoMap.put("archiveId", archiveId);
                        bestSignInfoMap.put("name", ZhConverterUtil.toSimple(employeinfo1.getEmpname()));
                        List<Map<String, Object>> list = new ArrayList<>();
                        if (StringUtils.isNotBlank(employeinfo1.getEmpno())) {
                            fieldMap = new HashMap<>();
                            fieldMap.put("proxyCollectionName", "工号");
                            fieldMap.put("content", employeinfo1.getEmpno());
                            list.add(fieldMap);
                        }
                        logger.info("信息1"+list.toString());
                        Employedept employedept = employedeptMapper.selectEmployedeptByEmpno(employeinfo1.getEmpno());
                        if (employedept != null )
                        {
                            if(employedept.getDeptname()!=null && StringUtils.isNotBlank(employedept.getDeptname())) {
                            fieldMap = new HashMap<>();
                            fieldMap.put("proxyCollectionName", "部门");
                            fieldMap.put("content", employedept.getDeptname());
                            list.add(fieldMap);
                            }
                        }
                        else {
                            logger.info("部门无记录");
                            continue;
                        }
                        if (employedept.getFactory() != null && StringUtils.isNotBlank(employedept.getFactory())) {
                            fieldMap = new HashMap<>();
                            fieldMap.put("proxyCollectionName", "厂区");
                            fieldMap.put("content", employedept.getFactory());
                            list.add(fieldMap);
                        }
                        logger.info("信息3"+list.toString());
                        if (StringUtils.isNotBlank(employeinfo1.getEmpTitleName())) {
                            fieldMap = new HashMap<>();
                            fieldMap.put("proxyCollectionName", "职务");
                            fieldMap.put("content", ZhConverterUtil.toSimple(employeinfo1.getEmpTitleName()));
                            list.add(fieldMap);
                        }
                        logger.info("信息4"+list.toString());
                        if (StringUtils.isNotBlank(employeinfo1.getIdcardno())) {
                            fieldMap = new HashMap<>();
                            fieldMap.put("proxyCollectionName", "身份证");
                            fieldMap.put("content", employeinfo1.getIdcardno());
                            list.add(fieldMap);
                        }
                        logger.info("信息5"+list.toString());
                        if (StringUtils.isNotBlank(employeinfo1.getSex())) {
                            fieldMap = new HashMap<>();
                            fieldMap.put("proxyCollectionName", "性别");
                            fieldMap.put("content", employeinfo1.getSex().trim().equals("M") ? "男" : "女");
                            list.add(fieldMap);
                        }
                        logger.info("信息6"+list.toString());
                        if (StringUtils.isNotBlank(employeinfo1.getNation())) {
                            fieldMap = new HashMap<>();
                            fieldMap.put("proxyCollectionName", "民族");
                            fieldMap.put("content", ZhConverterUtil.toSimple(employeinfo1.getNation()));
                            list.add(fieldMap);
                        }
                        logger.info("信息7"+list.toString());
                        if (StringUtils.isNotBlank(employeinfo1.getBirthday())) {
                            fieldMap = new HashMap<>();
                            fieldMap.put("proxyCollectionName", "出生日期");
                            fieldMap.put("content", LocalDate.parse(employeinfo1.getBirthday(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                            list.add(fieldMap);
                        }
                        logger.info("信息8"+list.toString());
                        if (StringUtils.isNotBlank(employeinfo1.getAddress())) {
                            fieldMap = new HashMap<>();
                            fieldMap.put("proxyCollectionName", "身份证地址");
                            fieldMap.put("content", ZhConverterUtil.toSimple(employeinfo1.getAddress()));
                            list.add(fieldMap);
                        }
                        logger.info("信息9"+list.toString());
                        if (StringUtils.isNotBlank(employeinfo1.getAreaid())) {
                            Areasalary areasalary = areasalaryMapper.selectOne(Wrappers.<Areasalary>query().lambda().eq(Areasalary::getAreaid, employeinfo1.getAreaid()).eq(Areasalary::getEmpTitle, employeinfo1.getEmpTitle()));
                            if (areasalary != null) {
                                if (areasalary.getSalary() != null) {
                                    fieldMap = new HashMap<>();
                                    fieldMap.put("proxyCollectionName", "薪资");
                                    fieldMap.put("content", String.valueOf(areasalary.getSalary()));
                                    list.add(fieldMap);
                                }
                            }
                        }
                        logger.info("信息10"+list.toString());
                        if (StringUtils.isNotBlank(employeinfo1.getAddress()) && employeinfo1.getAddress().length() >= 2) {
                            fieldMap = new HashMap<>();
                            fieldMap.put("proxyCollectionName", "籍贯");
                            fieldMap.put("content", ZhConverterUtil.toSimple(employeinfo1.getAddress().substring(0, 2)));
                            list.add(fieldMap);
                        }
                        logger.info("信息11"+list.toString());

                        fieldMap = new HashMap<>();
                        fieldMap.put("proxyCollectionName", "国籍");
                        fieldMap.put("content", "中国");
                        list.add(fieldMap);

                        if (StringUtils.isNotBlank(employeinfo1.getEmpIndate())) {
                            fieldMap = new HashMap<>();
                            fieldMap.put("proxyCollectionName", "合约开始日期1");
                            fieldMap.put("content", LocalDate.parse(employeinfo1.getEmpIndate(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                            list.add(fieldMap);

                            fieldMap = new HashMap<>();
                            fieldMap.put("proxyCollectionName", "入职日期");
                            fieldMap.put("content", LocalDate.parse(employeinfo1.getEmpIndate(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                            list.add(fieldMap);

                        }
                        logger.info("信息12"+list.toString());
                        /**
                         *合约及派遣公司信息
                         */
                        if (employeeinfoNewadds != null&& employeeinfoNewadds.size()>0) {
                            EmployeeinfoNewadd employeeinfoNewadd = employeeinfoNewadds.get(0);
                            if (StringUtils.isNotBlank(employeeinfoNewadd.getContractyear())) {
                                Contractyear contractyear = contractyearMapper.selectOne(Wrappers.<Contractyear>query().lambda().eq(Contractyear::getContractyearid, employeeinfoNewadd.getContractyear()));
                                if (contractyear != null && contractyear.getContractyear() != null) {
                                    if (contractyear.getContractyear().contains("3")) {
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "合约结束日期1");
                                        //合约2开始时间
                                        LocalDate localDate = LocalDate.parse(employeinfo1.getEmpIndate(), DateTimeFormatter.ofPattern("yyyy-MM-dd")).plusYears(3);
                                        fieldMap.put("content", localDate.minusDays(1));
                                        list.add(fieldMap);
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "合约开始日期2");
                                        fieldMap.put("content", localDate);
                                        list.add(fieldMap);
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "合约结束日期2");
                                        fieldMap.put("content", localDate.plusYears(3).minusDays(1));
                                        list.add(fieldMap);
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "合约开始日期3");
                                        fieldMap.put("content", localDate.plusYears(3));
                                        list.add(fieldMap);
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "合约结束日期3");
                                        fieldMap.put("content", LocalDate.parse("9999-12-31", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                                        list.add(fieldMap);
                                        if (StringUtils.isNotBlank(employeinfo1.getEmpIndate())) {
                                            fieldMap = new HashMap<>();
                                            fieldMap.put("proxyCollectionName", "试用期开始日期");
                                            fieldMap.put("content", employeinfo1.getEmpIndate());
                                            list.add(fieldMap);
                                            fieldMap = new HashMap<>();
                                            fieldMap.put("proxyCollectionName", "试用期结束日期");
                                            fieldMap.put("content", LocalDate.parse(employeinfo1.getEmpIndate(), DateTimeFormatter.ofPattern("yyyy-MM-dd")).plusMonths(employeeinfoNewadd.getProbation()).minusDays(1));
                                            list.add(fieldMap);
                                        }
                                    } else if (contractyear.getContractyear().contains("5")) {
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "合约结束日期1");
                                        //合约2开始时间
                                        LocalDate localDate = LocalDate.parse(employeinfo1.getEmpIndate(), DateTimeFormatter.ofPattern("yyyy-MM-dd")).plusMonths(5);
                                        fieldMap.put("content", localDate.minusDays(1));
                                        list.add(fieldMap);
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "合约开始日期2");
                                        fieldMap.put("content", localDate);
                                        list.add(fieldMap);
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "合约结束日期2");
                                        fieldMap.put("content", localDate.plusMonths(5).minusDays(1));
                                        list.add(fieldMap);
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "试用期开始日期");
                                        fieldMap.put("content", "/");
                                        list.add(fieldMap);
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "试用期结束日期");
                                        fieldMap.put("content", "/");
                                        list.add(fieldMap);
                                    }
                                }
                            }

                            /*Contractyear contractyear = contractyearMapper.selectOne(Wrappers.<Contractyear>query().lambda().eq(Contractyear::getContractyearid, employeeinfoNewadd.getContractyear()));
                            if (StringUtils.isNotBlank(contractyear.getContractyear())){
                                fieldMap = new HashMap<>();
                                fieldMap.put("proxyCollectionName", "合约签订年限1");
                                fieldMap.put("content", ZhConverterUtil.toSimple(contractyear.getContractyearid()+"_"+contractyear.getContractyear()));
                                list.add(fieldMap);
                            }*/
                            //是否保留公司名字繁体
                            List<Sapcode> sapcodes = sapcodeMapper.selectList(Wrappers.<Sapcode>query().lambda().eq(Sapcode::getContractunitcode, employeeinfoNewadd.getContractunitcode()));
                            if (sapcodes != null && sapcodes.size() > 0) {
                                Sapcode sapcode = sapcodes.get(0);
                                if (StringUtils.isNotBlank(sapcode.getContractunit())) {
                                    fieldMap = new HashMap<>();
                                    fieldMap.put("proxyCollectionName", "合约签署单位");
                                    fieldMap.put("content", ZhConverterUtil.toSimple(sapcode.getContractunit()));
                                    list.add(fieldMap);
                                }
                            }
                            //派遣员工
                            String usertype = employeeinfoNewadd.getUsertype().trim();
                            String salary = employeeinfoNewadd.getSalary().trim();
                            //&& (salary.equals("D1") || salary.equals("D3"))
                            if (usertype.equals("5")) {
                                Outcompany outcompany = outcompanyMapper.selectOne(Wrappers.<Outcompany>query().lambda().eq(Outcompany::getOutcompanyid, employeeinfoNewadd.getOutcompanyid()));
                                if (outcompany != null) {
                                    if (StringUtils.isNotBlank(outcompany.getOutcompanyname())) {
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "外服人力服务公司");
                                        fieldMap.put("content", ZhConverterUtil.toSimple(outcompany.getOutcompanyname()));
                                        list.add(fieldMap);
                                    }
                                    if (StringUtils.isNotBlank(outcompany.getOperator())) {
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "外服人力公司经办人");
                                        fieldMap.put("content", ZhConverterUtil.toSimple(outcompany.getOperator()));
                                        list.add(fieldMap);
                                    }
                                    if (StringUtils.isNotBlank(outcompany.getContact())) {
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "外服人力公司经办人联系方式");
                                        fieldMap.put("content", outcompany.getContact());
                                        list.add(fieldMap);
                                    }

                                    if (StringUtils.isNotBlank(outcompany.getCorporation())) {
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "公司法人代表");
                                        fieldMap.put("content", ZhConverterUtil.toSimple(outcompany.getCorporation()));
                                        list.add(fieldMap);
                                    }
                                    if (StringUtils.isNotBlank(outcompany.getAddress())) {
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "公司注册地址");
                                        fieldMap.put("content", ZhConverterUtil.toSimple(outcompany.getAddress()));
                                        list.add(fieldMap);
                                    }
                                    if (StringUtils.isNotBlank(outcompany.getEconomy())) {
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "公司经济类型");
                                        fieldMap.put("content", ZhConverterUtil.toSimple(outcompany.getEconomy()));
                                        list.add(fieldMap);
                                    }
                                    if (StringUtils.isNotBlank(outcompany.getContactnumber())) {
                                        fieldMap = new HashMap<>();
                                        fieldMap.put("proxyCollectionName", "公司联系电话");
                                        fieldMap.put("content", outcompany.getContactnumber());
                                        list.add(fieldMap);
                                    }
                                }
                            }
                        }

                        logger.info("外派否:" +list.toString());
                        /**
                         * 组装collections,调用
                         */
                        bestSignInfoMap.put("collections", list);
                        String s = JSONObject.toJSONString(bestSignInfoMap);
                        logger.info("回填档案柜组装参数:" + s);
                        JSONObject jsonObject = JSONObject.parseObject(s);
                        String result = bestSignClient.executeRequest(BestSignConfig.PERSON_PROXY_COLLECTION_PATH, "POST", jsonObject);
                        logger.info("员工信息" + employeinfo1.getEmpno() + "上上签返回消息:" + result);

                        /**
                         * 更新回填档案柜状态
                         */
                        JSONObject object = JSONObject.parseObject(result);
                        if (object != null && object.getString("code").equals("0")) {
                            Employeinfo employeinfo = new Employeinfo();
                            BeanUtils.copyProperties(employeinfo1, employeinfo);
                            employeinfo.setFilecabinetStatus("Y");
                            employeinfoMapper.updateEmployeinfo(employeinfo);
                        }
                    }
                }
            }

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }
}
