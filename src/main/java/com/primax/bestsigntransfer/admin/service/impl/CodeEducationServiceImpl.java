package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.CodeEducation;
import com.primax.bestsigntransfer.admin.mapper.CodeEducationMapper;
import com.primax.bestsigntransfer.admin.service.ICodeEducationService;
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
public class CodeEducationServiceImpl implements ICodeEducationService
{
    @Resource
    private CodeEducationMapper codeEducationMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public CodeEducation selectCodeEducationById(Long id)
    {
        return codeEducationMapper.selectCodeEducationById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param codeEducation 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<CodeEducation> selectCodeEducationList(CodeEducation codeEducation)
    {
        return codeEducationMapper.selectCodeEducationList(codeEducation);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param codeEducation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCodeEducation(CodeEducation codeEducation)
    {
        return codeEducationMapper.insertCodeEducation(codeEducation);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param codeEducation 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCodeEducation(CodeEducation codeEducation)
    {
        return codeEducationMapper.updateCodeEducation(codeEducation);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteCodeEducationByIds(Long[] ids)
    {
        return codeEducationMapper.deleteCodeEducationByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteCodeEducationById(Long id)
    {
        return codeEducationMapper.deleteCodeEducationById(id);
    }
}
