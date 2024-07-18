package com.primax.bestsigntransfer.admin.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.primax.bestsigntransfer.admin.domain.entity.Education;
import com.primax.bestsigntransfer.admin.domain.entity.EducationIdl;
import com.primax.bestsigntransfer.admin.mapper.EducationIdlMapper;
import com.primax.bestsigntransfer.admin.mapper.EducationMapper;
import com.primax.bestsigntransfer.admin.service.IEducationIdlService;
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
public class EducationIdlServiceImpl implements IEducationIdlService
{
    @Resource
    private EducationIdlMapper educationIdlMapper;

    @Resource
    private EducationMapper educationMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public EducationIdl selectEducationIdlByDetailid(Long detailid)
    {
        return educationIdlMapper.selectEducationIdlByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param educationIdl 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<EducationIdl> selectEducationIdlList(EducationIdl educationIdl)
    {
        return educationIdlMapper.selectEducationIdlList(educationIdl);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param educationIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEducationIdl(EducationIdl educationIdl)
    {
        return educationIdlMapper.insertEducationIdl(educationIdl);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param educationIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEducationIdl(EducationIdl educationIdl)
    {
        return educationIdlMapper.updateEducationIdl(educationIdl);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEducationIdlByDetailids(Long[] detailids)
    {
        return educationIdlMapper.deleteEducationIdlByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEducationIdlByDetailid(Long detailid)
    {
        return educationIdlMapper.deleteEducationIdlByDetailid(detailid);
    }

    @Override
    @DS("DL_Inauguration_DG")
    public List<Education> selectEducationIdlDGList(String id) {
        return educationMapper.selectList(Wrappers.<Education>query().lambda().eq(Education::getParentid, id));
    }

    @Override
    @DS("DL_Inauguration_CQ")
    public List<Education> selectEducationIdlCQList(String id) {
        return educationMapper.selectList(Wrappers.<Education>query().lambda().eq(Education::getParentid, id));
    }

    @Override
    @DS("DL_Inauguration_KS")
    public List<Education> selectEducationIdlKSList(String id) {
        return educationMapper.selectList(Wrappers.<Education>query().lambda().eq(Education::getParentid, id));
    }
}
