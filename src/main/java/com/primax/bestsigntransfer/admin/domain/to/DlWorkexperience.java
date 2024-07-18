package com.primax.bestsigntransfer.admin.domain.to;

import lombok.Data;

import java.util.Date;

/**
 * 【请填写功能名称】对象 dl_workexperience
 *
 * @author stan
 * @date 2022-05-16
 */
@Data
public class DlWorkexperience
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    private Long detailid;

    /** $column.columnComment */
    private String job;

    /** $column.columnComment */
    private String company;

    /** $column.columnComment */
    private String manager;

    /** $column.columnComment */
    private String occupation;

    /** $column.columnComment */
    private String reasonforleaving;

    /** $column.columnComment */
    private String salary;

    /** $column.columnComment */
    private String reason;

    /** $column.columnComment */
    private Date employmentdate;

    /** $column.columnComment */
    private Date resignationdate;

    /** $column.columnComment */
    private String department;

    /** $column.columnComment */
    private String parentid;


}
