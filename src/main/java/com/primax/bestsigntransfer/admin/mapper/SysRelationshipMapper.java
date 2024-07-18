package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.entity.SysRelationship;
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
public interface SysRelationshipMapper extends BaseMapper<SysRelationship>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysRelationship selectSysRelationshipById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sysRelationship 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysRelationship> selectSysRelationshipList(SysRelationship sysRelationship);

    /**
     * 新增【请填写功能名称】
     *
     * @param sysRelationship 【请填写功能名称】
     * @return 结果
     */
    public int insertSysRelationship(SysRelationship sysRelationship);

    /**
     * 修改【请填写功能名称】
     *
     * @param sysRelationship 【请填写功能名称】
     * @return 结果
     */
    public int updateSysRelationship(SysRelationship sysRelationship);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysRelationshipById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysRelationshipByIds(Long[] ids);
}
