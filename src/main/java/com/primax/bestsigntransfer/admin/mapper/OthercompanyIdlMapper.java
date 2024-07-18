package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.entity.OthercompanyIdl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-12
 */
@Mapper
public interface OthercompanyIdlMapper extends BaseMapper<OthercompanyIdl>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public OthercompanyIdl selectOthercompanyIdlByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param othercompanyIdl 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OthercompanyIdl> selectOthercompanyIdlList(OthercompanyIdl othercompanyIdl);

    /**
     * 新增【请填写功能名称】
     *
     * @param othercompanyIdl 【请填写功能名称】
     * @return 结果
     */
    public int insertOthercompanyIdl(OthercompanyIdl othercompanyIdl);

    /**
     * 修改【请填写功能名称】
     *
     * @param othercompanyIdl 【请填写功能名称】
     * @return 结果
     */
    public int updateOthercompanyIdl(OthercompanyIdl othercompanyIdl);

    /**
     * 删除【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteOthercompanyIdlByDetailid(Long detailid);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOthercompanyIdlByDetailids(Long[] detailids);
}
