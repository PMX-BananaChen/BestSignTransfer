package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.to.CodeLanguage;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-16
 */
public interface ICodeLanguageService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public CodeLanguage selectCodeLanguageById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param codeLanguage 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<CodeLanguage> selectCodeLanguageList(CodeLanguage codeLanguage);

    /**
     * 新增【请填写功能名称】
     *
     * @param codeLanguage 【请填写功能名称】
     * @return 结果
     */
    public int insertCodeLanguage(CodeLanguage codeLanguage);

    /**
     * 修改【请填写功能名称】
     *
     * @param codeLanguage 【请填写功能名称】
     * @return 结果
     */
    public int updateCodeLanguage(CodeLanguage codeLanguage);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteCodeLanguageByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteCodeLanguageById(Long id);
}
