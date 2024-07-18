package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.Area;
import com.primax.bestsigntransfer.admin.mapper.AreaMapper;
import com.primax.bestsigntransfer.admin.service.IAreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author stan
 * @date 2022-05-16
 */
@Service
public class AreaServiceImpl implements IAreaService
{
    @Resource
    private AreaMapper areaMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param areaid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Area selectAreaByAreaid(String areaid)
    {
        return areaMapper.selectAreaByAreaid(areaid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param area 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Area> selectAreaList(Area area)
    {
        return areaMapper.selectAreaList(area);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param area 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertArea(Area area)
    {
        return areaMapper.insertArea(area);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param area 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateArea(Area area)
    {
        return areaMapper.updateArea(area);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param areaids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteAreaByAreaids(String[] areaids)
    {
        return areaMapper.deleteAreaByAreaids(areaids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param areaid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteAreaByAreaid(String areaid)
    {
        return areaMapper.deleteAreaByAreaid(areaid);
    }
}
