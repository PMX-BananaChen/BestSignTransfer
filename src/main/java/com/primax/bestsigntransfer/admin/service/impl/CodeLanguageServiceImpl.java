package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.CodeLanguage;
import com.primax.bestsigntransfer.admin.mapper.CodeLanguageMapper;
import com.primax.bestsigntransfer.admin.service.ICodeLanguageService;
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
public class CodeLanguageServiceImpl implements ICodeLanguageService
{
    @Autowired
    private CodeLanguageMapper codeLanguageMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public CodeLanguage selectCodeLanguageById(Long id)
    {
        return codeLanguageMapper.selectCodeLanguageById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param codeLanguage 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<CodeLanguage> selectCodeLanguageList(CodeLanguage codeLanguage)
    {
        return codeLanguageMapper.selectCodeLanguageList(codeLanguage);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param codeLanguage 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCodeLanguage(CodeLanguage codeLanguage)
    {
        return codeLanguageMapper.insertCodeLanguage(codeLanguage);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param codeLanguage 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCodeLanguage(CodeLanguage codeLanguage)
    {
        return codeLanguageMapper.updateCodeLanguage(codeLanguage);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteCodeLanguageByIds(Long[] ids)
    {
        return codeLanguageMapper.deleteCodeLanguageByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteCodeLanguageById(Long id)
    {
        return codeLanguageMapper.deleteCodeLanguageById(id);
    }
}
