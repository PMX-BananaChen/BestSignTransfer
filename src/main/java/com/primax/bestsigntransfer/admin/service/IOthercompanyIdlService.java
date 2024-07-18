package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.entity.OthercompanyIdl;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-12
 */
public interface IOthercompanyIdlService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public OthercompanyIdl selectOthercompanyIdlByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param othercompanyIdl 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OthercompanyIdl> selectOthercompanyIdlList(OthercompanyIdl othercompanyIdl);

    /**
     * 新增【请填写功能名称】
     *
     * @param othercompanyIdl 【请填写功能名称】
     * @return 结果
     */
    public int insertOthercompanyIdl(OthercompanyIdl othercompanyIdl);

    /**
     * 修改【请填写功能名称】
     *
     * @param othercompanyIdl 【请填写功能名称】
     * @return 结果
     */
    public int updateOthercompanyIdl(OthercompanyIdl othercompanyIdl);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteOthercompanyIdlByDetailids(Long[] detailids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteOthercompanyIdlByDetailid(Long detailid);
}
