package com.primax.bestsigntransfer.admin.domain.to;

import lombok.Data;

import java.util.Date;

/**
 * 【请填写功能名称】对象 employeetype
 *
 * @author stan
 * @date 2022-05-16
 */
@Data
public class Employeetype
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String employeeid;

    /** $column.columnComment */
    private String employeetype;

    /** $column.columnComment */
    private Date createdate;


}
