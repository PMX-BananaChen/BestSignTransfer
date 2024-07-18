package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.to.CodeRelationship;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-16
 */
public interface ICodeRelationshipService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public CodeRelationship selectCodeRelationshipById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param codeRelationship 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<CodeRelationship> selectCodeRelationshipList(CodeRelationship codeRelationship);

    /**
     * 新增【请填写功能名称】
     *
     * @param codeRelationship 【请填写功能名称】
     * @return 结果
     */
    public int insertCodeRelationship(CodeRelationship codeRelationship);

    /**
     * 修改【请填写功能名称】
     *
     * @param codeRelationship 【请填写功能名称】
     * @return 结果
     */
    public int updateCodeRelationship(CodeRelationship codeRelationship);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteCodeRelationshipByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteCodeRelationshipById(Long id);
}
