package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.DlWorkexperience;
import com.primax.bestsigntransfer.admin.mapper.DlWorkexperienceMapper;
import com.primax.bestsigntransfer.admin.service.IDlWorkexperienceService;
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
public class DlWorkexperienceServiceImpl implements IDlWorkexperienceService
{
    @Autowired
    private DlWorkexperienceMapper dlWorkexperienceMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public DlWorkexperience selectDlWorkexperienceById(Long id)
    {
        return dlWorkexperienceMapper.selectDlWorkexperienceById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param dlWorkexperience 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DlWorkexperience> selectDlWorkexperienceList(DlWorkexperience dlWorkexperience)
    {
        return dlWorkexperienceMapper.selectDlWorkexperienceList(dlWorkexperience);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param dlWorkexperience 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDlWorkexperience(DlWorkexperience dlWorkexperience)
    {
        return dlWorkexperienceMapper.insertDlWorkexperience(dlWorkexperience);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param dlWorkexperience 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDlWorkexperience(DlWorkexperience dlWorkexperience)
    {
        return dlWorkexperienceMapper.updateDlWorkexperience(dlWorkexperience);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDlWorkexperienceByIds(Long[] ids)
    {
        return dlWorkexperienceMapper.deleteDlWorkexperienceByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDlWorkexperienceById(Long id)
    {
        return dlWorkexperienceMapper.deleteDlWorkexperienceById(id);
    }
}
