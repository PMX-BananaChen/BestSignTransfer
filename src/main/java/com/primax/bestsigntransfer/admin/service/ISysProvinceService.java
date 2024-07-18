package com.primax.bestsigntransfer.admin.service;

import java.util.List;
import com.primax.bestsigntransfer.admin.domain.entity.SysProvince;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author stan
 * @date 2022-05-06
 */
public interface ISysProvinceService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysProvince selectSysProvinceById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysProvince 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysProvince> selectSysProvinceList(SysProvince sysProvince);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysProvince 【请填写功能名称】
     * @return 结果
     */
    public int insertSysProvince(SysProvince sysProvince);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysProvince 【请填写功能名称】
     * @return 结果
     */
    public int updateSysProvince(SysProvince sysProvince);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSysProvinceByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysProvinceById(Long id);
}
