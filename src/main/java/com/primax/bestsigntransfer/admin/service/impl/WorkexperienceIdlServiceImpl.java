package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.WorkexperienceIdl;
import com.primax.bestsigntransfer.admin.mapper.WorkexperienceIdlMapper;
import com.primax.bestsigntransfer.admin.service.IWorkexperienceIdlService;
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
public class WorkexperienceIdlServiceImpl implements IWorkexperienceIdlService 
{
    @Resource
    private WorkexperienceIdlMapper workexperienceIdlMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public WorkexperienceIdl selectWorkexperienceIdlByDetailid(Long detailid)
    {
        return workexperienceIdlMapper.selectWorkexperienceIdlByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param workexperienceIdl 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<WorkexperienceIdl> selectWorkexperienceIdlList(WorkexperienceIdl workexperienceIdl)
    {
        return workexperienceIdlMapper.selectWorkexperienceIdlList(workexperienceIdl);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param workexperienceIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertWorkexperienceIdl(WorkexperienceIdl workexperienceIdl)
    {
        return workexperienceIdlMapper.insertWorkexperienceIdl(workexperienceIdl);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param workexperienceIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateWorkexperienceIdl(WorkexperienceIdl workexperienceIdl)
    {
        return workexperienceIdlMapper.updateWorkexperienceIdl(workexperienceIdl);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteWorkexperienceIdlByDetailids(Long[] detailids)
    {
        return workexperienceIdlMapper.deleteWorkexperienceIdlByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteWorkexperienceIdlByDetailid(Long detailid)
    {
        return workexperienceIdlMapper.deleteWorkexperienceIdlByDetailid(detailid);
    }
}
