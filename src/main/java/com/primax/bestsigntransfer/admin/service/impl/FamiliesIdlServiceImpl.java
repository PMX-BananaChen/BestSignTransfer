package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.FamiliesIdl;
import com.primax.bestsigntransfer.admin.mapper.FamiliesIdlMapper;
import com.primax.bestsigntransfer.admin.service.IFamiliesIdlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author stan
 * @date 2022-05-06
 */
@Service
public class FamiliesIdlServiceImpl implements IFamiliesIdlService 
{
    @Resource
    private FamiliesIdlMapper familiesIdlMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FamiliesIdl selectFamiliesIdlByDetailid(Long detailid)
    {
        return familiesIdlMapper.selectFamiliesIdlByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param familiesIdl 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FamiliesIdl> selectFamiliesIdlList(FamiliesIdl familiesIdl)
    {
        return familiesIdlMapper.selectFamiliesIdlList(familiesIdl);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param familiesIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFamiliesIdl(FamiliesIdl familiesIdl)
    {
        return familiesIdlMapper.insertFamiliesIdl(familiesIdl);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param familiesIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFamiliesIdl(FamiliesIdl familiesIdl)
    {
        return familiesIdlMapper.updateFamiliesIdl(familiesIdl);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFamiliesIdlByDetailids(Long[] detailids)
    {
        return familiesIdlMapper.deleteFamiliesIdlByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFamiliesIdlByDetailid(Long detailid)
    {
        return familiesIdlMapper.deleteFamiliesIdlByDetailid(detailid);
    }
}
