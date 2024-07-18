package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.SupplierIdl;
import com.primax.bestsigntransfer.admin.mapper.SupplierIdlMapper;
import com.primax.bestsigntransfer.admin.service.ISupplierIdlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author stan
 * @date 2022-05-12
 */
@Service
public class SupplierIdlServiceImpl implements ISupplierIdlService
{
    @Autowired
    private SupplierIdlMapper supplierIdlMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SupplierIdl selectSupplierIdlByDetailid(Long detailid)
    {
        return supplierIdlMapper.selectSupplierIdlByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param supplierIdl 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SupplierIdl> selectSupplierIdlList(SupplierIdl supplierIdl)
    {
        return supplierIdlMapper.selectSupplierIdlList(supplierIdl);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param supplierIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSupplierIdl(SupplierIdl supplierIdl)
    {
        return supplierIdlMapper.insertSupplierIdl(supplierIdl);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param supplierIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSupplierIdl(SupplierIdl supplierIdl)
    {
        return supplierIdlMapper.updateSupplierIdl(supplierIdl);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSupplierIdlByDetailids(Long[] detailids)
    {
        return supplierIdlMapper.deleteSupplierIdlByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSupplierIdlByDetailid(Long detailid)
    {
        return supplierIdlMapper.deleteSupplierIdlByDetailid(detailid);
    }
}
