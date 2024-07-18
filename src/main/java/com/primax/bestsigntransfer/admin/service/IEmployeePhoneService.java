package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.entity.EmployeePhone;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-12
 */
public interface IEmployeePhoneService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public EmployeePhone selectEmployeePhoneByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employeePhone 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<EmployeePhone> selectEmployeePhoneList(EmployeePhone employeePhone);

    /**
     * 新增【请填写功能名称】
     *
     * @param employeePhone 【请填写功能名称】
     * @return 结果
     */
    public int insertEmployeePhone(EmployeePhone employeePhone);

    /**
     * 修改【请填写功能名称】
     *
     * @param employeePhone 【请填写功能名称】
     * @return 结果
     */
    public int updateEmployeePhone(EmployeePhone employeePhone);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteEmployeePhoneByDetailids(Long[] detailids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEmployeePhoneByDetailid(Long detailid);
}
