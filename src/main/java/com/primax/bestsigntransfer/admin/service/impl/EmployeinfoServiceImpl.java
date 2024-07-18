package com.primax.bestsigntransfer.admin.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.primax.bestsigntransfer.admin.domain.entity.Employeinfo;
import com.primax.bestsigntransfer.admin.mapper.EmployeinfoMapper;
import com.primax.bestsigntransfer.admin.service.IEmployeinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author stan
 * @date 2022-05-12
 */
@Service
@DS("HREntryRegistration")
public class EmployeinfoServiceImpl implements IEmployeinfoService
{
    @Resource
    private EmployeinfoMapper employeinfoMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param empno 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Employeinfo selectEmployeinfoByEmpno(String empno)
    {
        return employeinfoMapper.selectEmployeinfoByEmpno(empno);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employeinfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Employeinfo> selectEmployeinfoList(Employeinfo employeinfo)
    {
        return employeinfoMapper.selectEmployeinfoList(employeinfo);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param employeinfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEmployeinfo(Employeinfo employeinfo)
    {
        return employeinfoMapper.insertEmployeinfo(employeinfo);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param employeinfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEmployeinfo(Employeinfo employeinfo)
    {
        employeinfo.setUpdatedate(new Date());
        return employeinfoMapper.updateEmployeinfo(employeinfo);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param empnos 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeinfoByEmpnos(String[] empnos)
    {
        return employeinfoMapper.deleteEmployeinfoByEmpnos(empnos);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param empno 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeinfoByEmpno(String empno)
    {
        return employeinfoMapper.deleteEmployeinfoByEmpno(empno);
    }

    @Override
    public String selectEndDate(String empno) {
        return employeinfoMapper.selectEndDate(empno);
    }
}
