package com.primax.bestsigntransfer.admin.service;


import com.primax.bestsigntransfer.admin.domain.to.Contractyear;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-16
 */
public interface IContractyearService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param contractyearid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Contractyear selectContractyearByContractyearid(String contractyearid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param contractyear 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Contractyear> selectContractyearList(Contractyear contractyear);

    /**
     * 新增【请填写功能名称】
     *
     * @param contractyear 【请填写功能名称】
     * @return 结果
     */
    public int insertContractyear(Contractyear contractyear);

    /**
     * 修改【请填写功能名称】
     *
     * @param contractyear 【请填写功能名称】
     * @return 结果
     */
    public int updateContractyear(Contractyear contractyear);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param contractyearids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteContractyearByContractyearids(String[] contractyearids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param contractyearid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteContractyearByContractyearid(String contractyearid);
}
