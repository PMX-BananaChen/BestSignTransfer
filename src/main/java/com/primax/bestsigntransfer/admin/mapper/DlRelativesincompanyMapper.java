package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.to.DlRelativesincompany;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-16
 */
@Mapper
public interface DlRelativesincompanyMapper extends BaseMapper<DlRelativesincompany>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public DlRelativesincompany selectDlRelativesincompanyById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param dlRelativesincompany 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DlRelativesincompany> selectDlRelativesincompanyList(DlRelativesincompany dlRelativesincompany);

    /**
     * 新增【请填写功能名称】
     *
     * @param dlRelativesincompany 【请填写功能名称】
     * @return 结果
     */
    public int insertDlRelativesincompany(DlRelativesincompany dlRelativesincompany);

    /**
     * 修改【请填写功能名称】
     *
     * @param dlRelativesincompany 【请填写功能名称】
     * @return 结果
     */
    public int updateDlRelativesincompany(DlRelativesincompany dlRelativesincompany);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteDlRelativesincompanyById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDlRelativesincompanyByIds(Long[] ids);
}
