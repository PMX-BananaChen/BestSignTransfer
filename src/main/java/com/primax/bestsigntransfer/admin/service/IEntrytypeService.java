package com.primax.bestsigntransfer.admin.service;


import com.primax.bestsigntransfer.admin.domain.to.Entrytype;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author stan
 * @date 2022-05-16
 */
public interface IEntrytypeService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param entryid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Entrytype selectEntrytypeByEntryid(String entryid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param entrytype 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Entrytype> selectEntrytypeList(Entrytype entrytype);

    /**
     * 新增【请填写功能名称】
     *
     * @param entrytype 【请填写功能名称】
     * @return 结果
     */
    public int insertEntrytype(Entrytype entrytype);

    /**
     * 修改【请填写功能名称】
     *
     * @param entrytype 【请填写功能名称】
     * @return 结果
     */
    public int updateEntrytype(Entrytype entrytype);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param entryids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteEntrytypeByEntryids(String[] entryids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param entryid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEntrytypeByEntryid(String entryid);
}
