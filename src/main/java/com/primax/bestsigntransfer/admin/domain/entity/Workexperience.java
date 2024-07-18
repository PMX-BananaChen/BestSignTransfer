package com.primax.bestsigntransfer.admin.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 【请填写功能名称】对象 workexperience
 *
 * @author stan
 * @date 2022-05-06
 */
@Data
public class Workexperience
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long detailid;

    private String Job;

    /** $column.columnComment */
    private String company;

    /** $column.columnComment */
    private String occupation;

    /** $column.columnComment */
    private String reasonforleaving;

    /** $column.columnComment */
    private String salary;

    private String reason;

    /** $column.columnComment */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date employmentdate;

    /** $column.columnComment */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date resignationdate;

    private String department;

    /** $column.columnComment */
    private String parentid;


}
