package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.entity.ExpectworkIdl;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author stan
 * @date 2022-05-06
 */
public interface IExpectworkIdlService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public ExpectworkIdl selectExpectworkIdlByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param expectworkIdl 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<ExpectworkIdl> selectExpectworkIdlList(ExpectworkIdl expectworkIdl);

    /**
     * 新增【请填写功能名称】
     * 
     * @param expectworkIdl 【请填写功能名称】
     * @return 结果
     */
    public int insertExpectworkIdl(ExpectworkIdl expectworkIdl);

    /**
     * 修改【请填写功能名称】
     * 
     * @param expectworkIdl 【请填写功能名称】
     * @return 结果
     */
    public int updateExpectworkIdl(ExpectworkIdl expectworkIdl);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteExpectworkIdlByDetailids(Long[] detailids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteExpectworkIdlByDetailid(Long detailid);
}
