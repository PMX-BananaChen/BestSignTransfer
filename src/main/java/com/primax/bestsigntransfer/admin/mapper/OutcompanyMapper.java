package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.to.Outcompany;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-16
 */
@Mapper
public interface OutcompanyMapper extends BaseMapper<Outcompany>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param outcompanyid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Outcompany selectOutcompanyByOutcompanyid(String outcompanyid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param outcompany 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Outcompany> selectOutcompanyList(Outcompany outcompany);

    /**
     * 新增【请填写功能名称】
     *
     * @param outcompany 【请填写功能名称】
     * @return 结果
     */
    public int insertOutcompany(Outcompany outcompany);

    /**
     * 修改【请填写功能名称】
     *
     * @param outcompany 【请填写功能名称】
     * @return 结果
     */
    public int updateOutcompany(Outcompany outcompany);

    /**
     * 删除【请填写功能名称】
     *
     * @param outcompanyid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteOutcompanyByOutcompanyid(String outcompanyid);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param outcompanyids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOutcompanyByOutcompanyids(String[] outcompanyids);
}
