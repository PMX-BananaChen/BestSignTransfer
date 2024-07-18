package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.SysEducation;
import com.primax.bestsigntransfer.admin.mapper.SysEducationMapper;
import com.primax.bestsigntransfer.admin.service.ISysEducationService;
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
public class SysEducationServiceImpl implements ISysEducationService 
{
    @Resource
    private SysEducationMapper sysEducationMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysEducation selectSysEducationById(Long id)
    {
        return sysEducationMapper.selectSysEducationById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysEducation 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysEducation> selectSysEducationList(SysEducation sysEducation)
    {
        return sysEducationMapper.selectSysEducationList(sysEducation);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysEducation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysEducation(SysEducation sysEducation)
    {
        return sysEducationMapper.insertSysEducation(sysEducation);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysEducation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysEducation(SysEducation sysEducation)
    {
        return sysEducationMapper.updateSysEducation(sysEducation);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysEducationByIds(Long[] ids)
    {
        return sysEducationMapper.deleteSysEducationByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysEducationById(Long id)
    {
        return sysEducationMapper.deleteSysEducationById(id);
    }
}
