package com.primax.bestsigntransfer.admin.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.primax.bestsigntransfer.admin.domain.entity.*;
import com.primax.bestsigntransfer.admin.domain.to.PersonCollectionResult;
import com.primax.bestsigntransfer.admin.mapper.*;
import com.primax.bestsigntransfer.admin.service.BestSignTransferService;
import com.primax.bestsigntransfer.model.RegularUtils;
import com.primax.bestsigntransfer.model.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *下载上上签个人档案柜
 */
@Service
public class BestSignTransferServiceImpl implements BestSignTransferService {

    @Resource
    private DisabledindividualsMapper disabledindividualsMapper;

    @Resource
    private EducationIdlMapper educationIdlMapper;

    @Resource
    private EducationMapper educationMapper;

    @Resource
    private EmployeeIdlMapper employeeIdlMapper;

    @Resource
    private EmployeeMapper employeeMapper;

    @Resource
    private EmployeePhoneMapper employeePhoneMapper;

    @Resource
    private ExpectworkIdlMapper expectworkIdlMapper;

    @Resource
    private FamiliesIdlMapper familiesIdlMapper;

    @Resource
    private FamiliesMapper familiesMapper;

    @Resource
    private FriendIdlMapper friendIdlMapper;

    @Resource
    private HrentryforempnoMapper hrentryforempnoMapper;

    @Resource
    private IdentitynotMapper identitynotMapper;

    @Resource
    private LanguageIdlMapper languageIdlMapper;

    @Resource
    private LicenseIdlMapper licenseIdlMapper;

    @Resource
    private LinkmanIdlMapper linkmanIdlMapper;

    @Resource
    private LinkmanMapper linkmanMapper;

    @Resource
    private OthercompanyIdlMapper othercompanyIdlMapper;

    @Resource
    private RelativesincompanyIdlMapper relativesincompanyIdlMapper;

    @Resource
    private RelativesincompanyMapper relativesincompanyMapper;

    @Resource
    private ReligiousactivitiesMapper religiousactivitiesMapper;

    @Resource
    private SupplierIdlMapper supplierIdlMapper;

    @Resource
    private VaccineIdlMapper vaccineIdlMapper;

    @Resource
    private VaccineMapper vaccineMapper;

    @Resource
    private WorkexperienceIdlMapper workexperienceIdlMapper;

    @Resource
    private WorkexperienceMapper workexperienceMapper;

    /**
     * 东莞下载上上签个人资料到入职信息化
     *
     * @param results,type
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    @DS("DL_Inauguration_DG")
    public Integer addInaugurationInfoDG(List<PersonCollectionResult> results, String type,String identity) {
        return this.packageInaugurationInfo(results, type,"DG",identity);
    }

    /**
     * 重庆下载上上签个人资料到入职信息化
     *
     * @param results,type
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    @DS("DL_Inauguration_CQ")
    public Integer addInaugurationInfoCQ(List<PersonCollectionResult> results, String type,String identity) {
        return this.packageInaugurationInfo(results, type,"CQ",identity);
    }

    /**
     * 昆山下载上上签个人资料到入职信息化
     *
     * @param results,type
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    @DS("DL_Inauguration_KS")
    public Integer addInaugurationInfoKS(List<PersonCollectionResult> results, String type,String identity) {
        return this.packageInaugurationInfo(results, type,"KS",identity);
    }

    /**
     * 组装信息
     *
     * @param results
     * @return
     */
    public Integer packageInaugurationInfo(List<PersonCollectionResult> results, String type,String area,String identity) {
        //收集到入职信息化
        String uid = UUID.randomUUID().toString().toUpperCase();
        Employee employee = new Employee();
        employee.setId(uid);
        employee.setArea(area);
        EmployeeIdl employeeIdl = new EmployeeIdl();
        employeeIdl.setId(uid);
        employeeIdl.setArea(area);
        Linkman linkman = new Linkman();
        LinkmanIdl linkmanIdl = new LinkmanIdl();

        Families families = new Families();
        FamiliesIdl familiesIdl = new FamiliesIdl();
        Families families1 = new Families();
        FamiliesIdl familiesIdl1 = new FamiliesIdl();

        //dl和idl都是educationIdl
        Education education = new Education();
        Education education1 = new Education();
        EducationIdl educationIdl = new EducationIdl();
        EducationIdl educationIdl1 = new EducationIdl();

        Workexperience workexperience = new Workexperience();
        Workexperience workexperience1 = new Workexperience();
        Workexperience workexperience2 = new Workexperience();
        WorkexperienceIdl workexperienceIdl = new WorkexperienceIdl();
        WorkexperienceIdl workexperienceIdl1 = new WorkexperienceIdl();
        WorkexperienceIdl workexperienceIdl2 = new WorkexperienceIdl();

        LanguageIdl languageIdl = new LanguageIdl();
        LanguageIdl languageIdl1 = new LanguageIdl();
        LanguageIdl languageIdl2 = new LanguageIdl();
        LanguageIdl languageIdl3 = new LanguageIdl();
        LanguageIdl languageIdl4 = new LanguageIdl();
        LanguageIdl languageIdl5 = new LanguageIdl();
        LanguageIdl languageIdl6 = new LanguageIdl();
        LanguageIdl languageIdl7 = new LanguageIdl();
        LanguageIdl languageIdl8 = new LanguageIdl();
        LanguageIdl languageIdl9 = new LanguageIdl();
        LanguageIdl languageIdl10 = new LanguageIdl();
        LanguageIdl languageIdl11 = new LanguageIdl();

        ExpectworkIdl expectworkIdl = new ExpectworkIdl();

        OthercompanyIdl othercompanyIdl = new OthercompanyIdl();
        OthercompanyIdl othercompanyIdl1 = new OthercompanyIdl();

        SupplierIdl supplierIdl = new SupplierIdl();
        SupplierIdl supplierIdl1 = new SupplierIdl();

        Relativesincompany relativesInCompany = new Relativesincompany();
        Relativesincompany relativesInCompany1 = new Relativesincompany();
        Relativesincompany relativesInCompany2 = new Relativesincompany();
        RelativesincompanyIdl relativesincompanyIdl = new RelativesincompanyIdl();
        RelativesincompanyIdl relativesincompanyIdl1 = new RelativesincompanyIdl();
        RelativesincompanyIdl relativesincompanyIdl2 = new RelativesincompanyIdl();

        Religiousactivities religiousactivities = new Religiousactivities();

        Disabledindividuals disabledIndividuals = new Disabledindividuals();

        Vaccine vaccine = new Vaccine();
        VaccineIdl vaccineIdl = new VaccineIdl();

        EmployeePhone employeePhone = new EmployeePhone();
        EmployeePhone employeePhone1 = new EmployeePhone();
        EmployeePhone employeePhone2 = new EmployeePhone();
        EmployeePhone employeePhone3 = new EmployeePhone();
        EmployeePhone employeePhone4 = new EmployeePhone();
        EmployeePhone employeePhone5 = new EmployeePhone();
        EmployeePhone employeePhone6 = new EmployeePhone();

        DateTimeFormatter ft = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        /**
         * 状态
         */
        Boolean otherCompanyStatus = false;
        Boolean supplierStatus = false;
        Boolean relativesStatus = false;
        Boolean religiousActivitiesStatus = false;
        Boolean disabledIndividualsStatus = false;
        Boolean vaccineStatus = false;
        String content,collectionName;
        for (PersonCollectionResult result1 :
                results) {
            collectionName = result1.getCollectionName();
            content = result1.getContent().replace(" ","");
            //处理带标记的需sap采集数据
            if (StringUtils.isNotBlank(content) && !content.equals("[]")) {
                if (!collectionName.contains("微信号")){
                    content = RegularUtils.regularFormat(content);
                }
                switch (collectionName) {
                    case "联系方式":
                        employee.setPhonenumber(content);
                        employeeIdl.setPhonenumber(content);
                        break;
                    case "姓名":
                        employee.setName(content);
                        employeeIdl.setName(content);
                        break;
                    case "身份证号":
                        if (StringUtils.isNotBlank(identity)){
                            content = identity;
                        }
                        employee.setIdentityno(content);
                        employeeIdl.setIdentityno(content);
                        vaccine.setIdentityno(content);
                        vaccineIdl.setIdentityno(content);
                        break;
                    case "微信号":
                        employee.setWechatno(content);
                        employeeIdl.setWechatno(content);
                        break;
                    case "户口性质":
                        employee.setHousehold(content);
                        break;
                    case "身高":
                        employee.setStature(content);
                        employeeIdl.setStature(content);
                        break;
                    case "体重":
                        employee.setWeight(content);
                        employeeIdl.setWeight(content);
                        break;
                    case "现住地址":
                        employee.setAddress(content);
                        employeeIdl.setAddress(content);
                        break;
                    case "婚姻状况":
                        employee.setMarriage(content);
                        employeeIdl.setMarriage(content);
                        break;
                    case "宣传管道":
                        employee.setPropaganda(content);
                        employeeIdl.setPropaganda(content);
                        break;
                    case "应聘渠道":
                        employee.setApplychannel(content);
                        employeeIdl.setApplychannel(content);
                        break;
                    case "政治面貌":
                        employee.setPliticsstatus(content);
                        employeeIdl.setPliticsstatus(content);
                        break;
                    case "紧急联络人":
                        linkman.setName(content);
                        linkmanIdl.setName(content);
                        break;
                    case "紧急联络人电话":
                        linkman.setPhonenumber(content);
                        linkmanIdl.setPhonenumber(content);
                        break;
                    case "紧急联络人关系":
                        linkman.setRelationship(Long.valueOf(content));
                        linkmanIdl.setRelationship(Long.valueOf(content));
                        break;
                    case "紧急联络人地址":
                        linkman.setAddress(content);
                        linkmanIdl.setAddress(content);
                        break;
                    case "家庭成员1":
                        families.setRelationship(Long.valueOf(content));
                        familiesIdl.setRelationship(Long.valueOf(content));
                        break;
                    case "姓名1":
                        families.setName(content);
                        familiesIdl.setName(content);
                        break;
                    case "性别1":
                        families.setGender(content);
                        familiesIdl.setGender(content);
                        break;
                    case "家庭成员工作单位1":
                        families.setWorkunit(content);
                        familiesIdl.setWorkunit(content);
                        break;
                    case "家庭成员工作岗位1":
                        families.setOccupation(content);
                        familiesIdl.setOccupation(content);
                        break;
                    case "联系电话1":
                        families.setPhonenumber(content);
                        familiesIdl.setPhonenumber(content);
                        break;
                    case "地址":
                    case "地址1":
                        families.setAddress(content);
                        familiesIdl.setAddress(content);
                        break;
                    case "（是否）本公司三类亲1":
                        if (content.contains("是")) {
                            families.setRelative("X");
                            familiesIdl.setRelative("X");
                        }
                        break;
                    case "家庭成员2":
                        families1.setRelationship(Long.valueOf(content));
                        familiesIdl1.setRelationship(Long.valueOf(content));
                        break;
                    case "姓名2":
                        families1.setName(content);
                        familiesIdl1.setName(content);
                        break;
                    case "性别2":
                        families1.setGender(content);
                        familiesIdl1.setGender(content);
                        break;
                    case "家庭成员工作单位2":
                        families1.setWorkunit(content);
                        familiesIdl1.setWorkunit(content);
                        break;
                    case "家庭成员工作岗位2":
                        families1.setOccupation(content);
                        familiesIdl1.setOccupation(content);
                        break;
                    case "联系电话2":
                        families1.setPhonenumber(content);
                        familiesIdl1.setPhonenumber(content);
                        break;
                    case "地址2":
                        families1.setAddress(content);
                        familiesIdl1.setAddress(content);
                        break;
                    case "（是否）本公司三类亲2":
                        if (content.contains("是")) {
                            families1.setRelative("X");
                            familiesIdl1.setRelative("X");
                        }
                        break;
                    case "最高学历":
                        education.setEducation(content);
                        educationIdl.setEducation(content);
                        employee.setEducation(content);
                        break;
                    case "入学日期1":
                        //Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant())
                        educationIdl.setEntrancedate(content);
                        education.setEntrancedate(content);
                        break;
                    case "毕业日期1":
//                        Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant())
                        educationIdl.setGraduationdate(content);
                        education.setGraduationdate(content);
                        break;
                    case "毕业学校1":
                        educationIdl.setSchool(content);
                        education.setSchool(content);
                        break;
                    case "证书1":
                        educationIdl.setCertificate(content);
                        education.setCertificate(content);
                        break;
                    case "所学专业1":
                        educationIdl.setSubject(content);
                        education.setSubject(content);
                        break;
                    case "学位1":
                        educationIdl.setDegree(content);
                        education.setDegree(content);
                        break;
                    case "学习形式1":
                        educationIdl.setStudymode(content);
                        education.setStudymode(content);
                        break;
                    case "次高学历":
                        educationIdl1.setEducation(content);
                        education1.setEducation(content);
                        break;
                    case "入学日期2":
                        educationIdl1.setEntrancedate(content);
                        education1.setEntrancedate(content);
                        break;
                    case "毕业日期2":
                        educationIdl1.setGraduationdate(content);
                        education1.setGraduationdate(content);
                        break;
                    case "毕业学校2":
                        educationIdl1.setSchool(content);
                        education1.setSchool(content);
                        break;
                    case "证书2":
                        educationIdl1.setCertificate(content);
                        education1.setCertificate(content);
                        break;
                    case "所学专业2":
                        educationIdl1.setSubject(content);
                        education1.setSubject(content);
                        break;
                    case "学位2":
                        educationIdl1.setDegree(content);
                        education1.setDegree(content);
                        break;
                    case "学习形式2":
                        educationIdl1.setStudymode(content);
                        education1.setStudymode(content);
                        break;
                    case "最近工作经历开始日期":
                    case "开始日期1":
                        workexperience.setEmploymentdate(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        workexperienceIdl.setEmploymentdate(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        break;
                    case "最近工作经历结束日期":
                    case "结束日期1":
                        workexperience.setResignationdate(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        workexperienceIdl.setResignationdate(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        break;
                    case "工作单位1":
                        workexperience.setCompany(content);
                        workexperienceIdl.setCompany(content);
                        break;
                    case "工作部门1":
                        workexperience.setDepartment(content);
                        workexperienceIdl.setDepartment(content);
                        break;
                    case "工作岗位1":
                        workexperience.setJob(content);
                        workexperienceIdl.setJob(content);
                        break;
                    case "薪资1":
                        workexperience.setSalary(content);
                        workexperienceIdl.setSalary(content);
                        break;
                    case "离职原因1":
                        workexperience.setReason(content);
                        workexperienceIdl.setReason(content);
                        break;
                    case "开始日期2":
                        workexperience1.setEmploymentdate(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        workexperienceIdl1.setEmploymentdate(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        break;
                    case "结束日期2":
                        workexperience1.setResignationdate(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        workexperienceIdl1.setResignationdate(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        break;
                    case "工作单位2":
                        workexperience1.setCompany(content);
                        workexperienceIdl1.setCompany(content);
                        break;
                    case "工作部门2":
                        workexperience1.setDepartment(content);
                        workexperienceIdl1.setDepartment(content);
                        break;
                    case "工作岗位2":
                        workexperience1.setJob(content);
                        workexperienceIdl1.setJob(content);
                        break;
                    case "薪资2":
                        workexperience1.setSalary(content);
                        workexperienceIdl1.setSalary(content);
                        break;
                    case "离职原因2":
                        workexperience1.setReason(content);
                        workexperienceIdl1.setReason(content);
                        break;
                    case "开始日期3":
                        workexperience2.setEmploymentdate(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        workexperienceIdl2.setEmploymentdate(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        break;
                    case "结束日期3":
                        workexperience2.setResignationdate(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        workexperienceIdl2.setResignationdate(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        break;
                    case "工作单位3":
                        workexperience2.setCompany(content);
                        workexperienceIdl2.setCompany(content);
                        break;
                    case "工作部门3":
                        workexperience2.setDepartment(content);
                        workexperienceIdl2.setDepartment(content);
                        break;
                    case "工作岗位3":
                        workexperience2.setJob(content);
                        workexperienceIdl2.setJob(content);
                        break;
                    case "薪资3":
                        workexperience2.setSalary(content);
                        workexperienceIdl2.setSalary(content);
                        break;
                    case "离职原因3":
                        workexperience2.setReason(content);
                        workexperienceIdl2.setReason(content);
                        break;
//                case "人员类别":
//                    break;
                    case "个人电子邮件":
                        employeeIdl.setEmail(content);
                        break;
                    case "语言程度":
                        employeeIdl.setLanguagelevel(content);
                        break;
                    case "01_英文：听":
                        languageIdl.setLanguage("01");
                        languageIdl.setLanguageability("01");
                        languageIdl.setLanguagelevel(content);
                        break;
                    case "02_英文：说":
                        languageIdl1.setLanguage("01");
                        languageIdl1.setLanguageability("02");
                        languageIdl1.setLanguagelevel(content);
                        break;
                    case "03_英文：读":
                        languageIdl2.setLanguage("01");
                        languageIdl2.setLanguageability("03");
                        languageIdl2.setLanguagelevel(content);
                        break;
                    case "04_英文：写":
                        languageIdl3.setLanguage("01");
                        languageIdl3.setLanguageability("04");
                        languageIdl4.setLanguagelevel(content);
                        break;
                    case "01_日文：听":
                        languageIdl4.setLanguage("02");
                        languageIdl4.setLanguageability("01");
                        languageIdl4.setLanguagelevel(content);
                        break;
                    case "02_日文：说":
                        languageIdl5.setLanguage("02");
                        languageIdl5.setLanguageability("02");
                        languageIdl5.setLanguagelevel(content);
                        break;
                    case "03_日文：读":
                        languageIdl6.setLanguage("02");
                        languageIdl6.setLanguageability("03");
                        languageIdl6.setLanguagelevel(content);
                        break;
                    case "04_日文：写":
                        languageIdl7.setLanguage("02");
                        languageIdl7.setLanguageability("04");
                        languageIdl7.setLanguagelevel(content);
                        break;
                    case "01_其他：听":
                        languageIdl8.setLanguage("03");
                        languageIdl8.setLanguageability("01");
                        languageIdl8.setLanguagelevel(content);
                        break;
                    case "02_其他：说":
                        languageIdl9.setLanguage("03");
                        languageIdl9.setLanguageability("02");
                        languageIdl9.setLanguagelevel(content);
                        break;
                    case "03_其他：读":
                        languageIdl10.setLanguage("03");
                        languageIdl10.setLanguageability("03");
                        languageIdl10.setLanguagelevel(content);
                        break;
                    case "04_其他：写":
                        languageIdl11.setLanguage("03");
                        languageIdl11.setLanguageability("04");
                        languageIdl11.setLanguagelevel(content);
                        break;
                    case "详述重要工作经验或受训记录":
                        expectworkIdl.setWorkexperience(content);
                        break;
                    case "您目前是否在除本公司外的任何企业或商家中担任负责人或其他职务？（如法人、董事、监事、高级管理人员……）":
                        if (content.contains("是")) {
                            otherCompanyStatus = true;
                        }
                        break;
                    case "企业或商家名称1":
                        othercompanyIdl.setCompany(content);
                        break;
                    case "业务活动类型1":
                        othercompanyIdl.setActivitytype(content);
                        break;
                    case "担任职务1":
                        othercompanyIdl.setJob(content);
                        break;
                    case "任职期间1":
                        othercompanyIdl.setTermoffice(content);
                        break;
                    case "企业或商家名称2":
                        othercompanyIdl1.setCompany(content);
                        break;
                    case "业务活动类型2":
                        othercompanyIdl1.setActivitytype(content);
                        break;
                    case "担任职务2":
                        othercompanyIdl1.setJob(content);
                        break;
                    case "任职期间2":
                        othercompanyIdl1.setTermoffice(content);
                        break;
                    case "您是否有亲属或朋友或重要关系人是本公司供货商、客户（经销商）？":
                        if (content.contains("是")) {
                            supplierStatus = true;
                        }
                        break;
                    case "对方姓名1":
                        supplierIdl.setNamepartner(content);
                        break;
                    case "对方单位1":
                        supplierIdl.setUnit(content);
                        break;
                    case "关系1":
                        supplierIdl.setRelationship(content);
                        break;
                    case "对方姓名2":
                        supplierIdl1.setNamepartner(content);
                        break;
                    case "对方单位2":
                        supplierIdl1.setUnit(content);
                        break;
                    case "关系2":
                        supplierIdl1.setRelationship(content);
                        break;
//                    case "除上述问题涉及关系外，您及您的亲属与本公司或本公司供货商、客户及竞争对手是否存在，可能对您在本公司工作产生重大影响的其他利害关系？":
//                        break;
                    case "请说明：":
                        supplierIdl.setExplain(content);
                        supplierIdl1.setExplain(content);
                        break;
                    case "您在本公司是否有亲属关系？":
                        if (content.contains("是")) {
                            relativesStatus = true;
                        }
                        break;
                    case "亲属姓名1":
                        relativesInCompany.setName(content);
                        relativesincompanyIdl.setName(content);
                        break;
                    case "亲属关系1":
                        relativesInCompany.setRelationship(Long.valueOf(content));
                        relativesincompanyIdl.setRelationship(Long.valueOf(content));
                        break;
                    case "部门1":
                        relativesInCompany.setDepartment(content);
                        relativesincompanyIdl.setDepartment(content);
                        break;
                    case "工号1":
                        relativesInCompany.setEmpno(content);
                        relativesincompanyIdl.setEmpno(content);
                        break;
                    case "职务1":
                        relativesInCompany.setJob(content);
                        relativesincompanyIdl.setJob(content);
                        break;
                    case "电话1":
                        relativesInCompany.setPhonenumber(content);
                        relativesincompanyIdl.setPhonenumber(content);
                        break;
                    case "亲属姓名2":
                        relativesInCompany1.setName(content);
                        relativesincompanyIdl1.setName(content);
                        break;
                    case "亲属关系2":
                        relativesInCompany1.setRelationship(Long.valueOf(content));
                        relativesincompanyIdl1.setRelationship(Long.valueOf(content));
                        break;
                    case "部门2":
                        relativesInCompany1.setDepartment(content);
                        relativesincompanyIdl1.setDepartment(content);
                        break;
                    case "工号2":
                        relativesInCompany1.setEmpno(content);
                        relativesincompanyIdl1.setEmpno(content);
                        break;
                    case "职务2":
                        relativesInCompany1.setJob(content);
                        relativesincompanyIdl1.setJob(content);
                        break;
                    case "电话2":
                        relativesInCompany1.setPhonenumber(content);
                        relativesincompanyIdl1.setPhonenumber(content);
                        break;
                    case "亲属姓名3":
                        relativesInCompany2.setName(content);
                        relativesincompanyIdl2.setName(content);
                        break;
                    case "亲属关系3":
                        relativesInCompany2.setRelationship(Long.valueOf(content));
                        relativesincompanyIdl2.setRelationship(Long.valueOf(content));
                        break;
                    case "部门3":
                        relativesInCompany2.setDepartment(content);
                        relativesincompanyIdl2.setDepartment(content);
                        break;
                    case "工号3":
                        relativesInCompany2.setEmpno(content);
                        relativesincompanyIdl2.setEmpno(content);
                        break;
                    case "职务3":
                        relativesInCompany2.setJob(content);
                        relativesincompanyIdl2.setJob(content);
                        break;
                    case "电话3":
                        relativesInCompany2.setPhonenumber(content);
                        relativesincompanyIdl2.setPhonenumber(content);
                        break;
                    case "有无宗教信仰":
                        employee.setIsreligiousbelief(content);
                        break;
                    case "宗教信仰教派":
                        employee.setReligiousbelief(content);
                        break;
                    case "有无宗教活动":
                        employee.setReligiousactivities(content);
                        if (content.contains("有")){
                            religiousActivitiesStatus = true;
                        }
                        break;
                    case "活动时间":
                        religiousactivities.setTimeactivity(content);
                        break;
                    case "是否需要协助":
                        religiousactivities.setAssist(content);
                        break;
                    case "协助内容":
                        religiousactivities.setAssistancecontent(content);
                        break;
                    case "是否残疾人":
                        if(content.contains("是")){
                            disabledIndividualsStatus = true;
                        }
                        break;
                    case "残疾类别":
                        disabledIndividuals.setDisabilitycategory(content);
                        break;
                    case "残疾等级":
                        disabledIndividuals.setDisabilitylevel(content);
                        break;
                    case "残疾证号":
                        disabledIndividuals.setDisabilityno(content);
                        break;
                    case "残疾证签发日期":
                        disabledIndividuals.setSignaturedate(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        break;
                    case "主动申报个人犯罪记录（此项申报不作为录用的判断依据）":
                    case "主动申报个人犯罪记录":
                        employee.setCrime(content);
                        employeeIdl.setCrime(content);
                        break;
                    case "请简述违法犯罪状况":
                        employee.setCrimestatus(content);
                        employeeIdl.setCrimestatus(content);
                        break;
                    case "疫苗情况调查（是否接种）":
                        vaccine.setIsvaccination(content);
                        vaccineIdl.setIsvaccination(content);
                        vaccineStatus = true;
                        break;
                    case "第一针接种厂家":
                        vaccine.setVaccination1(content);
                        vaccineIdl.setVaccination1(content);
                        break;
                    case "第一针接种日期":
                        vaccine.setVaccination1date(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        vaccineIdl.setVaccination1date(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        break;
                    case "第二针接种厂家":
                        vaccine.setVaccination2(content);
                        vaccineIdl.setVaccination2(content);
                        break;
                    case "第二针接种日期":
                        vaccine.setVaccination2date(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        vaccineIdl.setVaccination2date(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        break;
                    case "第三针接种厂家":
                        vaccine.setVaccination3(content);
                        vaccineIdl.setVaccination3(content);
                        break;
                    case "第三针接种日期":
                        vaccine.setVaccination3date(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        vaccineIdl.setVaccination3date(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        break;
                    case "第四针接种厂家":
                        vaccine.setVaccination4(content);
                        vaccineIdl.setVaccination4(content);
                        break;
                    case "第四针接种日期":
                        vaccine.setVaccination4date(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        vaccineIdl.setVaccination4date(Date.from(LocalDate.parse(content, ft).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        break;
                    case "个人照片":
                        employeePhone.setFilename("个人照片");
                        employeePhone.setPtype("4");
                        employeePhone.setPicturev(content);
                        break;
                    case "身份证人像面":
                        employeePhone1.setFilename("身份证人像面");
                        employeePhone1.setPtype("1");
                        employeePhone1.setPicturev(content);
                        break;
                    case "身份证国徽面":
                        employeePhone2.setFilename("身份证国徽面");
                        employeePhone2.setPtype("2");
                        employeePhone2.setPicturev(content);
                        break;
                    case "学历证明":
                        employeePhone3.setFilename("学历证明");
                        employeePhone3.setPtype("6");
                        employeePhone3.setPicturev(content);
                        break;
                    case "离职证明":
                        employeePhone4.setFilename("离职证明");
                        employeePhone4.setPtype("7");
                        employeePhone4.setPicturev(content);
                        break;
                    case "残疾证":
                        employeePhone5.setFilename("残疾证");
                        employeePhone5.setPtype("3");
                        employeePhone5.setPicturev(content);
                        break;
                    case "身份证照片":
                        employeePhone6.setFilename("身份证照片");
                        employeePhone6.setPtype("5");
                        employeePhone6.setPicturev(content);
                        break;
                }
            }
        }

        /**
         * 采取全删全增,填充新主键
         */
        linkman.setParentid(uid);
        linkmanIdl.setParentid(uid);
        families.setParentid(uid);
        families1.setParentid(uid);
        familiesIdl.setParentid(uid);
        familiesIdl1.setParentid(uid);
        educationIdl.setParentid(uid);
        education.setParentid(uid);
        educationIdl1.setParentid(uid);
        education1.setParentid(uid);
        workexperience.setParentid(uid);
        workexperience1.setParentid(uid);
        workexperience2.setParentid(uid);
        workexperienceIdl.setParentid(uid);
        workexperienceIdl1.setParentid(uid);
        workexperienceIdl2.setParentid(uid);
        languageIdl.setParentid(uid);
        languageIdl1.setParentid(uid);
        languageIdl2.setParentid(uid);
        languageIdl3.setParentid(uid);
        languageIdl4.setParentid(uid);
        languageIdl5.setParentid(uid);
        languageIdl6.setParentid(uid);
        languageIdl7.setParentid(uid);
        languageIdl8.setParentid(uid);
        languageIdl9.setParentid(uid);
        languageIdl10.setParentid(uid);
        languageIdl11.setParentid(uid);
        expectworkIdl.setParentid(uid);
        othercompanyIdl.setParentid(uid);
        othercompanyIdl1.setParentid(uid);
        supplierIdl.setParentid(uid);
        supplierIdl1.setParentid(uid);
        relativesInCompany.setParentid(uid);
        relativesInCompany1.setParentid(uid);
        relativesInCompany2.setParentid(uid);
        relativesincompanyIdl.setParentid(uid);
        relativesincompanyIdl1.setParentid(uid);
        relativesincompanyIdl2.setParentid(uid);
        religiousactivities.setParentid(uid);
        disabledIndividuals.setParentid(uid);
        employeePhone.setParentid(uid);
        employeePhone1.setParentid(uid);
        employeePhone2.setParentid(uid);
        employeePhone3.setParentid(uid);
        employeePhone4.setParentid(uid);
        employeePhone5.setParentid(uid);
        employeePhone6.setParentid(uid);
        vaccine.setParentid(uid);
        vaccineIdl.setParentid(uid);

        List<LanguageIdl> languageIdls = new ArrayList<>();
        languageIdls.add(languageIdl);
        languageIdls.add(languageIdl1);
        languageIdls.add(languageIdl2);
        languageIdls.add(languageIdl3);
        languageIdls.add(languageIdl4);
        languageIdls.add(languageIdl5);
        languageIdls.add(languageIdl6);
        languageIdls.add(languageIdl7);
        languageIdls.add(languageIdl8);
        languageIdls.add(languageIdl9);
        languageIdls.add(languageIdl10);
        languageIdls.add(languageIdl11);

        List<EmployeePhone> pics = new ArrayList<>();
        pics.add(employeePhone);
        pics.add(employeePhone1);
        pics.add(employeePhone2);
        pics.add(employeePhone3);
        pics.add(employeePhone4);
        pics.add(employeePhone5);
        pics.add(employeePhone6);

        /**
         * 判断更新还是新增,拿到手机号(即上上签账号
         */
        String id = "";
        LocalDateTime dateTime = LocalDateTime.now();
        /**
         * DL写入数据库
         */
        if (type.equalsIgnoreCase("DL")) {
            List<Employee> employees = employeeMapper.selectList(Wrappers.<Employee>query().lambda().eq(Employee::getIdentityno, employee.getIdentityno()));
            if (employees != null && employees.size() > 0) {
                id = employees.get(0).getId();
                familiesMapper.delete(Wrappers.<Families>query().lambda().eq(Families::getParentid, id));
                linkmanMapper.delete(Wrappers.<Linkman>query().lambda().eq(Linkman::getParentid, id));
                workexperienceMapper.delete(Wrappers.<Workexperience>query().lambda().eq(Workexperience::getParentid, id));
                relativesincompanyMapper.delete(Wrappers.<Relativesincompany>query().lambda().eq(Relativesincompany::getParentid, id));
                religiousactivitiesMapper.delete(Wrappers.<Religiousactivities>query().lambda().eq(Religiousactivities::getParentid, id));
                vaccineMapper.delete(Wrappers.<Vaccine>query().lambda().eq(Vaccine::getParentid, id));
                educationMapper.delete(Wrappers.<Education>query().lambda().eq(Education::getParentid, id));
                disabledindividualsMapper.delete(Wrappers.<Disabledindividuals>query().lambda().eq(Disabledindividuals::getParentid, id));
            }
            //员工主体信息
            employee.setCreatetime(Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()));
            employee.setUpdatetime(Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()));
            employeeMapper.insertEmployee(employee);
            //家庭信息
            familiesMapper.insertFamilies(families);
            if (StringUtils.isNotBlank(families1.getName())) {
                familiesMapper.insertFamilies(families1);
            }
            //紧急联系人
            linkmanMapper.insertLinkman(linkman);
            //教育信息
            education.setCreatetime(Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()));
            education.setUpdatetime(Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()));
            educationMapper.insert(education);
            if (StringUtils.isNotBlank(education1.getEducation())) {
                education1.setCreatetime(Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()));
                education1.setUpdatetime(Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()));
                educationMapper.insert(education1);
            }
            //工作经历
            workexperienceMapper.insertWorkexperience(workexperience);
            if (StringUtils.isNotBlank(workexperience1.getCompany())) {
                workexperienceMapper.insertWorkexperience(workexperience1);
            }
            if (StringUtils.isNotBlank(workexperience2.getCompany())) {
                workexperienceMapper.insertWorkexperience(workexperience2);
            }
            //您在本公司是否有亲属关系？
            if (relativesStatus) {
                if (StringUtils.isNotBlank(relativesInCompany.getName())) {
                    relativesincompanyMapper.insertRelativesincompany(relativesInCompany);
                }
                if (StringUtils.isNotBlank(relativesInCompany1.getName())) {
                    relativesincompanyMapper.insertRelativesincompany(relativesInCompany1);
                }
                if (StringUtils.isNotBlank(relativesInCompany2.getName())) {
                    relativesincompanyMapper.insertRelativesincompany(relativesInCompany2);
                }
            }
            //疫苗接种信息
            if (vaccineStatus) {
                vaccineMapper.insertVaccine(vaccine);
            }
        }
        /**
         * IDL写入数据库
         */
        else if (type.equalsIgnoreCase("IDL")) {
            List<EmployeeIdl> employeeIdls = employeeIdlMapper.selectList(Wrappers.<EmployeeIdl>query().lambda().eq(EmployeeIdl::getIdentityno, employeeIdl.getIdentityno()));
            if (employeeIdls != null && employeeIdls.size() > 0) {
                id = employeeIdls.get(0).getId();
                familiesIdlMapper.delete(Wrappers.<FamiliesIdl>query().lambda().eq(FamiliesIdl::getParentid, id));
                linkmanIdlMapper.delete(Wrappers.<LinkmanIdl>query().lambda().eq(LinkmanIdl::getParentid, id));
                workexperienceIdlMapper.delete(Wrappers.<WorkexperienceIdl>query().lambda().eq(WorkexperienceIdl::getParentid, id));
                othercompanyIdlMapper.delete(Wrappers.<OthercompanyIdl>query().lambda().eq(OthercompanyIdl::getParentid, id));
                supplierIdlMapper.delete(Wrappers.<SupplierIdl>query().lambda().eq(SupplierIdl::getParentid, id));
                relativesincompanyIdlMapper.delete(Wrappers.<RelativesincompanyIdl>query().lambda().eq(RelativesincompanyIdl::getParentid, id));
                vaccineIdlMapper.delete(Wrappers.<VaccineIdl>query().lambda().eq(VaccineIdl::getParentid, id));
                educationIdlMapper.delete(Wrappers.<EducationIdl>query().lambda().eq(EducationIdl::getParentid, id));
                disabledindividualsMapper.delete(Wrappers.<Disabledindividuals>query().lambda().eq(Disabledindividuals::getParentid, id));
                languageIdlMapper.delete(Wrappers.<LanguageIdl>query().lambda().eq(LanguageIdl::getParentid, id));
            }
            //员工主体信息
            employeeIdl.setCreatetime(Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()));
            employeeIdl.setUpdatetime(Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()));
            employeeIdlMapper.insertEmployeeIdl(employeeIdl);
            //家庭信息
            familiesIdlMapper.insertFamiliesIdl(familiesIdl);
            if (StringUtils.isNotBlank(familiesIdl1.getName())) {
                familiesIdlMapper.insertFamiliesIdl(familiesIdl1);
            }
            //紧急联系人
            linkmanIdlMapper.insertLinkmanIdl(linkmanIdl);
            //教育信息
            educationIdl.setCreatetime(Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()));
            educationIdl.setUpdatetime(Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()));
            educationIdlMapper.insertEducationIdl(educationIdl);
            if (StringUtils.isNotBlank(educationIdl1.getEducation())) {
                educationIdl1.setCreatetime(Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()));
                educationIdl1.setUpdatetime(Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()));
                educationIdlMapper.insertEducationIdl(educationIdl1);
            }
            //工作经历
            workexperienceIdlMapper.insertWorkexperienceIdl(workexperienceIdl);
            if (StringUtils.isNotBlank(workexperienceIdl1.getCompany())) {
                workexperienceIdlMapper.insertWorkexperienceIdl(workexperienceIdl1);
            }
            if (StringUtils.isNotBlank(workexperienceIdl2.getCompany())) {
                workexperienceIdlMapper.insertWorkexperienceIdl(workexperienceIdl2);
            }
            //您目前是否在除本公司外的任何企业或商家中担任负责人或其他职务？（如法人、董事、监事、高级管理人员……）
            if (otherCompanyStatus) {
                if (StringUtils.isNotBlank(othercompanyIdl.getCompany())) {
                    othercompanyIdlMapper.insertOthercompanyIdl(othercompanyIdl);
                }
                if (StringUtils.isNotBlank(othercompanyIdl1.getCompany())) {
                    othercompanyIdlMapper.insertOthercompanyIdl(othercompanyIdl1);
                }
            }
            //您是否有亲属或朋友或重要关系人是本公司供货商、客户（经销商）？
            if (supplierStatus) {
                if (StringUtils.isNotBlank(supplierIdl.getNamepartner())) {
                    supplierIdlMapper.insertSupplierIdl(supplierIdl);
                }
                if (StringUtils.isNotBlank(supplierIdl1.getNamepartner())) {
                    supplierIdlMapper.insertSupplierIdl(supplierIdl1);
                }
            }
            //您在本公司是否有亲属关系？
            if (relativesStatus) {
                if (StringUtils.isNotBlank(relativesincompanyIdl.getName())) {
                    relativesincompanyIdlMapper.insertRelativesincompanyIdl(relativesincompanyIdl);
                }
                if (StringUtils.isNotBlank(relativesincompanyIdl1.getName())) {
                    relativesincompanyIdlMapper.insertRelativesincompanyIdl(relativesincompanyIdl1);
                }
                if (StringUtils.isNotBlank(relativesincompanyIdl2.getName())) {
                    relativesincompanyIdlMapper.insertRelativesincompanyIdl(relativesincompanyIdl2);
                }
            }
            //疫苗接种信息
            if (vaccineStatus) {
                vaccineIdlMapper.insertVaccineIdl(vaccineIdl);
            }
            //语言信息
            for (LanguageIdl idl :
            languageIdls) {
                if (StringUtils.isNotBlank(idl.getLanguage())){
                    languageIdlMapper.insertLanguageIdl(idl);
                }
            }
        }
        /**
         * 通用删除
         */
        if (StringUtils.isNotBlank(id)){
            expectworkIdlMapper.delete(Wrappers.<ExpectworkIdl>query().lambda().eq(ExpectworkIdl::getParentid, id));
            religiousactivitiesMapper.delete(Wrappers.<Religiousactivities>query().lambda().eq(Religiousactivities::getParentid, id));
            disabledindividualsMapper.delete(Wrappers.<Disabledindividuals>query().lambda().eq(Disabledindividuals::getParentid, id));
            employeePhoneMapper.delete(Wrappers.<EmployeePhone>query().lambda().eq(EmployeePhone::getParentid, id));
            //先删关联表最后删主表
            employeeMapper.delete(Wrappers.<Employee>query().lambda().eq(Employee::getId, id));
            //先删关联表最后删主表
            employeeIdlMapper.delete(Wrappers.<EmployeeIdl>query().lambda().eq(EmployeeIdl::getId, id));
        }

        /**
         *
         * DL/IDL通用存放
         */
        //工作经历
        if (StringUtils.isNotBlank(expectworkIdl.getWorkexperience())){
            expectworkIdlMapper.insertExpectworkIdl(expectworkIdl);
        }
        //宗教活动信息
        if (religiousActivitiesStatus) {
            religiousactivitiesMapper.insertReligiousactivities(religiousactivities);
        }

        //是否残疾人
        if (disabledIndividualsStatus) {
            disabledindividualsMapper.insertDisabledindividuals(disabledIndividuals);
        }
        //图片信息,暂时不存储
        /*for (EmployeePhone pic:
                pics) {
            if (StringUtils.isNotBlank(pic.getPicturev())){
                employeePhoneMapper.insertEmployeePhone(pic);
            }
        }*/

        return 1;
    }

}
