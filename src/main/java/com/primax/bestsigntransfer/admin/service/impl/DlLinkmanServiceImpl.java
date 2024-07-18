package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.DlLinkman;
import com.primax.bestsigntransfer.admin.mapper.DlLinkmanMapper;
import com.primax.bestsigntransfer.admin.service.IDlLinkmanService;
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
public class DlLinkmanServiceImpl implements IDlLinkmanService
{
    @Autowired
    private DlLinkmanMapper dlLinkmanMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public DlLinkman selectDlLinkmanById(Long id)
    {
        return dlLinkmanMapper.selectDlLinkmanById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param dlLinkman 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DlLinkman> selectDlLinkmanList(DlLinkman dlLinkman)
    {
        return dlLinkmanMapper.selectDlLinkmanList(dlLinkman);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param dlLinkman 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDlLinkman(DlLinkman dlLinkman)
    {
        return dlLinkmanMapper.insertDlLinkman(dlLinkman);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param dlLinkman 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDlLinkman(DlLinkman dlLinkman)
    {
        return dlLinkmanMapper.updateDlLinkman(dlLinkman);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDlLinkmanByIds(Long[] ids)
    {
        return dlLinkmanMapper.deleteDlLinkmanByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDlLinkmanById(Long id)
    {
        return dlLinkmanMapper.deleteDlLinkmanById(id);
    }
}
