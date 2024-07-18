package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.entity.Identitynot;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author stan
 * @date 2022-05-06
 */
public interface IIdentitynotService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param identityno 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Identitynot selectIdentitynotByIdentityno(String identityno);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param identitynot 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Identitynot> selectIdentitynotList(Identitynot identitynot);

    /**
     * 新增【请填写功能名称】
     * 
     * @param identitynot 【请填写功能名称】
     * @return 结果
     */
    public int insertIdentitynot(Identitynot identitynot);

    /**
     * 修改【请填写功能名称】
     * 
     * @param identitynot 【请填写功能名称】
     * @return 结果
     */
    public int updateIdentitynot(Identitynot identitynot);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param identitynos 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteIdentitynotByIdentitynos(String[] identitynos);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param identityno 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteIdentitynotByIdentityno(String identityno);
}
