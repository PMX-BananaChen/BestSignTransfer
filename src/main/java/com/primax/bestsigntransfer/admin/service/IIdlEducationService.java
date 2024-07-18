package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.to.IdlEducation;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-16
 */
public interface IIdlEducationService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public IdlEducation selectIdlEducationById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param idlEducation 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<IdlEducation> selectIdlEducationList(IdlEducation idlEducation);

    /**
     * 新增【请填写功能名称】
     *
     * @param idlEducation 【请填写功能名称】
     * @return 结果
     */
    public int insertIdlEducation(IdlEducation idlEducation);

    /**
     * 修改【请填写功能名称】
     *
     * @param idlEducation 【请填写功能名称】
     * @return 结果
     */
    public int updateIdlEducation(IdlEducation idlEducation);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteIdlEducationByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteIdlEducationById(Long id);
}
