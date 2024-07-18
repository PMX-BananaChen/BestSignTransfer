package com.primax.bestsigntransfer.admin.domain.entity;


import com.primax.bestsigntransfer.model.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 hrentryforempno
 * 
 * @author stan
 * @date 2022-05-06
 */
public class Hrentryforempno 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String identityno;

    /** $column.columnComment */
    private String empno;

    public void setIdentityno(String identityno) 
    {
        this.identityno = identityno;
    }

    public String getIdentityno() 
    {
        return identityno;
    }
    public void setEmpno(String empno) 
    {
        this.empno = empno;
    }

    public String getEmpno() 
    {
        return empno;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("identityno", getIdentityno())
            .append("empno", getEmpno())
            .toString();
    }
}
