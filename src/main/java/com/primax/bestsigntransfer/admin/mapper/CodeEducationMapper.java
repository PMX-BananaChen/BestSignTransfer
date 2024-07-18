package com.primax.bestsigntransfer.admin.mapper;

import com.primax.bestsigntransfer.admin.domain.to.CodeEducation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-16
 */
@Mapper
public interface CodeEducationMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public CodeEducation selectCodeEducationById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param codeEducation 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<CodeEducation> selectCodeEducationList(CodeEducation codeEducation);

    /**
     * 新增【请填写功能名称】
     *
     * @param codeEducation 【请填写功能名称】
     * @return 结果
     */
    public int insertCodeEducation(CodeEducation codeEducation);

    /**
     * 修改【请填写功能名称】
     *
     * @param codeEducation 【请填写功能名称】
     * @return 结果
     */
    public int updateCodeEducation(CodeEducation codeEducation);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteCodeEducationById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCodeEducationByIds(Long[] ids);
}
