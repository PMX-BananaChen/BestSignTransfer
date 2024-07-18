package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.Disabledindividuals;
import com.primax.bestsigntransfer.admin.mapper.DisabledindividualsMapper;
import com.primax.bestsigntransfer.admin.service.IDisabledindividualsService;
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
public class DisabledindividualsServiceImpl implements IDisabledindividualsService
{
    @Resource
    private DisabledindividualsMapper disabledindividualsMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Disabledindividuals selectDisabledindividualsByDetailid(Long detailid)
    {
        return disabledindividualsMapper.selectDisabledindividualsByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param disabledindividuals 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Disabledindividuals> selectDisabledindividualsList(Disabledindividuals disabledindividuals)
    {
        return disabledindividualsMapper.selectDisabledindividualsList(disabledindividuals);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param disabledindividuals 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDisabledindividuals(Disabledindividuals disabledindividuals)
    {
        return disabledindividualsMapper.insertDisabledindividuals(disabledindividuals);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param disabledindividuals 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDisabledindividuals(Disabledindividuals disabledindividuals)
    {
        return disabledindividualsMapper.updateDisabledindividuals(disabledindividuals);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDisabledindividualsByDetailids(Long[] detailids)
    {
        return disabledindividualsMapper.deleteDisabledindividualsByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDisabledindividualsByDetailid(Long detailid)
    {
        return disabledindividualsMapper.deleteDisabledindividualsByDetailid(detailid);
    }
}
