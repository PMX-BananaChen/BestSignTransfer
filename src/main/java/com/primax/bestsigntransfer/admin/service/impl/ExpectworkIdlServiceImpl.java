package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.ExpectworkIdl;
import com.primax.bestsigntransfer.admin.mapper.ExpectworkIdlMapper;
import com.primax.bestsigntransfer.admin.service.IExpectworkIdlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author stan
 * @date 2022-05-06
 */
@Service
public class ExpectworkIdlServiceImpl implements IExpectworkIdlService 
{
    @Resource
    private ExpectworkIdlMapper expectworkIdlMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public ExpectworkIdl selectExpectworkIdlByDetailid(Long detailid)
    {
        return expectworkIdlMapper.selectExpectworkIdlByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param expectworkIdl 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<ExpectworkIdl> selectExpectworkIdlList(ExpectworkIdl expectworkIdl)
    {
        return expectworkIdlMapper.selectExpectworkIdlList(expectworkIdl);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param expectworkIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertExpectworkIdl(ExpectworkIdl expectworkIdl)
    {
        return expectworkIdlMapper.insertExpectworkIdl(expectworkIdl);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param expectworkIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateExpectworkIdl(ExpectworkIdl expectworkIdl)
    {
        return expectworkIdlMapper.updateExpectworkIdl(expectworkIdl);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteExpectworkIdlByDetailids(Long[] detailids)
    {
        return expectworkIdlMapper.deleteExpectworkIdlByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteExpectworkIdlByDetailid(Long detailid)
    {
        return expectworkIdlMapper.deleteExpectworkIdlByDetailid(detailid);
    }
}
