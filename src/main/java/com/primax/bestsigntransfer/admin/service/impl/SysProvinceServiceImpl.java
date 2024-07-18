package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.SysProvince;
import com.primax.bestsigntransfer.admin.mapper.SysProvinceMapper;
import com.primax.bestsigntransfer.admin.service.ISysProvinceService;
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
public class SysProvinceServiceImpl implements ISysProvinceService 
{
    @Resource
    private SysProvinceMapper sysProvinceMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysProvince selectSysProvinceById(Long id)
    {
        return sysProvinceMapper.selectSysProvinceById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysProvince 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysProvince> selectSysProvinceList(SysProvince sysProvince)
    {
        return sysProvinceMapper.selectSysProvinceList(sysProvince);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysProvince 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysProvince(SysProvince sysProvince)
    {
        return sysProvinceMapper.insertSysProvince(sysProvince);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysProvince 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysProvince(SysProvince sysProvince)
    {
        return sysProvinceMapper.updateSysProvince(sysProvince);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysProvinceByIds(Long[] ids)
    {
        return sysProvinceMapper.deleteSysProvinceByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysProvinceById(Long id)
    {
        return sysProvinceMapper.deleteSysProvinceById(id);
    }
}
