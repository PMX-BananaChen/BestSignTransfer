package com.primax.bestsigntransfer.admin.service;

import java.util.List;
import com.primax.bestsigntransfer.admin.domain.entity.VaccineIdl;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author stan
 * @date 2022-05-06
 */
public interface IVaccineIdlService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public VaccineIdl selectVaccineIdlByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vaccineIdl 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<VaccineIdl> selectVaccineIdlList(VaccineIdl vaccineIdl);

    /**
     * 新增【请填写功能名称】
     * 
     * @param vaccineIdl 【请填写功能名称】
     * @return 结果
     */
    public int insertVaccineIdl(VaccineIdl vaccineIdl);

    /**
     * 修改【请填写功能名称】
     * 
     * @param vaccineIdl 【请填写功能名称】
     * @return 结果
     */
    public int updateVaccineIdl(VaccineIdl vaccineIdl);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param detailids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteVaccineIdlByDetailids(Long[] detailids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteVaccineIdlByDetailid(Long detailid);
}
