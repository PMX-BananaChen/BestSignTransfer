package com.primax.bestsigntransfer.admin.domain.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 【请填写功能名称】对象 education_idl
 *
 * @author stan
 * @date 2022-05-06
 */
@Data
public class EducationIdl
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long detailid;

    /** $column.columnComment */
    private String education;

    /** $column.columnComment */
    private String degree;

    /** $column.columnComment */
    private String studymode;

    /** $column.columnComment */
    private String school;

    /** $column.columnComment */
    private String subject;

    /** $column.columnComment */
    private String certificate;

    /** $column.columnComment */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private String entrancedate;

    /** $column.columnComment */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private String graduationdate;

    /** $column.columnComment */
    private String parentid;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;
}
