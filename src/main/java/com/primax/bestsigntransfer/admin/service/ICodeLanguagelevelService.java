package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.to.CodeLanguagelevel;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-16
 */
public interface ICodeLanguagelevelService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public CodeLanguagelevel selectCodeLanguagelevelById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param codeLanguagelevel 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<CodeLanguagelevel> selectCodeLanguagelevelList(CodeLanguagelevel codeLanguagelevel);

    /**
     * 新增【请填写功能名称】
     *
     * @param codeLanguagelevel 【请填写功能名称】
     * @return 结果
     */
    public int insertCodeLanguagelevel(CodeLanguagelevel codeLanguagelevel);

    /**
     * 修改【请填写功能名称】
     *
     * @param codeLanguagelevel 【请填写功能名称】
     * @return 结果
     */
    public int updateCodeLanguagelevel(CodeLanguagelevel codeLanguagelevel);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteCodeLanguagelevelByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteCodeLanguagelevelById(Long id);
}
