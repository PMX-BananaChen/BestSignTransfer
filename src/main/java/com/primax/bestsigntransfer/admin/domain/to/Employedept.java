package com.primax.bestsigntransfer.admin.domain.to;

import lombok.Data;

/**
 * 【请填写功能名称】对象 employedept
 *
 * @author stan
 * @date 2022-05-16
 */
@Data
public class Employedept
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String empno;

    /** $column.columnComment */
    private String factory;

    /** $column.columnComment */
    private String deptno;

    /** $column.columnComment */
    private String deptname;

    /** $column.columnComment */
    private String deptprintshotname;

    private String createtime;
}
