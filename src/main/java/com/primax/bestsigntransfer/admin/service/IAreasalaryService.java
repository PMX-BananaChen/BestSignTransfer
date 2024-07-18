package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.to.Areasalary;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-16
 */
public interface IAreasalaryService
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
     * 批量删除【请填写功能名称】
     *
     * @param nids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteAreasalaryByNids(Long[] nids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param nid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteAreasalaryByNid(Long nid);
}
