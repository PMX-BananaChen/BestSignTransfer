package com.primax.bestsigntransfer.admin.domain.entity;


import com.primax.bestsigntransfer.model.BaseEntity;
import lombok.Data;

/**
 * 【请填写功能名称】对象 families
 *
 * @author stan
 * @date 2022-05-06
 */
@Data
public class Families 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long detailid;

    /** $column.columnComment */
    private String name;

    /** $column.columnComment */
    private Long relationship;

    /** 1:男  2:女 */
    private String gender;

    /** $column.columnComment */
    private String occupation;

    /** $column.columnComment */
    private String phonenumber;

    /** $column.columnComment */
    private String address;

    /** $column.columnComment */
    private String sex;

    /** $column.columnComment */
    private String parentid;

    /** $column.columnComment */
    private String workunit;

    /** $column.columnComment */
    private String relative;
}
