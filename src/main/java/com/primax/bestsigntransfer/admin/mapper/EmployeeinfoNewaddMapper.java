package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.to.EmployeeinfoNewadd;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-16
 */
@Mapper
public interface EmployeeinfoNewaddMapper extends BaseMapper<EmployeeinfoNewadd>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param empno 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public EmployeeinfoNewadd selectEmployeeinfoNewaddByEmpno(String empno);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employeeinfoNewadd 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<EmployeeinfoNewadd> selectEmployeeinfoNewaddList(EmployeeinfoNewadd employeeinfoNewadd);

    /**
     * 新增【请填写功能名称】
     *
     * @param employeeinfoNewadd 【请填写功能名称】
     * @return 结果
     */
    public int insertEmployeeinfoNewadd(EmployeeinfoNewadd employeeinfoNewadd);

    /**
     * 修改【请填写功能名称】
     *
     * @param employeeinfoNewadd 【请填写功能名称】
     * @return 结果
     */
    public int updateEmployeeinfoNewadd(EmployeeinfoNewadd employeeinfoNewadd);

    /**
     * 删除【请填写功能名称】
     *
     * @param empno 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEmployeeinfoNewaddByEmpno(String empno);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param empnos 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmployeeinfoNewaddByEmpnos(String[] empnos);
}
