package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.entity.Education;
import com.primax.bestsigntransfer.admin.domain.entity.EducationIdl;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-06
 */
public interface IEducationIdlService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public EducationIdl selectEducationIdlByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param educationIdl 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<EducationIdl> selectEducationIdlList(EducationIdl educationIdl);

    /**
     * 新增【请填写功能名称】
     *
     * @param educationIdl 【请填写功能名称】
     * @return 结果
     */
    public int insertEducationIdl(EducationIdl educationIdl);

    /**
     * 修改【请填写功能名称】
     *
     * @param educationIdl 【请填写功能名称】
     * @return 结果
     */
    public int updateEducationIdl(EducationIdl educationIdl);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteEducationIdlByDetailids(Long[] detailids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEducationIdlByDetailid(Long detailid);

    List<Education> selectEducationIdlDGList(String id);

    List<Education> selectEducationIdlCQList(String id);

    List<Education> selectEducationIdlKSList(String id);
}
