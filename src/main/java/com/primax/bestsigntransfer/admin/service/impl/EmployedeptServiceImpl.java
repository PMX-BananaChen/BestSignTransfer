package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.Employedept;
import com.primax.bestsigntransfer.admin.mapper.EmployedeptMapper;
import com.primax.bestsigntransfer.admin.service.IEmployedeptService;
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
public class EmployedeptServiceImpl implements IEmployedeptService
{
    @Resource
    private EmployedeptMapper employedeptMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param empno 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Employedept selectEmployedeptByEmpno(String empno)
    {
        return employedeptMapper.selectEmployedeptByEmpno(empno);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employedept 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Employedept> selectEmployedeptList(Employedept employedept)
    {
        return employedeptMapper.selectEmployedeptList(employedept);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param employedept 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEmployedept(Employedept employedept)
    {
        return employedeptMapper.insertEmployedept(employedept);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param employedept 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEmployedept(Employedept employedept)
    {
        return employedeptMapper.updateEmployedept(employedept);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param empnos 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployedeptByEmpnos(String[] empnos)
    {
        return employedeptMapper.deleteEmployedeptByEmpnos(empnos);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param empno 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployedeptByEmpno(String empno)
    {
        return employedeptMapper.deleteEmployedeptByEmpno(empno);
    }
}
