package com.primax.bestsigntransfer.admin.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * 【请填写功能名称】对象 employeinfo
 *
 * @author stan
 * @date 2022-05-12
 */
@Data
public class Employeinfo
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String empno;

    /** $column.columnComment */
    private String empname;

    /** $column.columnComment */
    private String areaid;

    /** $column.columnComment */
    private String areaname;

    /** $column.columnComment */
    private String empTitle;

    /** $column.columnComment */
    private String empTitleId;

    /** $column.columnComment */
    private String empTitleName;

    /** $column.columnComment */
    private String emptypeid;

    /** $column.columnComment */
    private String emptypename;

    /** $column.columnComment */
    private String idcardno;

    /** $column.columnComment */
    private String sex;

    /** $column.columnComment */
    private String nation;

    /** $column.columnComment */
    private String birthday;

    /** $column.columnComment */
    private String address;

    /** $column.columnComment */
    private String signdept;

    /** $column.columnComment */
    private String validtermofstart;

    /** $column.columnComment */
    private String validtermofend;

    /** $column.columnComment */
    private String iccardno;

    /** $column.columnComment */
    private String ynPhoto;

    /** $column.columnComment */
    private String ynPrint;

    /** $column.columnComment */
    private String empIndate;

    /** $column.columnComment */
    private String empOutdate;

    /** $column.columnComment */
    private String dimissionReason;

    /** $column.columnComment */
    private String blacklistYn;

    /** $column.columnComment */
    private Date createdate;

    /** $column.columnComment */
    private Date updatedate;

    /** $column.columnComment */
    private Date hcpupdate;

    /** 档案柜(上上签系统) */
    private String filecabinetStatus;

    /** 合同(上上签系统) */
    private String contractStatus;

    /** $column.columnComment */
    private String crime;

    /** $column.columnComment */
    private String crimestatus;

    /** $column.columnComment */
    private String wechatno;

    private String remark;
}
