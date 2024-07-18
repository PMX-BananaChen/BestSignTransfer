package com.primax.bestsigntransfer.admin.mapper;

import com.primax.bestsigntransfer.admin.domain.entity.Identitynot;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author stan
 * @date 2022-05-06
 */
@Mapper
public interface IdentitynotMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param identityno 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteIdentitynotByIdentityno(String identityno);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param identitynos 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIdentitynotByIdentitynos(String[] identitynos);
}
