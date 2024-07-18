package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.to.DlLinkman;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-16
 */
@Mapper
public interface DlLinkmanMapper extends BaseMapper<DlLinkman>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public DlLinkman selectDlLinkmanById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param dlLinkman 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DlLinkman> selectDlLinkmanList(DlLinkman dlLinkman);

    /**
     * 新增【请填写功能名称】
     *
     * @param dlLinkman 【请填写功能名称】
     * @return 结果
     */
    public int insertDlLinkman(DlLinkman dlLinkman);

    /**
     * 修改【请填写功能名称】
     *
     * @param dlLinkman 【请填写功能名称】
     * @return 结果
     */
    public int updateDlLinkman(DlLinkman dlLinkman);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteDlLinkmanById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDlLinkmanByIds(Long[] ids);
}
