package com.primax.bestsigntransfer.admin.service;

import java.util.List;
import com.primax.bestsigntransfer.admin.domain.entity.Workexperience;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author stan
 * @date 2022-05-06
 */
public interface IWorkexperienceService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Workexperience selectWorkexperienceByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param workexperience 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Workexperience> selectWorkexperienceList(Workexperience workexperience);

    /**
     * 新增【请填写功能名称】
     * 
     * @param workexperience 【请填写功能名称】
     * @return 结果
     */
    public int insertWorkexperience(Workexperience workexperience);

    /**
     * 修改【请填写功能名称】
     * 
     * @param workexperience 【请填写功能名称】
     * @return 结果
     */
    public int updateWorkexperience(Workexperience workexperience);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteWorkexperienceByDetailids(Long[] detailids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteWorkexperienceByDetailid(Long detailid);
}
