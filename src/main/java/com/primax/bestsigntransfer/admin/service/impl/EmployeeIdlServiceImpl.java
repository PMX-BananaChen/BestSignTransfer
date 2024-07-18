package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.EmployeeIdl;
import com.primax.bestsigntransfer.admin.mapper.EmployeeIdlMapper;
import com.primax.bestsigntransfer.admin.service.IEmployeeIdlService;
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
public class EmployeeIdlServiceImpl implements IEmployeeIdlService
{
    @Resource
    private EmployeeIdlMapper employeeIdlMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public EmployeeIdl selectEmployeeIdlById(String id)
    {
        return employeeIdlMapper.selectEmployeeIdlById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employeeIdl 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<EmployeeIdl> selectEmployeeIdlList(EmployeeIdl employeeIdl)
    {
        return employeeIdlMapper.selectEmployeeIdlList(employeeIdl);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param employeeIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEmployeeIdl(EmployeeIdl employeeIdl)
    {
        Date date = new Date();
        employeeIdl.setCreatetime(date);
        employeeIdl.setCreatetime(date);
        return employeeIdlMapper.insertEmployeeIdl(employeeIdl);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param employeeIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEmployeeIdl(EmployeeIdl employeeIdl)
    {
        return employeeIdlMapper.updateEmployeeIdl(employeeIdl);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeIdlByIds(String[] ids)
    {
        return employeeIdlMapper.deleteEmployeeIdlByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeIdlById(String id)
    {
        return employeeIdlMapper.deleteEmployeeIdlById(id);
    }
}
