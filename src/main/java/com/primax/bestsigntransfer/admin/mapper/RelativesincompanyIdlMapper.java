package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.entity.RelativesincompanyIdl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-06
 */
@Mapper
public interface RelativesincompanyIdlMapper extends BaseMapper<RelativesincompanyIdl>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public RelativesincompanyIdl selectRelativesincompanyIdlByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param relativesincompanyIdl 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<RelativesincompanyIdl> selectRelativesincompanyIdlList(RelativesincompanyIdl relativesincompanyIdl);

    /**
     * 新增【请填写功能名称】
     *
     * @param relativesincompanyIdl 【请填写功能名称】
     * @return 结果
     */
    public int insertRelativesincompanyIdl(RelativesincompanyIdl relativesincompanyIdl);

    /**
     * 修改【请填写功能名称】
     *
     * @param relativesincompanyIdl 【请填写功能名称】
     * @return 结果
     */
    public int updateRelativesincompanyIdl(RelativesincompanyIdl relativesincompanyIdl);

    /**
     * 删除【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteRelativesincompanyIdlByDetailid(Long detailid);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRelativesincompanyIdlByDetailids(Long[] detailids);
}
