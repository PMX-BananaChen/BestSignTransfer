package com.primax.bestsigntransfer.admin.domain.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 【请填写功能名称】对象 areasalary
 *
 * @author stan
 * @date 2022-05-16
 */
@Data
public class Areasalary
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long nid;

    /** $column.columnComment */
    private String areaid;

    /** $column.columnComment */
    private String areaname;

    /** $column.columnComment */
    private String empTitle;

    /** $column.columnComment */
    private BigDecimal salary;


}
