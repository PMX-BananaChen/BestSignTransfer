package com.primax.bestsigntransfer.admin.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.primax.bestsigntransfer.admin.domain.entity.Signcabinet;
import com.primax.bestsigntransfer.admin.mapper.SigncabinetMapper;
import com.primax.bestsigntransfer.admin.service.ISigncabinetService;
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
public class SigncabinetServiceImpl implements ISigncabinetService
{
    @Resource
    private SigncabinetMapper signcabinetMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param cabinet 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Signcabinet selectSigncabinetByCabinet(String cabinet)
    {
        return signcabinetMapper.selectSigncabinetByCabinet(cabinet);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param signcabinet 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Signcabinet> selectSigncabinetList(Signcabinet signcabinet)
    {
        return signcabinetMapper.selectSigncabinetList(signcabinet);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param signcabinet 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSigncabinet(Signcabinet signcabinet)
    {
        return signcabinetMapper.insertSigncabinet(signcabinet);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param signcabinet 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSigncabinet(Signcabinet signcabinet)
    {
        return signcabinetMapper.updateSigncabinet(signcabinet);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param cabinets 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSigncabinetByCabinets(String[] cabinets)
    {
        return signcabinetMapper.deleteSigncabinetByCabinets(cabinets);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param cabinet 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSigncabinetByCabinet(String cabinet)
    {
        return signcabinetMapper.deleteSigncabinetByCabinet(cabinet);
    }

    @Override
    public Signcabinet selectSigncabinet(String archiveId) {
        return signcabinetMapper.selectOne(Wrappers.<Signcabinet>query().lambda().eq(Signcabinet::getCabinet, archiveId));
    }
}
