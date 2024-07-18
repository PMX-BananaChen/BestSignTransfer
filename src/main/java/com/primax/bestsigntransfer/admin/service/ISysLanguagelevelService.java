package com.primax.bestsigntransfer.admin.service;

import java.util.List;
import com.primax.bestsigntransfer.admin.domain.entity.SysLanguagelevel;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author stan
 * @date 2022-05-06
 */
public interface ISysLanguagelevelService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysLanguagelevel selectSysLanguagelevelById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysLanguagelevel 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysLanguagelevel> selectSysLanguagelevelList(SysLanguagelevel sysLanguagelevel);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysLanguagelevel 【请填写功能名称】
     * @return 结果
     */
    public int insertSysLanguagelevel(SysLanguagelevel sysLanguagelevel);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysLanguagelevel 【请填写功能名称】
     * @return 结果
     */
    public int updateSysLanguagelevel(SysLanguagelevel sysLanguagelevel);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSysLanguagelevelByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysLanguagelevelById(Long id);
}
