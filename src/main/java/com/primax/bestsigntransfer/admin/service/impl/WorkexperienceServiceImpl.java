package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.Workexperience;
import com.primax.bestsigntransfer.admin.mapper.WorkexperienceMapper;
import com.primax.bestsigntransfer.admin.service.IWorkexperienceService;
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
public class WorkexperienceServiceImpl implements IWorkexperienceService 
{
    @Resource
    private WorkexperienceMapper workexperienceMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Workexperience selectWorkexperienceByDetailid(Long detailid)
    {
        return workexperienceMapper.selectWorkexperienceByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param workexperience 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Workexperience> selectWorkexperienceList(Workexperience workexperience)
    {
        return workexperienceMapper.selectWorkexperienceList(workexperience);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param workexperience 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertWorkexperience(Workexperience workexperience)
    {
        return workexperienceMapper.insertWorkexperience(workexperience);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param workexperience 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateWorkexperience(Workexperience workexperience)
    {
        return workexperienceMapper.updateWorkexperience(workexperience);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteWorkexperienceByDetailids(Long[] detailids)
    {
        return workexperienceMapper.deleteWorkexperienceByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteWorkexperienceByDetailid(Long detailid)
    {
        return workexperienceMapper.deleteWorkexperienceByDetailid(detailid);
    }
}
