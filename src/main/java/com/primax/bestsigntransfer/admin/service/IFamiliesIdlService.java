package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.entity.FamiliesIdl;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author stan
 * @date 2022-05-06
 */
public interface IFamiliesIdlService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public FamiliesIdl selectFamiliesIdlByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param familiesIdl 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FamiliesIdl> selectFamiliesIdlList(FamiliesIdl familiesIdl);

    /**
     * 新增【请填写功能名称】
     * 
     * @param familiesIdl 【请填写功能名称】
     * @return 结果
     */
    public int insertFamiliesIdl(FamiliesIdl familiesIdl);

    /**
     * 修改【请填写功能名称】
     * 
     * @param familiesIdl 【请填写功能名称】
     * @return 结果
     */
    public int updateFamiliesIdl(FamiliesIdl familiesIdl);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteFamiliesIdlByDetailids(Long[] detailids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFamiliesIdlByDetailid(Long detailid);
}
