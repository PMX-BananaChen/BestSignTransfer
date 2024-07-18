package com.primax.bestsigntransfer.admin.service.impl;

import com.primax.bestsigntransfer.admin.domain.entity.LanguageIdl;
import com.primax.bestsigntransfer.admin.mapper.LanguageIdlMapper;
import com.primax.bestsigntransfer.admin.service.ILanguageIdlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author stan
 * @date 2022-05-14
 */
@Service
public class LanguageIdlServiceImpl implements ILanguageIdlService
{
    @Resource
    private LanguageIdlMapper languageIdlMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public LanguageIdl selectLanguageIdlByDetailid(Long detailid)
    {
        return languageIdlMapper.selectLanguageIdlByDetailid(detailid);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param languageIdl 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LanguageIdl> selectLanguageIdlList(LanguageIdl languageIdl)
    {
        return languageIdlMapper.selectLanguageIdlList(languageIdl);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param languageIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLanguageIdl(LanguageIdl languageIdl)
    {
        return languageIdlMapper.insertLanguageIdl(languageIdl);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param languageIdl 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLanguageIdl(LanguageIdl languageIdl)
    {
        return languageIdlMapper.updateLanguageIdl(languageIdl);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLanguageIdlByDetailids(Long[] detailids)
    {
        return languageIdlMapper.deleteLanguageIdlByDetailids(detailids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLanguageIdlByDetailid(Long detailid)
    {
        return languageIdlMapper.deleteLanguageIdlByDetailid(detailid);
    }
}
