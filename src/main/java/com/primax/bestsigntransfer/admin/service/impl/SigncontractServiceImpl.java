package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.Signcontract;
import com.primax.bestsigntransfer.admin.mapper.SigncontractMapper;
import com.primax.bestsigntransfer.admin.service.ISigncontractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author stan
 * @date 2022-05-16
 */
@Service
public class SigncontractServiceImpl implements ISigncontractService
{
    @Autowired
    private SigncontractMapper signcontractMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param contract 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Signcontract selectSigncontractByContract(String contract)
    {
        return signcontractMapper.selectSigncontractByContract(contract);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param signcontract 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Signcontract> selectSigncontractList(Signcontract signcontract)
    {
        return signcontractMapper.selectSigncontractList(signcontract);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param signcontract 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSigncontract(Signcontract signcontract)
    {
        return signcontractMapper.insertSigncontract(signcontract);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param signcontract 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSigncontract(Signcontract signcontract)
    {
        return signcontractMapper.updateSigncontract(signcontract);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param contracts 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSigncontractByContracts(String[] contracts)
    {
        return signcontractMapper.deleteSigncontractByContracts(contracts);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param contract 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSigncontractByContract(String contract)
    {
        return signcontractMapper.deleteSigncontractByContract(contract);
    }
}
