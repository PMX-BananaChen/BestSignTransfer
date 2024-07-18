package com.primax.bestsigntransfer.admin.domain.entity;
import com.primax.bestsigntransfer.model.BaseEntity;
import lombok.Data;

/**
 * 【请填写功能名称】对象 supplier_idl
 *
 * @author stan
 * @date 2022-05-12
 */
@Data
public class SupplierIdl 
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long detailid;

    /** $column.columnComment */
    private String namepartner;

    /** $column.columnComment */
    private String unit;

    /** $column.columnComment */
    private String relationship;

    /** $column.columnComment */
    private String explain;

    /** $column.columnComment */
    private String parentid;


}
