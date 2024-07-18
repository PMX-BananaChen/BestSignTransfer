package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.DlRelativesincompany;
import com.primax.bestsigntransfer.admin.mapper.DlRelativesincompanyMapper;
import com.primax.bestsigntransfer.admin.service.IDlRelativesincompanyService;
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
public class DlRelativesincompanyServiceImpl implements IDlRelativesincompanyService
{
    @Autowired
    private DlRelativesincompanyMapper dlRelativesincompanyMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public DlRelativesincompany selectDlRelativesincompanyById(Long id)
    {
        return dlRelativesincompanyMapper.selectDlRelativesincompanyById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param dlRelativesincompany 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DlRelativesincompany> selectDlRelativesincompanyList(DlRelativesincompany dlRelativesincompany)
    {
        return dlRelativesincompanyMapper.selectDlRelativesincompanyList(dlRelativesincompany);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param dlRelativesincompany 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDlRelativesincompany(DlRelativesincompany dlRelativesincompany)
    {
        return dlRelativesincompanyMapper.insertDlRelativesincompany(dlRelativesincompany);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param dlRelativesincompany 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDlRelativesincompany(DlRelativesincompany dlRelativesincompany)
    {
        return dlRelativesincompanyMapper.updateDlRelativesincompany(dlRelativesincompany);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDlRelativesincompanyByIds(Long[] ids)
    {
        return dlRelativesincompanyMapper.deleteDlRelativesincompanyByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDlRelativesincompanyById(Long id)
    {
        return dlRelativesincompanyMapper.deleteDlRelativesincompanyById(id);
    }
}
