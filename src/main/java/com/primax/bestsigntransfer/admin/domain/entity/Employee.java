package com.primax.bestsigntransfer.admin.domain.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 【请填写功能名称】对象 employee
 *
 * @author stan
 * @date 2022-05-06
 */
@Data
public class Employee
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

    /** 生日 */
    private String birthday;

    /** $column.columnComment */
    private String stature;

    /** $column.columnComment */
    private String weight;

    /** 0:未婚 1:已婚 */
    private String marriage;

    /** 1:非農業  2:農業 */
    private String household;

    /** 电话 */
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

    /** 1:肄業 0:畢業 */
    private String certificate;

    /** $column.columnComment */
    private String entrancedate;

    /** $column.columnComment */
    private String graduationdate;

    private String pliticsstatus;

    /** $column.columnComment */
    private String area;

    /** 有无宗教信仰(0:无 1:有) */
    private String isreligiousbelief;

    /** 1 佛教,2 伊斯兰教,3 基督教,4 天主教 */
    private String religiousbelief;

    private String religiousactivities;

    private String crime;

    private String crimestatus;

    private String wechatno;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;

}
