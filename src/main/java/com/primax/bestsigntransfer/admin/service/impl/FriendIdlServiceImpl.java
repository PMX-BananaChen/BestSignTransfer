package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.FriendIdl;
import com.primax.bestsigntransfer.admin.mapper.FriendIdlMapper;
import com.primax.bestsigntransfer.admin.service.IFriendIdlService;
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
public class FriendIdlServiceImpl implements IFriendIdlService 
{
    @Resource
    private FriendIdlMapper friendIdlMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FriendIdl selectFriendIdlByDetailid(Long detailid)
    {
        return friendIdlMapper.selectFriendIdlByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param friendIdl 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FriendIdl> selectFriendIdlList(FriendIdl friendIdl)
    {
        return friendIdlMapper.selectFriendIdlList(friendIdl);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param friendIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFriendIdl(FriendIdl friendIdl)
    {
        return friendIdlMapper.insertFriendIdl(friendIdl);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param friendIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFriendIdl(FriendIdl friendIdl)
    {
        return friendIdlMapper.updateFriendIdl(friendIdl);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFriendIdlByDetailids(Long[] detailids)
    {
        return friendIdlMapper.deleteFriendIdlByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFriendIdlByDetailid(Long detailid)
    {
        return friendIdlMapper.deleteFriendIdlByDetailid(detailid);
    }
}
