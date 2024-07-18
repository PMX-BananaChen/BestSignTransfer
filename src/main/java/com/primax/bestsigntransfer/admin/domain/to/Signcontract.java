package com.primax.bestsigntransfer.admin.domain.to;

import lombok.Data;

/**
 * 【请填写功能名称】对象 signcontract
 *
 * @author stan
 * @date 2022-05-16
 */
@Data
public class Signcontract
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String contract;

    /** $column.columnComment */
    private String types;

    private String companyroleid;

    private String employeeroleid;

    /** $column.columnComment */
    private String status;

    private String area;

    private String account;
}
