package com.primax.bestsigntransfer.admin.domain.to;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class IdlEmployee {

    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** $column.columnComment */
    private String identityno;

    /** $column.columnComment */
    private String name;

    /** $column.columnComment */
    private String engname;

    /** $column.columnComment */
    private String email;

    /** $column.columnComment */
    private String gender;

    /** $column.columnComment */
    private String birthday;

    /** $column.columnComment */
    private String stature;

    /** $column.columnComment */
    private String weight;

    /** $column.columnComment */
    private String marriage;

    /** $column.columnComment */
    private String nationality;

    /** $column.columnComment */
    private String province;

    /** $column.columnComment */
    private String phonenumber;

    /** $column.columnComment */
    private String address;

    /** $column.columnComment */
    private String applychannel;

    private String propaganda;

    /** $column.columnComment */
    private String language;

    /** $column.columnComment */
    private String languagelevel;

    /** $column.columnComment */
    private String pliticsstatus;

    /** $column.columnComment */
    private String area;

    /** $column.columnComment */
    private String titleid;

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
