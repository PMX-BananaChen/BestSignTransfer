package com.primax.bestsigntransfer.admin.service;

import java.util.List;
import com.primax.bestsigntransfer.admin.domain.entity.WorkexperienceIdl;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author stan
 * @date 2022-05-06
 */
public interface IWorkexperienceIdlService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public WorkexperienceIdl selectWorkexperienceIdlByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param workexperienceIdl 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<WorkexperienceIdl> selectWorkexperienceIdlList(WorkexperienceIdl workexperienceIdl);

    /**
     * 新增【请填写功能名称】
     * 
     * @param workexperienceIdl 【请填写功能名称】
     * @return 结果
     */
    public int insertWorkexperienceIdl(WorkexperienceIdl workexperienceIdl);

    /**
     * 修改【请填写功能名称】
     * 
     * @param workexperienceIdl 【请填写功能名称】
     * @return 结果
     */
    public int updateWorkexperienceIdl(WorkexperienceIdl workexperienceIdl);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteWorkexperienceIdlByDetailids(Long[] detailids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteWorkexperienceIdlByDetailid(Long detailid);
}
