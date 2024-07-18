package com.primax.bestsigntransfer.admin.service;


import com.primax.bestsigntransfer.admin.domain.entity.LanguageIdl;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-14
 */
public interface ILanguageIdlService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public LanguageIdl selectLanguageIdlByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param languageIdl 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<LanguageIdl> selectLanguageIdlList(LanguageIdl languageIdl);

    /**
     * 新增【请填写功能名称】
     *
     * @param languageIdl 【请填写功能名称】
     * @return 结果
     */
    public int insertLanguageIdl(LanguageIdl languageIdl);

    /**
     * 修改【请填写功能名称】
     *
     * @param languageIdl 【请填写功能名称】
     * @return 结果
     */
    public int updateLanguageIdl(LanguageIdl languageIdl);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteLanguageIdlByDetailids(Long[] detailids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteLanguageIdlByDetailid(Long detailid);
}
