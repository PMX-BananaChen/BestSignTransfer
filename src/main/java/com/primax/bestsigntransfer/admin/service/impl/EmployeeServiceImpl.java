package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.Employee;
import com.primax.bestsigntransfer.admin.mapper.EmployeeMapper;
import com.primax.bestsigntransfer.admin.service.IEmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author stan
 * @date 2022-05-06
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService
{
    @Resource
    private EmployeeMapper employeeMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Employee selectEmployeeById(String id)
    {
        return employeeMapper.selectEmployeeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employee 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Employee> selectEmployeeList(Employee employee)
    {
        return employeeMapper.selectEmployeeList(employee);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param employee 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEmployee(Employee employee)
    {
        Date date = new Date();
        employee.setCreatetime(date);
        employee.setUpdatetime(date);
        return employeeMapper.insertEmployee(employee);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param employee 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEmployee(Employee employee)
    {
        return employeeMapper.updateEmployee(employee);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeByIds(String[] ids)
    {
        return employeeMapper.deleteEmployeeByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeById(String id)
    {
        return employeeMapper.deleteEmployeeById(id);
    }
}
