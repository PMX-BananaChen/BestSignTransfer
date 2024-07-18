package com.primax.bestsigntransfer.admin.domain.entity;

import com.primax.bestsigntransfer.model.BaseEntity;
import lombok.Data;

/**
 * 【请填写功能名称】对象 language_idl
 *
 * @author stan
 * @date 2022-05-14
 */
@Data
public class LanguageIdl 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long detailid;

    /** $column.columnComment */
    private String language;

    /** $column.columnComment */
    private String languagelevel;

    /** $column.columnComment */
    private String languageability;

    /** $column.columnComment */
    private String parentid;


}
