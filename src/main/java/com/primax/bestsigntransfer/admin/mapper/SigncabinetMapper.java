package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.entity.Signcabinet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-12
 */
@Mapper
@DS("HREntryRegistration")
public interface SigncabinetMapper extends BaseMapper<Signcabinet>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param cabinet 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Signcabinet selectSigncabinetByCabinet(String cabinet);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param signcabinet 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Signcabinet> selectSigncabinetList(Signcabinet signcabinet);

    /**
     * 新增【请填写功能名称】
     *
     * @param signcabinet 【请填写功能名称】
     * @return 结果
     */
    public int insertSigncabinet(Signcabinet signcabinet);

    /**
     * 修改【请填写功能名称】
     *
     * @param signcabinet 【请填写功能名称】
     * @return 结果
     */
    public int updateSigncabinet(Signcabinet signcabinet);

    /**
     * 删除【请填写功能名称】
     *
     * @param cabinet 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSigncabinetByCabinet(String cabinet);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param cabinets 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSigncabinetByCabinets(String[] cabinets);
}
