package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.to.Areasalary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-16
 */
@Mapper
public interface AreasalaryMapper extends BaseMapper<Areasalary>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param nid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Areasalary selectAreasalaryByNid(Long nid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param areasalary 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Areasalary> selectAreasalaryList(Areasalary areasalary);

    /**
     * 新增【请填写功能名称】
     *
     * @param areasalary 【请填写功能名称】
     * @return 结果
     */
    public int insertAreasalary(Areasalary areasalary);

    /**
     * 修改【请填写功能名称】
     *
     * @param areasalary 【请填写功能名称】
     * @return 结果
     */
    public int updateAreasalary(Areasalary areasalary);

    /**
     * 删除【请填写功能名称】
     *
     * @param nid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteAreasalaryByNid(Long nid);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param nids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAreasalaryByNids(Long[] nids);
}
