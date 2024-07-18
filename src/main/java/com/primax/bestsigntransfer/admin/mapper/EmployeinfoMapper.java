package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.entity.Employeinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-12
 */
@Mapper
public interface EmployeinfoMapper extends BaseMapper<Employeinfo>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param empno 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Employeinfo selectEmployeinfoByEmpno(String empno);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employeinfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Employeinfo> selectEmployeinfoList(Employeinfo employeinfo);

    /**
     * 新增【请填写功能名称】
     *
     * @param employeinfo 【请填写功能名称】
     * @return 结果
     */
    public int insertEmployeinfo(Employeinfo employeinfo);

    /**
     * 修改【请填写功能名称】
     *
     * @param employeinfo 【请填写功能名称】
     * @return 结果
     */
    public int updateEmployeinfo(Employeinfo employeinfo);

    /**
     * 删除【请填写功能名称】
     *
     * @param empno 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEmployeinfoByEmpno(String empno);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param empnos 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmployeinfoByEmpnos(String[] empnos);

    String selectEndDate(String empno);
}
