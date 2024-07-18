package com.primax.bestsigntransfer.admin.domain.entity;

import com.primax.bestsigntransfer.model.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * 【请填写功能名称】对象 license_idl
 * 
 * @author stan
 * @date 2022-05-06
 */
@Data
public class LicenseIdl 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long detailid;

    /** $column.columnComment */
    private String number;

    /** $column.columnComment */
    private String license;

    /** $column.columnComment */
    private String unit;

    /** $column.columnComment */
    private Date startdate;

    /** $column.columnComment */
    private Date enddate;

    /** $column.columnComment */
    private String hour;

    /** $column.columnComment */
    private String parentid;


}
