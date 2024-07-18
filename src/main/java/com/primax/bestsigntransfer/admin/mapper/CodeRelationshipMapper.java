package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.to.CodeRelationship;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-16
 */
@Mapper
public interface CodeRelationshipMapper extends BaseMapper<CodeRelationship>
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
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteCodeRelationshipById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCodeRelationshipByIds(Long[] ids);
}