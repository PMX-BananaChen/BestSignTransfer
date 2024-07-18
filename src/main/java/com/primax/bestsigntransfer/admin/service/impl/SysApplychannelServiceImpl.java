package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.SysApplychannel;
import com.primax.bestsigntransfer.admin.mapper.SysApplychannelMapper;
import com.primax.bestsigntransfer.admin.service.ISysApplychannelService;
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
public class SysApplychannelServiceImpl implements ISysApplychannelService 
{
    @Resource
    private SysApplychannelMapper sysApplychannelMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param applychannelid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysApplychannel selectSysApplychannelByApplychannelid(String applychannelid)
    {
        return sysApplychannelMapper.selectSysApplychannelByApplychannelid(applychannelid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysApplychannel 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysApplychannel> selectSysApplychannelList(SysApplychannel sysApplychannel)
    {
        return sysApplychannelMapper.selectSysApplychannelList(sysApplychannel);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysApplychannel 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysApplychannel(SysApplychannel sysApplychannel)
    {
        return sysApplychannelMapper.insertSysApplychannel(sysApplychannel);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysApplychannel 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysApplychannel(SysApplychannel sysApplychannel)
    {
        return sysApplychannelMapper.updateSysApplychannel(sysApplychannel);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param applychannelids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysApplychannelByApplychannelids(String[] applychannelids)
    {
        return sysApplychannelMapper.deleteSysApplychannelByApplychannelids(applychannelids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param applychannelid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysApplychannelByApplychannelid(String applychannelid)
    {
        return sysApplychannelMapper.deleteSysApplychannelByApplychannelid(applychannelid);
    }
}
