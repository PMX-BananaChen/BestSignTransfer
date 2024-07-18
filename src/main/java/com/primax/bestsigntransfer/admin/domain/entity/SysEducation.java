package com.primax.bestsigntransfer.admin.domain.entity;


import com.primax.bestsigntransfer.model.BaseEntity;
import lombok.Data;

/**
 * 【请填写功能名称】对象 sys_education
 * 
 * @author stan
 * @date 2022-05-06
 */
@Data
public class SysEducation 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    private String eduno;

    /** $column.columnComment */
    private String eduname;

    /** $column.columnComment */
    private String isenabled;


}
