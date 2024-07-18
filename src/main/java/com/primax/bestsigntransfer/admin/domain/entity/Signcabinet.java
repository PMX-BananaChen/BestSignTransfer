package com.primax.bestsigntransfer.admin.domain.entity;

import lombok.Data;

import java.util.Date;

/**
 * 【请填写功能名称】对象 signcabinet
 *
 * @author stan
 * @date 2022-05-12
 */
@Data
public class Signcabinet
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String cabinet;

    /** $column.columnComment */
    private String types;

    /** $column.columnComment */
    private String status;

    private Date createtime;

    private String area;
}
