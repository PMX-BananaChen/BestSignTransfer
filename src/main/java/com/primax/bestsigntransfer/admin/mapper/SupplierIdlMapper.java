package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.entity.SupplierIdl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-12
 */
@Mapper
public interface SupplierIdlMapper extends BaseMapper<SupplierIdl>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SupplierIdl selectSupplierIdlByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param supplierIdl 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SupplierIdl> selectSupplierIdlList(SupplierIdl supplierIdl);

    /**
     * 新增【请填写功能名称】
     *
     * @param supplierIdl 【请填写功能名称】
     * @return 结果
     */
    public int insertSupplierIdl(SupplierIdl supplierIdl);

    /**
     * 修改【请填写功能名称】
     *
     * @param supplierIdl 【请填写功能名称】
     * @return 结果
     */
    public int updateSupplierIdl(SupplierIdl supplierIdl);

    /**
     * 删除【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSupplierIdlByDetailid(Long detailid);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSupplierIdlByDetailids(Long[] detailids);
}
