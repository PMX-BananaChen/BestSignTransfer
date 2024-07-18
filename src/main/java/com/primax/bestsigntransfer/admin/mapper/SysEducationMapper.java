package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.entity.SysEducation;
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
public interface SysEducationMapper extends BaseMapper<SysEducation>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysEducation selectSysEducationById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sysEducation 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysEducation> selectSysEducationList(SysEducation sysEducation);

    /**
     * 新增【请填写功能名称】
     *
     * @param sysEducation 【请填写功能名称】
     * @return 结果
     */
    public int insertSysEducation(SysEducation sysEducation);

    /**
     * 修改【请填写功能名称】
     *
     * @param sysEducation 【请填写功能名称】
     * @return 结果
     */
    public int updateSysEducation(SysEducation sysEducation);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysEducationById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysEducationByIds(Long[] ids);
}
