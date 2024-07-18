package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.IdlEducation;
import com.primax.bestsigntransfer.admin.mapper.IdlEducationMapper;
import com.primax.bestsigntransfer.admin.service.IIdlEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author stan
 * @date 2022-05-16
 */
@Service
public class IdlEducationServiceImpl implements IIdlEducationService
{
    @Autowired
    private IdlEducationMapper idlEducationMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public IdlEducation selectIdlEducationById(Long id)
    {
        return idlEducationMapper.selectIdlEducationById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param idlEducation 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<IdlEducation> selectIdlEducationList(IdlEducation idlEducation)
    {
        return idlEducationMapper.selectIdlEducationList(idlEducation);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param idlEducation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertIdlEducation(IdlEducation idlEducation)
    {
        return idlEducationMapper.insertIdlEducation(idlEducation);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param idlEducation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateIdlEducation(IdlEducation idlEducation)
    {
        return idlEducationMapper.updateIdlEducation(idlEducation);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteIdlEducationByIds(Long[] ids)
    {
        return idlEducationMapper.deleteIdlEducationByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteIdlEducationById(Long id)
    {
        return idlEducationMapper.deleteIdlEducationById(id);
    }
}
