package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.entity.RelativesincompanyIdl;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author stan
 * @date 2022-05-06
 */
public interface IRelativesincompanyIdlService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public RelativesincompanyIdl selectRelativesincompanyIdlByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param relativesincompanyIdl 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<RelativesincompanyIdl> selectRelativesincompanyIdlList(RelativesincompanyIdl relativesincompanyIdl);

    /**
     * 新增【请填写功能名称】
     * 
     * @param relativesincompanyIdl 【请填写功能名称】
     * @return 结果
     */
    public int insertRelativesincompanyIdl(RelativesincompanyIdl relativesincompanyIdl);

    /**
     * 修改【请填写功能名称】
     * 
     * @param relativesincompanyIdl 【请填写功能名称】
     * @return 结果
     */
    public int updateRelativesincompanyIdl(RelativesincompanyIdl relativesincompanyIdl);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteRelativesincompanyIdlByDetailids(Long[] detailids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteRelativesincompanyIdlByDetailid(Long detailid);
}
