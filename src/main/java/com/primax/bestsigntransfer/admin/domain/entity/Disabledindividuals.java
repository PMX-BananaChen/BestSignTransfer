package com.primax.bestsigntransfer.admin.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 【请填写功能名称】对象 disabledindividuals
 *
 * @author stan
 * @date 2022-05-12
 */
@Data
@TableName("DisabledIndividuals")
public class Disabledindividuals
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long detailid;

    /** $column.columnComment */
    private String disabilitycategory;

    /** $column.columnComment */
    private String disabilitylevel;

    /** $column.columnComment */
    private String disabilityno;

    /** $column.columnComment */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date signaturedate;

    /** $column.columnComment */
    private String parentid;


}
