package com.primax.bestsigntransfer.admin.mapper;

import com.primax.bestsigntransfer.admin.domain.entity.SysPropaganda;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author stan
 * @date 2022-05-06
 */
@Mapper
public interface SysPropagandaMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param propagandaid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysPropagandaByPropagandaid(String propagandaid);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param propagandaids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysPropagandaByPropagandaids(String[] propagandaids);
}
