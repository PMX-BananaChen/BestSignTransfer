package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.Vaccine;
import com.primax.bestsigntransfer.admin.mapper.VaccineMapper;
import com.primax.bestsigntransfer.admin.service.IVaccineService;
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
public class VaccineServiceImpl implements IVaccineService 
{
    @Resource
    private VaccineMapper vaccineMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Vaccine selectVaccineByDetailid(Long detailid)
    {
        return vaccineMapper.selectVaccineByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vaccine 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Vaccine> selectVaccineList(Vaccine vaccine)
    {
        return vaccineMapper.selectVaccineList(vaccine);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param vaccine 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertVaccine(Vaccine vaccine)
    {
        return vaccineMapper.insertVaccine(vaccine);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param vaccine 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateVaccine(Vaccine vaccine)
    {
        return vaccineMapper.updateVaccine(vaccine);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVaccineByDetailids(Long[] detailids)
    {
        return vaccineMapper.deleteVaccineByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVaccineByDetailid(Long detailid)
    {
        return vaccineMapper.deleteVaccineByDetailid(detailid);
    }
}
