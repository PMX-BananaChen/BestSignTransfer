package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.to.DlRelativesincompany;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-16
 */
public interface IDlRelativesincompanyService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public DlRelativesincompany selectDlRelativesincompanyById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param dlRelativesincompany 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DlRelativesincompany> selectDlRelativesincompanyList(DlRelativesincompany dlRelativesincompany);

    /**
     * 新增【请填写功能名称】
     *
     * @param dlRelativesincompany 【请填写功能名称】
     * @return 结果
     */
    public int insertDlRelativesincompany(DlRelativesincompany dlRelativesincompany);

    /**
     * 修改【请填写功能名称】
     *
     * @param dlRelativesincompany 【请填写功能名称】
     * @return 结果
     */
    public int updateDlRelativesincompany(DlRelativesincompany dlRelativesincompany);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteDlRelativesincompanyByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteDlRelativesincompanyById(Long id);
}
