package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.entity.Disabledindividuals;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-12
 */
@Mapper
public interface DisabledindividualsMapper extends BaseMapper<Disabledindividuals>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Disabledindividuals selectDisabledindividualsByDetailid(Long detailid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param disabledindividuals 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Disabledindividuals> selectDisabledindividualsList(Disabledindividuals disabledindividuals);

    /**
     * 新增【请填写功能名称】
     *
     * @param disabledindividuals 【请填写功能名称】
     * @return 结果
     */
    public int insertDisabledindividuals(Disabledindividuals disabledindividuals);

    /**
     * 修改【请填写功能名称】
     *
     * @param disabledindividuals 【请填写功能名称】
     * @return 结果
     */
    public int updateDisabledindividuals(Disabledindividuals disabledindividuals);

    /**
     * 删除【请填写功能名称】
     *
     * @param detailid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteDisabledindividualsByDetailid(Long detailid);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param detailids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDisabledindividualsByDetailids(Long[] detailids);
}
