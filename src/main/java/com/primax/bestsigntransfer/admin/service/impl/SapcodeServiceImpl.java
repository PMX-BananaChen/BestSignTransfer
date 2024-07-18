package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.Sapcode;
import com.primax.bestsigntransfer.admin.mapper.SapcodeMapper;
import com.primax.bestsigntransfer.admin.service.ISapcodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author stan
 * @date 2022-05-16
 */
@Service
public class SapcodeServiceImpl implements ISapcodeService
{
    @Resource
    private SapcodeMapper sapcodeMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Sapcode selectSapcodeById(Long id)
    {
        return sapcodeMapper.selectSapcodeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sapcode 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Sapcode> selectSapcodeList(Sapcode sapcode)
    {
        return sapcodeMapper.selectSapcodeList(sapcode);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param sapcode 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSapcode(Sapcode sapcode)
    {
        return sapcodeMapper.insertSapcode(sapcode);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param sapcode 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSapcode(Sapcode sapcode)
    {
        return sapcodeMapper.updateSapcode(sapcode);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSapcodeByIds(Long[] ids)
    {
        return sapcodeMapper.deleteSapcodeByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSapcodeById(Long id)
    {
        return sapcodeMapper.deleteSapcodeById(id);
    }
}
