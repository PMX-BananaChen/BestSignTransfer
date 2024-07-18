package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.EmployeeinfoNewadd;
import com.primax.bestsigntransfer.admin.mapper.EmployeeinfoNewaddMapper;
import com.primax.bestsigntransfer.admin.service.IEmployeeinfoNewaddService;
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
public class EmployeeinfoNewaddServiceImpl implements IEmployeeinfoNewaddService
{
    @Resource
    private EmployeeinfoNewaddMapper employeeinfoNewaddMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param empno 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public EmployeeinfoNewadd selectEmployeeinfoNewaddByEmpno(String empno)
    {
        return employeeinfoNewaddMapper.selectEmployeeinfoNewaddByEmpno(empno);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employeeinfoNewadd 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<EmployeeinfoNewadd> selectEmployeeinfoNewaddList(EmployeeinfoNewadd employeeinfoNewadd)
    {
        return employeeinfoNewaddMapper.selectEmployeeinfoNewaddList(employeeinfoNewadd);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param employeeinfoNewadd 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEmployeeinfoNewadd(EmployeeinfoNewadd employeeinfoNewadd)
    {
        return employeeinfoNewaddMapper.insertEmployeeinfoNewadd(employeeinfoNewadd);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param employeeinfoNewadd 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEmployeeinfoNewadd(EmployeeinfoNewadd employeeinfoNewadd)
    {
        return employeeinfoNewaddMapper.updateEmployeeinfoNewadd(employeeinfoNewadd);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param empnos 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeinfoNewaddByEmpnos(String[] empnos)
    {
        return employeeinfoNewaddMapper.deleteEmployeeinfoNewaddByEmpnos(empnos);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param empno 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeeinfoNewaddByEmpno(String empno)
    {
        return employeeinfoNewaddMapper.deleteEmployeeinfoNewaddByEmpno(empno);
    }
}
