package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.DlEmployee;
import com.primax.bestsigntransfer.admin.mapper.DlEmployeeMapper;
import com.primax.bestsigntransfer.admin.service.IDlEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author stan
 * @date 2022-05-16
 */
@Service
public class DlEmployeeServiceImpl implements IDlEmployeeService
{
    @Autowired
    private DlEmployeeMapper dlEmployeeMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public DlEmployee selectDlEmployeeById(String id)
    {
        return dlEmployeeMapper.selectDlEmployeeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param dlEmployee 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DlEmployee> selectDlEmployeeList(DlEmployee dlEmployee)
    {
        return dlEmployeeMapper.selectDlEmployeeList(dlEmployee);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param dlEmployee 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDlEmployee(DlEmployee dlEmployee)
    {
        return dlEmployeeMapper.insertDlEmployee(dlEmployee);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param dlEmployee 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDlEmployee(DlEmployee dlEmployee)
    {
        return dlEmployeeMapper.updateDlEmployee(dlEmployee);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDlEmployeeByIds(String[] ids)
    {
        return dlEmployeeMapper.deleteDlEmployeeByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDlEmployeeById(String id)
    {
        return dlEmployeeMapper.deleteDlEmployeeById(id);
    }
}
