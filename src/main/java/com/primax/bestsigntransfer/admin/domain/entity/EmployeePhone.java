package com.primax.bestsigntransfer.admin.domain.entity;

import com.primax.bestsigntransfer.model.BaseEntity;
import lombok.Data;

/**
 * 【请填写功能名称】对象 employee_phone
 *
 * @author stan
 * @date 2022-05-12
 */
@Data
public class EmployeePhone 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long detailid;

    /** $column.columnComment */
    private String ptype;

    /** $column.columnComment */
    private String filename;

    /** $column.columnComment */
    private String filepath;

    /** $column.columnComment */
    private String picturev;

    /** $column.columnComment */
    private String mediaid;

    /** $column.columnComment */
    private String parentid;


}
