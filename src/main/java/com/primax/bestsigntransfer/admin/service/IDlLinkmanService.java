package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.to.DlLinkman;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-16
 */
public interface IDlLinkmanService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public DlLinkman selectDlLinkmanById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param dlLinkman 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DlLinkman> selectDlLinkmanList(DlLinkman dlLinkman);

    /**
     * 新增【请填写功能名称】
     *
     * @param dlLinkman 【请填写功能名称】
     * @return 结果
     */
    public int insertDlLinkman(DlLinkman dlLinkman);

    /**
     * 修改【请填写功能名称】
     *
     * @param dlLinkman 【请填写功能名称】
     * @return 结果
     */
    public int updateDlLinkman(DlLinkman dlLinkman);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteDlLinkmanByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteDlLinkmanById(Long id);
}
