package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.entity.LanguageIdl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-14
 */
@Mapper
public interface LanguageIdlMapper extends BaseMapper<LanguageIdl>
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
     * 删除【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteLanguageIdlByDetailid(Long detailid);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLanguageIdlByDetailids(Long[] detailids);
}
