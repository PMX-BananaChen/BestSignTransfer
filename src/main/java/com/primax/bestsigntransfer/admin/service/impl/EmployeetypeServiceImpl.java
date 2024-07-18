package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.Employeetype;
import com.primax.bestsigntransfer.admin.mapper.EmployeetypeMapper;
import com.primax.bestsigntransfer.admin.service.IEmployeetypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author stan
 * @date 2022-05-16
 */
@Service
public class EmployeetypeServiceImpl implements IEmployeetypeService
{
    @Resource
    private EmployeetypeMapper employeetypeMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param employeeid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Employeetype selectEmployeetypeByEmployeeid(String employeeid)
    {
        return employeetypeMapper.selectEmployeetypeByEmployeeid(employeeid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employeetype 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Employeetype> selectEmployeetypeList(Employeetype employeetype)
    {
        return employeetypeMapper.selectEmployeetypeList(employeetype);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param employeetype 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEmployeetype(Employeetype employeetype)
    {
        return employeetypeMapper.insertEmployeetype(employeetype);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param employeetype 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEmployeetype(Employeetype employeetype)
    {
        return employeetypeMapper.updateEmployeetype(employeetype);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param employeeids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeetypeByEmployeeids(String[] employeeids)
    {
        return employeetypeMapper.deleteEmployeetypeByEmployeeids(employeeids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param employeeid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeetypeByEmployeeid(String employeeid)
    {
        return employeetypeMapper.deleteEmployeetypeByEmployeeid(employeeid);
    }
}
