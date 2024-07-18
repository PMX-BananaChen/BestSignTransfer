package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.to.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-16
 */
@Mapper
public interface AreaMapper extends BaseMapper<Area>
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
     * 删除【请填写功能名称】
     *
     * @param areaid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteAreaByAreaid(String areaid);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param areaids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAreaByAreaids(String[] areaids);
}
