package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.entity.Disabledindividuals;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-12
 */
public interface IDisabledindividualsService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Disabledindividuals selectDisabledindividualsByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param disabledindividuals 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Disabledindividuals> selectDisabledindividualsList(Disabledindividuals disabledindividuals);

    /**
     * 新增【请填写功能名称】
     *
     * @param disabledindividuals 【请填写功能名称】
     * @return 结果
     */
    public int insertDisabledindividuals(Disabledindividuals disabledindividuals);

    /**
     * 修改【请填写功能名称】
     *
     * @param disabledindividuals 【请填写功能名称】
     * @return 结果
     */
    public int updateDisabledindividuals(Disabledindividuals disabledindividuals);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteDisabledindividualsByDetailids(Long[] detailids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteDisabledindividualsByDetailid(Long detailid);
}
