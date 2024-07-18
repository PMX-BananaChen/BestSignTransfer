package com.primax.bestsigntransfer.admin.domain.entity;


import com.primax.bestsigntransfer.model.BaseEntity;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 sys_relationship
 * 
 * @author stan
 * @date 2022-05-06
 */
@Data
public class SysRelationship 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    private Long relno;

    /** $column.columnComment */
    private String relname;

    /** $column.columnComment */
    private String isenabled;


}
