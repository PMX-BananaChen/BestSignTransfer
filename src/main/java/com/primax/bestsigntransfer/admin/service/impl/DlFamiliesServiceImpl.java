package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.DlFamilies;
import com.primax.bestsigntransfer.admin.mapper.DlFamiliesMapper;
import com.primax.bestsigntransfer.admin.service.IDlFamiliesService;
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
public class DlFamiliesServiceImpl implements IDlFamiliesService
{
    @Autowired
    private DlFamiliesMapper dlFamiliesMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public DlFamilies selectDlFamiliesById(Long id)
    {
        return dlFamiliesMapper.selectDlFamiliesById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param dlFamilies 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DlFamilies> selectDlFamiliesList(DlFamilies dlFamilies)
    {
        return dlFamiliesMapper.selectDlFamiliesList(dlFamilies);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param dlFamilies 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDlFamilies(DlFamilies dlFamilies)
    {
        return dlFamiliesMapper.insertDlFamilies(dlFamilies);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param dlFamilies 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDlFamilies(DlFamilies dlFamilies)
    {
        return dlFamiliesMapper.updateDlFamilies(dlFamilies);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDlFamiliesByIds(Long[] ids)
    {
        return dlFamiliesMapper.deleteDlFamiliesByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDlFamiliesById(Long id)
    {
        return dlFamiliesMapper.deleteDlFamiliesById(id);
    }
}
