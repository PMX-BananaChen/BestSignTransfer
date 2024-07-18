package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.entity.SysApplychannel;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author stan
 * @date 2022-05-06
 */
public interface ISysApplychannelService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param applychannelid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysApplychannel selectSysApplychannelByApplychannelid(String applychannelid);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysApplychannel 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysApplychannel> selectSysApplychannelList(SysApplychannel sysApplychannel);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysApplychannel 【请填写功能名称】
     * @return 结果
     */
    public int insertSysApplychannel(SysApplychannel sysApplychannel);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysApplychannel 【请填写功能名称】
     * @return 结果
     */
    public int updateSysApplychannel(SysApplychannel sysApplychannel);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param applychannelids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSysApplychannelByApplychannelids(String[] applychannelids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param applychannelid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysApplychannelByApplychannelid(String applychannelid);
}
