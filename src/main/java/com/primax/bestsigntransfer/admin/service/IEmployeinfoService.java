package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.entity.Employeinfo;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-12
 */

public interface IEmployeinfoService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param empno 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Employeinfo selectEmployeinfoByEmpno(String empno);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employeinfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Employeinfo> selectEmployeinfoList(Employeinfo employeinfo);

    /**
     * 新增【请填写功能名称】
     *
     * @param employeinfo 【请填写功能名称】
     * @return 结果
     */
    public int insertEmployeinfo(Employeinfo employeinfo);

    /**
     * 修改【请填写功能名称】
     *
     * @param employeinfo 【请填写功能名称】
     * @return 结果
     */
    public int updateEmployeinfo(Employeinfo employeinfo);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param empnos 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteEmployeinfoByEmpnos(String[] empnos);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param empno 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEmployeinfoByEmpno(String empno);

    String selectEndDate(String empno);
}
