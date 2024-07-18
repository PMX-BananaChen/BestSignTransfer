package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.Areasalary;
import com.primax.bestsigntransfer.admin.mapper.AreasalaryMapper;
import com.primax.bestsigntransfer.admin.service.IAreasalaryService;
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
public class AreasalaryServiceImpl implements IAreasalaryService
{
    @Resource
    private AreasalaryMapper areasalaryMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param nid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Areasalary selectAreasalaryByNid(Long nid)
    {
        return areasalaryMapper.selectAreasalaryByNid(nid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param areasalary 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Areasalary> selectAreasalaryList(Areasalary areasalary)
    {
        return areasalaryMapper.selectAreasalaryList(areasalary);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param areasalary 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertAreasalary(Areasalary areasalary)
    {
        return areasalaryMapper.insertAreasalary(areasalary);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param areasalary 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateAreasalary(Areasalary areasalary)
    {
        return areasalaryMapper.updateAreasalary(areasalary);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param nids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteAreasalaryByNids(Long[] nids)
    {
        return areasalaryMapper.deleteAreasalaryByNids(nids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param nid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteAreasalaryByNid(Long nid)
    {
        return areasalaryMapper.deleteAreasalaryByNid(nid);
    }
}
