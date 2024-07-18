package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.entity.LicenseIdl;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author stan
 * @date 2022-05-06
 */
public interface ILicenseIdlService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public LicenseIdl selectLicenseIdlByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param licenseIdl 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<LicenseIdl> selectLicenseIdlList(LicenseIdl licenseIdl);

    /**
     * 新增【请填写功能名称】
     * 
     * @param licenseIdl 【请填写功能名称】
     * @return 结果
     */
    public int insertLicenseIdl(LicenseIdl licenseIdl);

    /**
     * 修改【请填写功能名称】
     * 
     * @param licenseIdl 【请填写功能名称】
     * @return 结果
     */
    public int updateLicenseIdl(LicenseIdl licenseIdl);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteLicenseIdlByDetailids(Long[] detailids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteLicenseIdlByDetailid(Long detailid);
}
