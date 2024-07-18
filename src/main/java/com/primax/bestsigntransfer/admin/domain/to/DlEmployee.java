package com.primax.bestsigntransfer.admin.domain.to;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 【请填写功能名称】对象 dl_employee
 *
 * @author stan
 * @date 2022-05-16
 */
@Data
public class DlEmployee
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** $column.columnComment */
    private String identityno;

    /** $column.columnComment */
    private String name;

    /** 0:女 1:男 */
    private String gender;

    /** $column.columnComment */
    private String birthday;

    /** $column.columnComment */
    private String stature;

    /** $column.columnComment */
    private String weight;

    /** 0:未婚 1:已婚 */
    private String marriage;

    /** 0:非農業  1:農業 */
    private String household;

    /** $column.columnComment */
    private String phonenumber;

    /** $column.columnComment */
    private String province;

    /** $column.columnComment */
    private String address;

    /** $column.columnComment */
    private String applychannel;

    /** $column.columnComment */
    private String propaganda;

    /** $column.columnComment */
    private String education;

    /** $column.columnComment */
    private String school;

    /** 0:肄業 1:畢業 */
    private String certificate;

    /** $column.columnComment */
    private String entrancedate;

    /** $column.columnComment */
    private String graduationdate;

    /** $column.columnComment */
    private String pliticsstatus;

    /** $column.columnComment */
    private String area;

    /** $column.columnComment */
    private String isreligiousbelief;

    /** $column.columnComment */
    private String religiousbelief;

    /** $column.columnComment */
    private String religiousactivities;

    /** $column.columnComment */
    private String crime;

    /** $column.columnComment */
    private String crimestatus;

    /** $column.columnComment */
    private String wechatno;

    /** $column.columnComment */
    private String subject;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;
}
