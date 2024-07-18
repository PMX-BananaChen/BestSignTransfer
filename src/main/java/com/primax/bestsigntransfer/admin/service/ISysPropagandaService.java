package com.primax.bestsigntransfer.admin.service;

import java.util.List;
import com.primax.bestsigntransfer.admin.domain.entity.SysPropaganda;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author stan
 * @date 2022-05-06
 */
public interface ISysPropagandaService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param propagandaid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysPropaganda selectSysPropagandaByPropagandaid(String propagandaid);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysPropaganda 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysPropaganda> selectSysPropagandaList(SysPropaganda sysPropaganda);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysPropaganda 【请填写功能名称】
     * @return 结果
     */
    public int insertSysPropaganda(SysPropaganda sysPropaganda);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysPropaganda 【请填写功能名称】
     * @return 结果
     */
    public int updateSysPropaganda(SysPropaganda sysPropaganda);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param propagandaids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSysPropagandaByPropagandaids(String[] propagandaids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param propagandaid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysPropagandaByPropagandaid(String propagandaid);
}
