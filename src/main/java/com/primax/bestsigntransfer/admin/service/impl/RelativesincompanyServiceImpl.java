package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.Relativesincompany;
import com.primax.bestsigntransfer.admin.mapper.RelativesincompanyMapper;
import com.primax.bestsigntransfer.admin.service.IRelativesincompanyService;
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
public class RelativesincompanyServiceImpl implements IRelativesincompanyService 
{
    @Resource
    private RelativesincompanyMapper relativesincompanyMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Relativesincompany selectRelativesincompanyByDetailid(Long detailid)
    {
        return relativesincompanyMapper.selectRelativesincompanyByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param relativesincompany 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Relativesincompany> selectRelativesincompanyList(Relativesincompany relativesincompany)
    {
        return relativesincompanyMapper.selectRelativesincompanyList(relativesincompany);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param relativesincompany 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertRelativesincompany(Relativesincompany relativesincompany)
    {
        return relativesincompanyMapper.insertRelativesincompany(relativesincompany);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param relativesincompany 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateRelativesincompany(Relativesincompany relativesincompany)
    {
        return relativesincompanyMapper.updateRelativesincompany(relativesincompany);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteRelativesincompanyByDetailids(Long[] detailids)
    {
        return relativesincompanyMapper.deleteRelativesincompanyByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteRelativesincompanyByDetailid(Long detailid)
    {
        return relativesincompanyMapper.deleteRelativesincompanyByDetailid(detailid);
    }
}
