package com.primax.bestsigntransfer.admin.domain.to;


import lombok.Data;

import java.util.Date;

/**
 * 【请填写功能名称】对象 outcompany
 *
 * @author stan
 * @date 2022-05-16
 */
@Data
public class Outcompany
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String outcompanyid;

    /** $column.columnComment */
    private String outcompanyname;

    /** $column.columnComment */
    private Date createdate;

    /** 经办人 */
    private String operator;

    /** 联系方式 */
    private String contact;

    /** 法人代表 */
    private String corporation;

    /** 注册地址 */
    private String address;

    /** 经济类型 */
    private String economy;

    /** 联系电话 */
    private String contactnumber;


}
