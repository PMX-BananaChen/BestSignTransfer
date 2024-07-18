package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.to.EmployeeinfoNewadd;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-16
 */
public interface IEmployeeinfoNewaddService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param empno 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public EmployeeinfoNewadd selectEmployeeinfoNewaddByEmpno(String empno);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employeeinfoNewadd 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<EmployeeinfoNewadd> selectEmployeeinfoNewaddList(EmployeeinfoNewadd employeeinfoNewadd);

    /**
     * 新增【请填写功能名称】
     *
     * @param employeeinfoNewadd 【请填写功能名称】
     * @return 结果
     */
    public int insertEmployeeinfoNewadd(EmployeeinfoNewadd employeeinfoNewadd);

    /**
     * 修改【请填写功能名称】
     *
     * @param employeeinfoNewadd 【请填写功能名称】
     * @return 结果
     */
    public int updateEmployeeinfoNewadd(EmployeeinfoNewadd employeeinfoNewadd);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param empnos 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteEmployeeinfoNewaddByEmpnos(String[] empnos);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param empno 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEmployeeinfoNewaddByEmpno(String empno);
}
