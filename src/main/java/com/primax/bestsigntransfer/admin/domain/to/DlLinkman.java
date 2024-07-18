package com.primax.bestsigntransfer.admin.domain.to;

import lombok.Data;

/**
 * 【请填写功能名称】对象 dl_linkman
 *
 * @author stan
 * @date 2022-05-16
 */
@Data
public class DlLinkman
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

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
