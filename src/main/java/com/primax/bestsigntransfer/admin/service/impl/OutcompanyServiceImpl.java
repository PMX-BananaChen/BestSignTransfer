package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.Outcompany;
import com.primax.bestsigntransfer.admin.mapper.OutcompanyMapper;
import com.primax.bestsigntransfer.admin.service.IOutcompanyService;
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
public class OutcompanyServiceImpl implements IOutcompanyService
{
    @Resource
    private OutcompanyMapper outcompanyMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param outcompanyid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Outcompany selectOutcompanyByOutcompanyid(String outcompanyid)
    {
        return outcompanyMapper.selectOutcompanyByOutcompanyid(outcompanyid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param outcompany 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Outcompany> selectOutcompanyList(Outcompany outcompany)
    {
        return outcompanyMapper.selectOutcompanyList(outcompany);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param outcompany 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOutcompany(Outcompany outcompany)
    {
        return outcompanyMapper.insertOutcompany(outcompany);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param outcompany 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOutcompany(Outcompany outcompany)
    {
        return outcompanyMapper.updateOutcompany(outcompany);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param outcompanyids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutcompanyByOutcompanyids(String[] outcompanyids)
    {
        return outcompanyMapper.deleteOutcompanyByOutcompanyids(outcompanyids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param outcompanyid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOutcompanyByOutcompanyid(String outcompanyid)
    {
        return outcompanyMapper.deleteOutcompanyByOutcompanyid(outcompanyid);
    }
}
