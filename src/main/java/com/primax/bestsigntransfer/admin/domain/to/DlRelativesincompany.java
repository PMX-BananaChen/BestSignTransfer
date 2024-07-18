package com.primax.bestsigntransfer.admin.domain.to;

import lombok.Data;

/**
 * 【请填写功能名称】对象 dl_relativesincompany
 *
 * @author stan
 * @date 2022-05-16
 */
@Data
public class DlRelativesincompany {
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
    private String department;

    /** $column.columnComment */
    private String phonenumber;

    /** $column.columnComment */
    private String empno;

    /** $column.columnComment */
    private String job;

    /** $column.columnComment */
    private String parentid;


}
