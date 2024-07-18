package com.primax.bestsigntransfer.admin.service;

import java.util.List;
import com.primax.bestsigntransfer.admin.domain.entity.SysLanguage;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author stan
 * @date 2022-05-06
 */

public interface ISysLanguageService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysLanguage selectSysLanguageById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysLanguage 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysLanguage> selectSysLanguageList(SysLanguage sysLanguage);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysLanguage 【请填写功能名称】
     * @return 结果
     */
    public int insertSysLanguage(SysLanguage sysLanguage);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysLanguage 【请填写功能名称】
     * @return 结果
     */
    public int updateSysLanguage(SysLanguage sysLanguage);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSysLanguageByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysLanguageById(Long id);
}
