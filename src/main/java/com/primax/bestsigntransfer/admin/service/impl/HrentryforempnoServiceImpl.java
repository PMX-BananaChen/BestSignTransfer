package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.Hrentryforempno;
import com.primax.bestsigntransfer.admin.mapper.HrentryforempnoMapper;
import com.primax.bestsigntransfer.admin.service.IHrentryforempnoService;
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
public class HrentryforempnoServiceImpl implements IHrentryforempnoService 
{
    @Resource
    private HrentryforempnoMapper hrentryforempnoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param identityno 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Hrentryforempno selectHrentryforempnoByIdentityno(String identityno)
    {
        return hrentryforempnoMapper.selectHrentryforempnoByIdentityno(identityno);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param hrentryforempno 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Hrentryforempno> selectHrentryforempnoList(Hrentryforempno hrentryforempno)
    {
        return hrentryforempnoMapper.selectHrentryforempnoList(hrentryforempno);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param hrentryforempno 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertHrentryforempno(Hrentryforempno hrentryforempno)
    {
        return hrentryforempnoMapper.insertHrentryforempno(hrentryforempno);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param hrentryforempno 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateHrentryforempno(Hrentryforempno hrentryforempno)
    {
        return hrentryforempnoMapper.updateHrentryforempno(hrentryforempno);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param identitynos 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteHrentryforempnoByIdentitynos(String[] identitynos)
    {
        return hrentryforempnoMapper.deleteHrentryforempnoByIdentitynos(identitynos);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param identityno 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteHrentryforempnoByIdentityno(String identityno)
    {
        return hrentryforempnoMapper.deleteHrentryforempnoByIdentityno(identityno);
    }
}
