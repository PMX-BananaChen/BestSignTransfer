package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.SysRelationship;
import com.primax.bestsigntransfer.admin.mapper.SysRelationshipMapper;
import com.primax.bestsigntransfer.admin.service.ISysRelationshipService;
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
public class SysRelationshipServiceImpl implements ISysRelationshipService 
{
    @Resource
    private SysRelationshipMapper sysRelationshipMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysRelationship selectSysRelationshipById(Long id)
    {
        return sysRelationshipMapper.selectSysRelationshipById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysRelationship 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysRelationship> selectSysRelationshipList(SysRelationship sysRelationship)
    {
        return sysRelationshipMapper.selectSysRelationshipList(sysRelationship);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysRelationship 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysRelationship(SysRelationship sysRelationship)
    {
        return sysRelationshipMapper.insertSysRelationship(sysRelationship);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysRelationship 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysRelationship(SysRelationship sysRelationship)
    {
        return sysRelationshipMapper.updateSysRelationship(sysRelationship);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysRelationshipByIds(Long[] ids)
    {
        return sysRelationshipMapper.deleteSysRelationshipByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysRelationshipById(Long id)
    {
        return sysRelationshipMapper.deleteSysRelationshipById(id);
    }
}
