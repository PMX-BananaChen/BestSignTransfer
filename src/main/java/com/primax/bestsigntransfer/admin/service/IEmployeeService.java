package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.entity.Employee;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author stan
 * @date 2022-05-06
 */
public interface IEmployeeService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Employee selectEmployeeById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param employee 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Employee> selectEmployeeList(Employee employee);

    /**
     * 新增【请填写功能名称】
     * 
     * @param employee 【请填写功能名称】
     * @return 结果
     */
    public int insertEmployee(Employee employee);

    /**
     * 修改【请填写功能名称】
     * 
     * @param employee 【请填写功能名称】
     * @return 结果
     */
    public int updateEmployee(Employee employee);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteEmployeeByIds(String[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEmployeeById(String id);
}
