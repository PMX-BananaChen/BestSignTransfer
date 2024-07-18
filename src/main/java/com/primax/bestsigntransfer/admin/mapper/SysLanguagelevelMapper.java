package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.entity.SysLanguagelevel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-06
 */
@Mapper
@DS("HREntryRegistration")
public interface SysLanguagelevelMapper extends BaseMapper<SysLanguagelevel>
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
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysLanguagelevelById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysLanguagelevelByIds(Long[] ids);
}
