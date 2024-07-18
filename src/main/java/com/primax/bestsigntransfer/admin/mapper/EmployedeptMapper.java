package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.to.Employedept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-16
 */
@Mapper
public interface EmployedeptMapper extends BaseMapper<Employedept>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param empno 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Employedept selectEmployedeptByEmpno(String empno);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employedept 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Employedept> selectEmployedeptList(Employedept employedept);

    /**
     * 新增【请填写功能名称】
     *
     * @param employedept 【请填写功能名称】
     * @return 结果
     */
    public int insertEmployedept(Employedept employedept);

    /**
     * 修改【请填写功能名称】
     *
     * @param employedept 【请填写功能名称】
     * @return 结果
     */
    public int updateEmployedept(Employedept employedept);

    /**
     * 删除【请填写功能名称】
     *
     * @param empno 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEmployedeptByEmpno(String empno);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param empnos 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmployedeptByEmpnos(String[] empnos);
}
