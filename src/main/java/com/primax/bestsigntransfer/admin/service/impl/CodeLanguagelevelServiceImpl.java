package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.CodeLanguagelevel;
import com.primax.bestsigntransfer.admin.mapper.CodeLanguagelevelMapper;
import com.primax.bestsigntransfer.admin.service.ICodeLanguagelevelService;
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
public class CodeLanguagelevelServiceImpl implements ICodeLanguagelevelService
{
    @Autowired
    private CodeLanguagelevelMapper codeLanguagelevelMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public CodeLanguagelevel selectCodeLanguagelevelById(Long id)
    {
        return codeLanguagelevelMapper.selectCodeLanguagelevelById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param codeLanguagelevel 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<CodeLanguagelevel> selectCodeLanguagelevelList(CodeLanguagelevel codeLanguagelevel)
    {
        return codeLanguagelevelMapper.selectCodeLanguagelevelList(codeLanguagelevel);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param codeLanguagelevel 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCodeLanguagelevel(CodeLanguagelevel codeLanguagelevel)
    {
        return codeLanguagelevelMapper.insertCodeLanguagelevel(codeLanguagelevel);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param codeLanguagelevel 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCodeLanguagelevel(CodeLanguagelevel codeLanguagelevel)
    {
        return codeLanguagelevelMapper.updateCodeLanguagelevel(codeLanguagelevel);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteCodeLanguagelevelByIds(Long[] ids)
    {
        return codeLanguagelevelMapper.deleteCodeLanguagelevelByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteCodeLanguagelevelById(Long id)
    {
        return codeLanguagelevelMapper.deleteCodeLanguagelevelById(id);
    }
}
