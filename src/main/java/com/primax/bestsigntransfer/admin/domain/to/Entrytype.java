package com.primax.bestsigntransfer.admin.domain.to;

import lombok.Data;

import java.util.Date;

/**
 * 【请填写功能名称】对象 entrytype
 *
 * @author stan
 * @date 2022-05-16
 */
@Data
public class Entrytype
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String entryid;

    /** $column.columnComment */
    private String entrytype;

    /** $column.columnComment */
    private Date createdate;


}
