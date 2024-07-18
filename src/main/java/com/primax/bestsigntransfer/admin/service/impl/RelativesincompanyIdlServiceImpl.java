package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.RelativesincompanyIdl;
import com.primax.bestsigntransfer.admin.mapper.RelativesincompanyIdlMapper;
import com.primax.bestsigntransfer.admin.service.IRelativesincompanyIdlService;
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
public class RelativesincompanyIdlServiceImpl implements IRelativesincompanyIdlService 
{
    @Resource
    private RelativesincompanyIdlMapper relativesincompanyIdlMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public RelativesincompanyIdl selectRelativesincompanyIdlByDetailid(Long detailid)
    {
        return relativesincompanyIdlMapper.selectRelativesincompanyIdlByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param relativesincompanyIdl 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<RelativesincompanyIdl> selectRelativesincompanyIdlList(RelativesincompanyIdl relativesincompanyIdl)
    {
        return relativesincompanyIdlMapper.selectRelativesincompanyIdlList(relativesincompanyIdl);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param relativesincompanyIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertRelativesincompanyIdl(RelativesincompanyIdl relativesincompanyIdl)
    {
        return relativesincompanyIdlMapper.insertRelativesincompanyIdl(relativesincompanyIdl);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param relativesincompanyIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateRelativesincompanyIdl(RelativesincompanyIdl relativesincompanyIdl)
    {
        return relativesincompanyIdlMapper.updateRelativesincompanyIdl(relativesincompanyIdl);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteRelativesincompanyIdlByDetailids(Long[] detailids)
    {
        return relativesincompanyIdlMapper.deleteRelativesincompanyIdlByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteRelativesincompanyIdlByDetailid(Long detailid)
    {
        return relativesincompanyIdlMapper.deleteRelativesincompanyIdlByDetailid(detailid);
    }
}
