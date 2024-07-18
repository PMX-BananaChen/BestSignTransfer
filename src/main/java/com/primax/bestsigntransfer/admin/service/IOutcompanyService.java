package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.to.Outcompany;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-16
 */
public interface IOutcompanyService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param outcompanyid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Outcompany selectOutcompanyByOutcompanyid(String outcompanyid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param outcompany 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Outcompany> selectOutcompanyList(Outcompany outcompany);

    /**
     * 新增【请填写功能名称】
     *
     * @param outcompany 【请填写功能名称】
     * @return 结果
     */
    public int insertOutcompany(Outcompany outcompany);

    /**
     * 修改【请填写功能名称】
     *
     * @param outcompany 【请填写功能名称】
     * @return 结果
     */
    public int updateOutcompany(Outcompany outcompany);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param outcompanyids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteOutcompanyByOutcompanyids(String[] outcompanyids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param outcompanyid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteOutcompanyByOutcompanyid(String outcompanyid);
}
