package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.Families;
import com.primax.bestsigntransfer.admin.mapper.FamiliesMapper;
import com.primax.bestsigntransfer.admin.service.IFamiliesService;
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
public class FamiliesServiceImpl implements IFamiliesService 
{
    @Resource
    private FamiliesMapper familiesMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Families selectFamiliesByDetailid(Long detailid)
    {
        return familiesMapper.selectFamiliesByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param families 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Families> selectFamiliesList(Families families)
    {
        return familiesMapper.selectFamiliesList(families);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param families 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFamilies(Families families)
    {
        return familiesMapper.insertFamilies(families);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param families 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFamilies(Families families)
    {
        return familiesMapper.updateFamilies(families);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFamiliesByDetailids(Long[] detailids)
    {
        return familiesMapper.deleteFamiliesByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFamiliesByDetailid(Long detailid)
    {
        return familiesMapper.deleteFamiliesByDetailid(detailid);
    }
}
