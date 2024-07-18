package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.to.DlEmployee;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-16
 */
public interface IDlEmployeeService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public DlEmployee selectDlEmployeeById(String id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param dlEmployee 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DlEmployee> selectDlEmployeeList(DlEmployee dlEmployee);

    /**
     * 新增【请填写功能名称】
     *
     * @param dlEmployee 【请填写功能名称】
     * @return 结果
     */
    public int insertDlEmployee(DlEmployee dlEmployee);

    /**
     * 修改【请填写功能名称】
     *
     * @param dlEmployee 【请填写功能名称】
     * @return 结果
     */
    public int updateDlEmployee(DlEmployee dlEmployee);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteDlEmployeeByIds(String[] ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteDlEmployeeById(String id);
}
