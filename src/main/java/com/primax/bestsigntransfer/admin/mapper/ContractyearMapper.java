package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.to.Contractyear;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-16
 */
@Mapper
public interface ContractyearMapper extends BaseMapper<Contractyear>
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
     * 删除【请填写功能名称】
     *
     * @param contractyearid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteContractyearByContractyearid(String contractyearid);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param contractyearids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteContractyearByContractyearids(String[] contractyearids);
}
