package com.primax.bestsigntransfer.admin.domain.entity;


import com.primax.bestsigntransfer.model.BaseEntity;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 linkman
 * 
 * @author stan
 * @date 2022-05-06
 */
@Data
public class Linkman 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long detailid;

    /** $column.columnComment */
    private String name;

    /** $column.columnComment */
    private Long relationship;

    /** $column.columnComment */
    private String phonenumber;

    /** $column.columnComment */
    private String address;

    /** $column.columnComment */
    private String parentid;


}
