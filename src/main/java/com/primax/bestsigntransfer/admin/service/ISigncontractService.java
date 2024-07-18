package com.primax.bestsigntransfer.admin.service;


import com.primax.bestsigntransfer.admin.domain.to.Signcontract;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-16
 */
public interface ISigncontractService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param contract 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Signcontract selectSigncontractByContract(String contract);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param signcontract 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Signcontract> selectSigncontractList(Signcontract signcontract);

    /**
     * 新增【请填写功能名称】
     *
     * @param signcontract 【请填写功能名称】
     * @return 结果
     */
    public int insertSigncontract(Signcontract signcontract);

    /**
     * 修改【请填写功能名称】
     *
     * @param signcontract 【请填写功能名称】
     * @return 结果
     */
    public int updateSigncontract(Signcontract signcontract);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param contracts 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSigncontractByContracts(String[] contracts);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param contract 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSigncontractByContract(String contract);
}
