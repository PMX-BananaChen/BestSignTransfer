package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.LicenseIdl;
import com.primax.bestsigntransfer.admin.mapper.LicenseIdlMapper;
import com.primax.bestsigntransfer.admin.service.ILicenseIdlService;
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
public class LicenseIdlServiceImpl implements ILicenseIdlService 
{
    @Resource
    private LicenseIdlMapper licenseIdlMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public LicenseIdl selectLicenseIdlByDetailid(Long detailid)
    {
        return licenseIdlMapper.selectLicenseIdlByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param licenseIdl 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LicenseIdl> selectLicenseIdlList(LicenseIdl licenseIdl)
    {
        return licenseIdlMapper.selectLicenseIdlList(licenseIdl);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param licenseIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLicenseIdl(LicenseIdl licenseIdl)
    {
        return licenseIdlMapper.insertLicenseIdl(licenseIdl);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param licenseIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLicenseIdl(LicenseIdl licenseIdl)
    {
        return licenseIdlMapper.updateLicenseIdl(licenseIdl);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLicenseIdlByDetailids(Long[] detailids)
    {
        return licenseIdlMapper.deleteLicenseIdlByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLicenseIdlByDetailid(Long detailid)
    {
        return licenseIdlMapper.deleteLicenseIdlByDetailid(detailid);
    }
}
