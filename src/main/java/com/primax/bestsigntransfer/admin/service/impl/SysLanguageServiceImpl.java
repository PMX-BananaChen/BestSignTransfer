package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.SysLanguage;
import com.primax.bestsigntransfer.admin.mapper.SysLanguageMapper;
import com.primax.bestsigntransfer.admin.service.ISysLanguageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author stan
 * @date 2022-05-06
 */
@Service
public class SysLanguageServiceImpl implements ISysLanguageService 
{
    @Resource
    private SysLanguageMapper sysLanguageMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysLanguage selectSysLanguageById(Long id)
    {
        return sysLanguageMapper.selectSysLanguageById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysLanguage 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysLanguage> selectSysLanguageList(SysLanguage sysLanguage)
    {
        return sysLanguageMapper.selectSysLanguageList(sysLanguage);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysLanguage 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysLanguage(SysLanguage sysLanguage)
    {
        return sysLanguageMapper.insertSysLanguage(sysLanguage);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysLanguage 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysLanguage(SysLanguage sysLanguage)
    {
        return sysLanguageMapper.updateSysLanguage(sysLanguage);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysLanguageByIds(Long[] ids)
    {
        return sysLanguageMapper.deleteSysLanguageByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysLanguageById(Long id)
    {
        return sysLanguageMapper.deleteSysLanguageById(id);
    }
}
