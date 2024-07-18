package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.OthercompanyIdl;
import com.primax.bestsigntransfer.admin.mapper.OthercompanyIdlMapper;
import com.primax.bestsigntransfer.admin.service.IOthercompanyIdlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author stan
 * @date 2022-05-12
 */
@Service
public class OthercompanyIdlServiceImpl implements IOthercompanyIdlService
{
    @Resource
    private OthercompanyIdlMapper othercompanyIdlMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public OthercompanyIdl selectOthercompanyIdlByDetailid(Long detailid)
    {
        return othercompanyIdlMapper.selectOthercompanyIdlByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param othercompanyIdl 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OthercompanyIdl> selectOthercompanyIdlList(OthercompanyIdl othercompanyIdl)
    {
        return othercompanyIdlMapper.selectOthercompanyIdlList(othercompanyIdl);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param othercompanyIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOthercompanyIdl(OthercompanyIdl othercompanyIdl)
    {
        return othercompanyIdlMapper.insertOthercompanyIdl(othercompanyIdl);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param othercompanyIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOthercompanyIdl(OthercompanyIdl othercompanyIdl)
    {
        return othercompanyIdlMapper.updateOthercompanyIdl(othercompanyIdl);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOthercompanyIdlByDetailids(Long[] detailids)
    {
        return othercompanyIdlMapper.deleteOthercompanyIdlByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteOthercompanyIdlByDetailid(Long detailid)
    {
        return othercompanyIdlMapper.deleteOthercompanyIdlByDetailid(detailid);
    }
}
