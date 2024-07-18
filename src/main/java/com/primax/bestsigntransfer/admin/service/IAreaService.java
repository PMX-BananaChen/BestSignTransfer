package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.to.Area;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-16
 */
public interface IAreaService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param areaid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Area selectAreaByAreaid(String areaid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param area 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Area> selectAreaList(Area area);

    /**
     * 新增【请填写功能名称】
     *
     * @param area 【请填写功能名称】
     * @return 结果
     */
    public int insertArea(Area area);

    /**
     * 修改【请填写功能名称】
     *
     * @param area 【请填写功能名称】
     * @return 结果
     */
    public int updateArea(Area area);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param areaids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteAreaByAreaids(String[] areaids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param areaid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteAreaByAreaid(String areaid);
}
