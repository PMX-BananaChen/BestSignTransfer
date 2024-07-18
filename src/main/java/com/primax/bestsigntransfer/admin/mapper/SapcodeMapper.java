package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.to.Sapcode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-16
 */
@Mapper
public interface SapcodeMapper extends BaseMapper<Sapcode>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Sapcode selectSapcodeById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sapcode 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Sapcode> selectSapcodeList(Sapcode sapcode);

    /**
     * 新增【请填写功能名称】
     *
     * @param sapcode 【请填写功能名称】
     * @return 结果
     */
    public int insertSapcode(Sapcode sapcode);

    /**
     * 修改【请填写功能名称】
     *
     * @param sapcode 【请填写功能名称】
     * @return 结果
     */
    public int updateSapcode(Sapcode sapcode);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSapcodeById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSapcodeByIds(Long[] ids);
}
