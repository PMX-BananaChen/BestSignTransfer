package com.primax.bestsigntransfer.admin.domain.to;

import lombok.Data;

import java.util.Date;

/**
 * 【请填写功能名称】对象 employeeinfo_newadd
 *
 * @author stan
 * @date 2022-05-16
 */
@Data
public class EmployeeinfoNewadd
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String empno;

    /** $column.columnComment */
    private String entrytype;

    /** $column.columnComment */
    private String usertype;

    /** $column.columnComment */
    private String jobcode;

    /** $column.columnComment */
    private String jobtype;

    /** $column.columnComment */
    private String speciljob;

    /** $column.columnComment */
    private String swipcardstate;

    /** $column.columnComment */
    private String classtype;

    /** $column.columnComment */
    private String salary;

    /** $column.columnComment */
    private String timecontrol;

    /** $column.columnComment */
    private String contracttype;

    /** $column.columnComment */
    private String contractyear;

    /** $column.columnComment */
    private String outcompanyid;

    /** $column.columnComment */
    private String factorycode;

    /** $column.columnComment */
    private String parentareacode;

    /** $column.columnComment */
    private String childareacode;

    /** $column.columnComment */
    private String contractunitcode;

    /** $column.columnComment */
    private Long probation;

    /** $column.columnComment */
    private Date createdate;

    /** $column.columnComment */
    private String iccard;


}
