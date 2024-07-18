package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.Contractyear;
import com.primax.bestsigntransfer.admin.mapper.ContractyearMapper;
import com.primax.bestsigntransfer.admin.service.IContractyearService;
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
public class ContractyearServiceImpl implements IContractyearService
{
    @Autowired
    private ContractyearMapper contractyearMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param contractyearid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Contractyear selectContractyearByContractyearid(String contractyearid)
    {
        return contractyearMapper.selectContractyearByContractyearid(contractyearid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param contractyear 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Contractyear> selectContractyearList(Contractyear contractyear)
    {
        return contractyearMapper.selectContractyearList(contractyear);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param contractyear 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertContractyear(Contractyear contractyear)
    {
        return contractyearMapper.insertContractyear(contractyear);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param contractyear 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateContractyear(Contractyear contractyear)
    {
        return contractyearMapper.updateContractyear(contractyear);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param contractyearids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteContractyearByContractyearids(String[] contractyearids)
    {
        return contractyearMapper.deleteContractyearByContractyearids(contractyearids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param contractyearid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteContractyearByContractyearid(String contractyearid)
    {
        return contractyearMapper.deleteContractyearByContractyearid(contractyearid);
    }
}
