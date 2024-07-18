package com.primax.bestsigntransfer.admin.domain.to;


import lombok.Data;

/**
 * 【请填写功能名称】对象 sapcode
 *
 * @author stan
 * @date 2022-05-16
 */
@Data
public class Sapcode
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    private String areaid;

    /** $column.columnComment */
    private String factorycode;

    /** $column.columnComment */
    private String factoryname;

    /** $column.columnComment */
    private String parentareacode;

    /** $column.columnComment */
    private String parentareaname;

    /** $column.columnComment */
    private String childareacode;

    /** $column.columnComment */
    private String contractunitcode;

    /** $column.columnComment */
    private String contractunit;


}
