package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.to.Employeetype;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-16
 */
public interface IEmployeetypeService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param employeeid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Employeetype selectEmployeetypeByEmployeeid(String employeeid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employeetype 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Employeetype> selectEmployeetypeList(Employeetype employeetype);

    /**
     * 新增【请填写功能名称】
     *
     * @param employeetype 【请填写功能名称】
     * @return 结果
     */
    public int insertEmployeetype(Employeetype employeetype);

    /**
     * 修改【请填写功能名称】
     *
     * @param employeetype 【请填写功能名称】
     * @return 结果
     */
    public int updateEmployeetype(Employeetype employeetype);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param employeeids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteEmployeetypeByEmployeeids(String[] employeeids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param employeeid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEmployeetypeByEmployeeid(String employeeid);
}
