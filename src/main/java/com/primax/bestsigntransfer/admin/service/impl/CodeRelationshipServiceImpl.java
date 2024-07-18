package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.CodeRelationship;
import com.primax.bestsigntransfer.admin.mapper.CodeRelationshipMapper;
import com.primax.bestsigntransfer.admin.service.ICodeRelationshipService;
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
public class CodeRelationshipServiceImpl implements ICodeRelationshipService
{
    @Autowired
    private CodeRelationshipMapper codeRelationshipMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public CodeRelationship selectCodeRelationshipById(Long id)
    {
        return codeRelationshipMapper.selectCodeRelationshipById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param codeRelationship 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<CodeRelationship> selectCodeRelationshipList(CodeRelationship codeRelationship)
    {
        return codeRelationshipMapper.selectCodeRelationshipList(codeRelationship);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param codeRelationship 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCodeRelationship(CodeRelationship codeRelationship)
    {
        return codeRelationshipMapper.insertCodeRelationship(codeRelationship);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param codeRelationship 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCodeRelationship(CodeRelationship codeRelationship)
    {
        return codeRelationshipMapper.updateCodeRelationship(codeRelationship);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteCodeRelationshipByIds(Long[] ids)
    {
        return codeRelationshipMapper.deleteCodeRelationshipByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteCodeRelationshipById(Long id)
    {
        return codeRelationshipMapper.deleteCodeRelationshipById(id);
    }
}
