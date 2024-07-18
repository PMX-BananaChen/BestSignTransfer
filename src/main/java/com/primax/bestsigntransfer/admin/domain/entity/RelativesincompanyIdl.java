package com.primax.bestsigntransfer.admin.domain.entity;


import lombok.Data;

/**
 * 【请填写功能名称】对象 relativesincompany_idl
 *
 * @author stan
 * @date 2022-05-06
 */
@Data
public class RelativesincompanyIdl
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long detailid;

    /** $column.columnComment */
    private String name;

    /** $column.columnComment */
    private Long relationship;

    /** $column.columnComment */
    private String department;

    /** $column.columnComment */
    private String phonenumber;

    /** $column.columnComment */
    private String empno;

    private String job;

    /** $column.columnComment */
    private String parentid;

    private String remark;
}
