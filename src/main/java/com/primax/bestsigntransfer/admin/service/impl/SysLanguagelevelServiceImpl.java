package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.SysLanguagelevel;
import com.primax.bestsigntransfer.admin.mapper.SysLanguagelevelMapper;
import com.primax.bestsigntransfer.admin.service.ISysLanguagelevelService;
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
public class SysLanguagelevelServiceImpl implements ISysLanguagelevelService 
{
    @Resource
    private SysLanguagelevelMapper sysLanguagelevelMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysLanguagelevel selectSysLanguagelevelById(Long id)
    {
        return sysLanguagelevelMapper.selectSysLanguagelevelById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysLanguagelevel 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysLanguagelevel> selectSysLanguagelevelList(SysLanguagelevel sysLanguagelevel)
    {
        return sysLanguagelevelMapper.selectSysLanguagelevelList(sysLanguagelevel);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysLanguagelevel 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysLanguagelevel(SysLanguagelevel sysLanguagelevel)
    {
        return sysLanguagelevelMapper.insertSysLanguagelevel(sysLanguagelevel);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysLanguagelevel 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysLanguagelevel(SysLanguagelevel sysLanguagelevel)
    {
        return sysLanguagelevelMapper.updateSysLanguagelevel(sysLanguagelevel);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysLanguagelevelByIds(Long[] ids)
    {
        return sysLanguagelevelMapper.deleteSysLanguagelevelByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysLanguagelevelById(Long id)
    {
        return sysLanguagelevelMapper.deleteSysLanguagelevelById(id);
    }
}
