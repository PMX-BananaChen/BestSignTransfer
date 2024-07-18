package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.to.Entrytype;
import com.primax.bestsigntransfer.admin.mapper.EntrytypeMapper;
import com.primax.bestsigntransfer.admin.service.IEntrytypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author stan
 * @date 2022-05-16
 */
@Service
public class EntrytypeServiceImpl implements IEntrytypeService
{
    @Resource
    private EntrytypeMapper entrytypeMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param entryid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Entrytype selectEntrytypeByEntryid(String entryid)
    {
        return entrytypeMapper.selectEntrytypeByEntryid(entryid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param entrytype 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Entrytype> selectEntrytypeList(Entrytype entrytype)
    {
        return entrytypeMapper.selectEntrytypeList(entrytype);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param entrytype 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEntrytype(Entrytype entrytype)
    {
        return entrytypeMapper.insertEntrytype(entrytype);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param entrytype 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEntrytype(Entrytype entrytype)
    {
        return entrytypeMapper.updateEntrytype(entrytype);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param entryids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEntrytypeByEntryids(String[] entryids)
    {
        return entrytypeMapper.deleteEntrytypeByEntryids(entryids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param entryid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEntrytypeByEntryid(String entryid)
    {
        return entrytypeMapper.deleteEntrytypeByEntryid(entryid);
    }
}
