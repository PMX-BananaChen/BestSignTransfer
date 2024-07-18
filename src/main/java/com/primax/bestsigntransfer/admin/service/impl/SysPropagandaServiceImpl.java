package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.SysPropaganda;
import com.primax.bestsigntransfer.admin.mapper.SysPropagandaMapper;
import com.primax.bestsigntransfer.admin.service.ISysPropagandaService;
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
public class SysPropagandaServiceImpl implements ISysPropagandaService 
{
    @Resource
    private SysPropagandaMapper sysPropagandaMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param propagandaid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysPropaganda selectSysPropagandaByPropagandaid(String propagandaid)
    {
        return sysPropagandaMapper.selectSysPropagandaByPropagandaid(propagandaid);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysPropaganda 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysPropaganda> selectSysPropagandaList(SysPropaganda sysPropaganda)
    {
        return sysPropagandaMapper.selectSysPropagandaList(sysPropaganda);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysPropaganda 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysPropaganda(SysPropaganda sysPropaganda)
    {
        return sysPropagandaMapper.insertSysPropaganda(sysPropaganda);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysPropaganda 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysPropaganda(SysPropaganda sysPropaganda)
    {
        return sysPropagandaMapper.updateSysPropaganda(sysPropaganda);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param propagandaids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysPropagandaByPropagandaids(String[] propagandaids)
    {
        return sysPropagandaMapper.deleteSysPropagandaByPropagandaids(propagandaids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param propagandaid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysPropagandaByPropagandaid(String propagandaid)
    {
        return sysPropagandaMapper.deleteSysPropagandaByPropagandaid(propagandaid);
    }
}
