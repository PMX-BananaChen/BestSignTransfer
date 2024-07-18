package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.entity.FriendIdl;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author stan
 * @date 2022-05-06
 */
public interface IFriendIdlService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public FriendIdl selectFriendIdlByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param friendIdl 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FriendIdl> selectFriendIdlList(FriendIdl friendIdl);

    /**
     * 新增【请填写功能名称】
     * 
     * @param friendIdl 【请填写功能名称】
     * @return 结果
     */
    public int insertFriendIdl(FriendIdl friendIdl);

    /**
     * 修改【请填写功能名称】
     * 
     * @param friendIdl 【请填写功能名称】
     * @return 结果
     */
    public int updateFriendIdl(FriendIdl friendIdl);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteFriendIdlByDetailids(Long[] detailids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFriendIdlByDetailid(Long detailid);
}
