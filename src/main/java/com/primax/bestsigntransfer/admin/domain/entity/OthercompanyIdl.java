package com.primax.bestsigntransfer.admin.domain.entity;

import com.primax.bestsigntransfer.model.BaseEntity;
import lombok.Data;

/**
 * 【请填写功能名称】对象 othercompany_idl
 *
 * @author stan
 * @date 2022-05-12
 */
@Data
public class OthercompanyIdl
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long detailid;

    /** $column.columnComment */
    private String company;

    /** $column.columnComment */
    private String activitytype;

    /** $column.columnComment */
    private String job;

    /** $column.columnComment */
    private String termoffice;

    /** $column.columnComment */
    private String parentid;


}
