package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.VaccineIdl;
import com.primax.bestsigntransfer.admin.mapper.VaccineIdlMapper;
import com.primax.bestsigntransfer.admin.service.IVaccineIdlService;
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
public class VaccineIdlServiceImpl implements IVaccineIdlService 
{
    @Resource
    private VaccineIdlMapper vaccineIdlMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public VaccineIdl selectVaccineIdlByDetailid(Long detailid)
    {
        return vaccineIdlMapper.selectVaccineIdlByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vaccineIdl 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<VaccineIdl> selectVaccineIdlList(VaccineIdl vaccineIdl)
    {
        return vaccineIdlMapper.selectVaccineIdlList(vaccineIdl);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param vaccineIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertVaccineIdl(VaccineIdl vaccineIdl)
    {
        return vaccineIdlMapper.insertVaccineIdl(vaccineIdl);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param vaccineIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateVaccineIdl(VaccineIdl vaccineIdl)
    {
        return vaccineIdlMapper.updateVaccineIdl(vaccineIdl);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVaccineIdlByDetailids(Long[] detailids)
    {
        return vaccineIdlMapper.deleteVaccineIdlByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVaccineIdlByDetailid(Long detailid)
    {
        return vaccineIdlMapper.deleteVaccineIdlByDetailid(detailid);
    }
}
