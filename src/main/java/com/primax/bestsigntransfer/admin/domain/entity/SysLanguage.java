package com.primax.bestsigntransfer.admin.domain.entity;

import com.primax.bestsigntransfer.model.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 sys_language
 * 
 * @author stan
 * @date 2022-05-06
 */
public class SysLanguage 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    private String languageid;

    /** $column.columnComment */
    private String language;

    /** $column.columnComment */
    private String isenable;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setLanguageid(String languageid) 
    {
        this.languageid = languageid;
    }

    public String getLanguageid() 
    {
        return languageid;
    }
    public void setLanguage(String language) 
    {
        this.language = language;
    }

    public String getLanguage() 
    {
        return language;
    }
    public void setIsenable(String isenable) 
    {
        this.isenable = isenable;
    }

    public String getIsenable() 
    {
        return isenable;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("languageid", getLanguageid())
            .append("language", getLanguage())
            .append("isenable", getIsenable())
            .toString();
    }
}
