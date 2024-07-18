package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.entity.Families;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-06
 */
@Mapper
public interface FamiliesMapper extends BaseMapper<Families>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Families selectFamiliesByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param families 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Families> selectFamiliesList(Families families);

    /**
     * 新增【请填写功能名称】
     *
     * @param families 【请填写功能名称】
     * @return 结果
     */
    public int insertFamilies(Families families);

    /**
     * 修改【请填写功能名称】
     *
     * @param families 【请填写功能名称】
     * @return 结果
     */
    public int updateFamilies(Families families);

    /**
     * 删除【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFamiliesByDetailid(Long detailid);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFamiliesByDetailids(Long[] detailids);
}
