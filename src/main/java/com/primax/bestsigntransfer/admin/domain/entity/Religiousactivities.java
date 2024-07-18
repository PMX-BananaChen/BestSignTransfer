package com.primax.bestsigntransfer.admin.domain.entity;
import com.primax.bestsigntransfer.model.BaseEntity;
import lombok.Data;

/**
 * 【请填写功能名称】对象 religiousactivities
 *
 * @author stan
 * @date 2022-05-12
 */
@Data
public class Religiousactivities 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long detailid;

    /** $column.columnComment */
    private String timeactivity;

    /** $column.columnComment */
    private String assist;

    /** $column.columnComment */
    private String assistancecontent;

    /** $column.columnComment */
    private String parentid;

}
