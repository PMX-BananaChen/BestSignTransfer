package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.EmployeePhone;
import com.primax.bestsigntransfer.admin.mapper.EmployeePhoneMapper;
import com.primax.bestsigntransfer.admin.service.IEmployeePhoneService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author stan
 * @date 2022-05-12
 */
@Service
public class EmployeePhoneServiceImpl implements IEmployeePhoneService
{
    @Resource
    private EmployeePhoneMapper employeePhoneMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public EmployeePhone selectEmployeePhoneByDetailid(Long detailid)
    {
        return employeePhoneMapper.selectEmployeePhoneByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employeePhone 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<EmployeePhone> selectEmployeePhoneList(EmployeePhone employeePhone)
    {
        return employeePhoneMapper.selectEmployeePhoneList(employeePhone);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param employeePhone 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEmployeePhone(EmployeePhone employeePhone)
    {
        return employeePhoneMapper.insertEmployeePhone(employeePhone);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param employeePhone 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEmployeePhone(EmployeePhone employeePhone)
    {
        return employeePhoneMapper.updateEmployeePhone(employeePhone);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeePhoneByDetailids(Long[] detailids)
    {
        return employeePhoneMapper.deleteEmployeePhoneByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEmployeePhoneByDetailid(Long detailid)
    {
        return employeePhoneMapper.deleteEmployeePhoneByDetailid(detailid);
    }
}
