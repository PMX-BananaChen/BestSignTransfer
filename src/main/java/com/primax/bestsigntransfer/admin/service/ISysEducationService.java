package com.primax.bestsigntransfer.admin.service;

import java.util.List;
import com.primax.bestsigntransfer.admin.domain.entity.SysEducation;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author stan
 * @date 2022-05-06
 */
public interface ISysEducationService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysEducation selectSysEducationById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysEducation 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysEducation> selectSysEducationList(SysEducation sysEducation);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysEducation 【请填写功能名称】
     * @return 结果
     */
    public int insertSysEducation(SysEducation sysEducation);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysEducation 【请填写功能名称】
     * @return 结果
     */
    public int updateSysEducation(SysEducation sysEducation);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSysEducationByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysEducationById(Long id);
}
