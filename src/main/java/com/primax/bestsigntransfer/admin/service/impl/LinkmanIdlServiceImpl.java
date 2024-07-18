package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.LinkmanIdl;
import com.primax.bestsigntransfer.admin.mapper.LinkmanIdlMapper;
import com.primax.bestsigntransfer.admin.service.ILinkmanIdlService;
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
public class LinkmanIdlServiceImpl implements ILinkmanIdlService 
{
    @Resource
    private LinkmanIdlMapper linkmanIdlMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public LinkmanIdl selectLinkmanIdlByDetailid(Long detailid)
    {
        return linkmanIdlMapper.selectLinkmanIdlByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param linkmanIdl 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LinkmanIdl> selectLinkmanIdlList(LinkmanIdl linkmanIdl)
    {
        return linkmanIdlMapper.selectLinkmanIdlList(linkmanIdl);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param linkmanIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLinkmanIdl(LinkmanIdl linkmanIdl)
    {
        return linkmanIdlMapper.insertLinkmanIdl(linkmanIdl);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param linkmanIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLinkmanIdl(LinkmanIdl linkmanIdl)
    {
        return linkmanIdlMapper.updateLinkmanIdl(linkmanIdl);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLinkmanIdlByDetailids(Long[] detailids)
    {
        return linkmanIdlMapper.deleteLinkmanIdlByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLinkmanIdlByDetailid(Long detailid)
    {
        return linkmanIdlMapper.deleteLinkmanIdlByDetailid(detailid);
    }
}
