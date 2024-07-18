package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.entity.Signcabinet;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-12
 */
public interface ISigncabinetService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param cabinet 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Signcabinet selectSigncabinetByCabinet(String cabinet);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param signcabinet 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Signcabinet> selectSigncabinetList(Signcabinet signcabinet);

    /**
     * 新增【请填写功能名称】
     *
     * @param signcabinet 【请填写功能名称】
     * @return 结果
     */
    public int insertSigncabinet(Signcabinet signcabinet);

    /**
     * 修改【请填写功能名称】
     *
     * @param signcabinet 【请填写功能名称】
     * @return 结果
     */
    public int updateSigncabinet(Signcabinet signcabinet);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param cabinets 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSigncabinetByCabinets(String[] cabinets);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param cabinet 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSigncabinetByCabinet(String cabinet);

    Signcabinet selectSigncabinet(String archiveId);
}
