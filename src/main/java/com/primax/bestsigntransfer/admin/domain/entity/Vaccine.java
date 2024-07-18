package com.primax.bestsigntransfer.admin.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 【请填写功能名称】对象 vaccine
 *
 * @author stan
 * @date 2022-05-06
 */
@Data
public class Vaccine
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long detailid;

    /** 身份证号 */
    private String identityno;

    /** 是否接种新冠疫苗 */
    private String isvaccination;

    /** 第一针接种厂家 */
    private String vaccination1;

    /** 第一针接种时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date vaccination1date;

    /** 第二针接种厂家 */
    private String vaccination2;

    /** 第二针接种时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date vaccination2date;

    /** 第三针接种厂家 */
    private String vaccination3;

    /** 第三针接种时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date vaccination3date;

    private String vaccination4;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date vaccination4date;

    private String remark;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;

    /** $column.columnComment */
    private String parentid;


}
