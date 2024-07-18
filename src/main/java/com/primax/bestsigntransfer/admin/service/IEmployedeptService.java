package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.to.Employedept;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-16
 */
public interface IEmployedeptService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param empno 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Employedept selectEmployedeptByEmpno(String empno);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employedept 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Employedept> selectEmployedeptList(Employedept employedept);

    /**
     * 新增【请填写功能名称】
     *
     * @param employedept 【请填写功能名称】
     * @return 结果
     */
    public int insertEmployedept(Employedept employedept);

    /**
     * 修改【请填写功能名称】
     *
     * @param employedept 【请填写功能名称】
     * @return 结果
     */
    public int updateEmployedept(Employedept employedept);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param empnos 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteEmployedeptByEmpnos(String[] empnos);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param empno 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEmployedeptByEmpno(String empno);
}
