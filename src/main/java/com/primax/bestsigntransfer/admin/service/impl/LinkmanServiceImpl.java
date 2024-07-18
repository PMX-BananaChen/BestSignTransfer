package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.Linkman;
import com.primax.bestsigntransfer.admin.mapper.LinkmanMapper;
import com.primax.bestsigntransfer.admin.service.ILinkmanService;
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
public class LinkmanServiceImpl implements ILinkmanService 
{
    @Resource
    private LinkmanMapper linkmanMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Linkman selectLinkmanByDetailid(Long detailid)
    {
        return linkmanMapper.selectLinkmanByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param linkman 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Linkman> selectLinkmanList(Linkman linkman)
    {
        return linkmanMapper.selectLinkmanList(linkman);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param linkman 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLinkman(Linkman linkman)
    {
        return linkmanMapper.insertLinkman(linkman);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param linkman 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLinkman(Linkman linkman)
    {
        return linkmanMapper.updateLinkman(linkman);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLinkmanByDetailids(Long[] detailids)
    {
        return linkmanMapper.deleteLinkmanByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLinkmanByDetailid(Long detailid)
    {
        return linkmanMapper.deleteLinkmanByDetailid(detailid);
    }
}
