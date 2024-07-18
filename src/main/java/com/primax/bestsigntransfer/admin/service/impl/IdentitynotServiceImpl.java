package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.Identitynot;
import com.primax.bestsigntransfer.admin.mapper.IdentitynotMapper;
import com.primax.bestsigntransfer.admin.service.IIdentitynotService;
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
public class IdentitynotServiceImpl implements IIdentitynotService 
{
    @Resource
    private IdentitynotMapper identitynotMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param identityno 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Identitynot selectIdentitynotByIdentityno(String identityno)
    {
        return identitynotMapper.selectIdentitynotByIdentityno(identityno);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param identitynot 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Identitynot> selectIdentitynotList(Identitynot identitynot)
    {
        return identitynotMapper.selectIdentitynotList(identitynot);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param identitynot 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertIdentitynot(Identitynot identitynot)
    {
        return identitynotMapper.insertIdentitynot(identitynot);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param identitynot 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateIdentitynot(Identitynot identitynot)
    {
        return identitynotMapper.updateIdentitynot(identitynot);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param identitynos 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteIdentitynotByIdentitynos(String[] identitynos)
    {
        return identitynotMapper.deleteIdentitynotByIdentitynos(identitynos);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param identityno 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteIdentitynotByIdentityno(String identityno)
    {
        return identitynotMapper.deleteIdentitynotByIdentityno(identityno);
    }
}
