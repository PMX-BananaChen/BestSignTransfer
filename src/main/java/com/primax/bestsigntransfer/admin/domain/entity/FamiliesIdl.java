package com.primax.bestsigntransfer.admin.domain.entity;

import com.primax.bestsigntransfer.model.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * 【请填写功能名称】对象 families_idl
 *
 * @author stan
 * @date 2022-05-06
 */
@Data
public class FamiliesIdl 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long detailid;

    /** $column.columnComment */
    private String name;

    /** $column.columnComment */
    private Long relationship;

    /** $column.columnComment */
    private String gender;

    /** $column.columnComment */
    private String occupation;

    /** $column.columnComment */
    private String phonenumber;

    /** $column.columnComment */
    private String address;

    /** $column.columnComment */
    private Date borndate;

    /** $column.columnComment */
    private String sex;

    /** $column.columnComment */
    private String parentid;

    /** $column.columnComment */
    private String workunit;

    /** $column.columnComment */
    private String relative;

}
