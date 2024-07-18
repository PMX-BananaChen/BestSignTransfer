package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.Religiousactivities;
import com.primax.bestsigntransfer.admin.mapper.ReligiousactivitiesMapper;
import com.primax.bestsigntransfer.admin.service.IReligiousactivitiesService;
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
public class ReligiousactivitiesServiceImpl implements IReligiousactivitiesService
{
    @Resource
    private ReligiousactivitiesMapper religiousactivitiesMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Religiousactivities selectReligiousactivitiesByDetailid(Long detailid)
    {
        return religiousactivitiesMapper.selectReligiousactivitiesByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param religiousactivities 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Religiousactivities> selectReligiousactivitiesList(Religiousactivities religiousactivities)
    {
        return religiousactivitiesMapper.selectReligiousactivitiesList(religiousactivities);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param religiousactivities 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertReligiousactivities(Religiousactivities religiousactivities)
    {
        return religiousactivitiesMapper.insertReligiousactivities(religiousactivities);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param religiousactivities 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateReligiousactivities(Religiousactivities religiousactivities)
    {
        return religiousactivitiesMapper.updateReligiousactivities(religiousactivities);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteReligiousactivitiesByDetailids(Long[] detailids)
    {
        return religiousactivitiesMapper.deleteReligiousactivitiesByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteReligiousactivitiesByDetailid(Long detailid)
    {
        return religiousactivitiesMapper.deleteReligiousactivitiesByDetailid(detailid);
    }
}
