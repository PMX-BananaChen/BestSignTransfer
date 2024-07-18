package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.to.Employeetype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-16
 */
@Mapper
public interface EmployeetypeMapper extends BaseMapper<Employeetype>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param employeeid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Employeetype selectEmployeetypeByEmployeeid(String employeeid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employeetype 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Employeetype> selectEmployeetypeList(Employeetype employeetype);

    /**
     * 新增【请填写功能名称】
     *
     * @param employeetype 【请填写功能名称】
     * @return 结果
     */
    public int insertEmployeetype(Employeetype employeetype);

    /**
     * 修改【请填写功能名称】
     *
     * @param employeetype 【请填写功能名称】
     * @return 结果
     */
    public int updateEmployeetype(Employeetype employeetype);

    /**
     * 删除【请填写功能名称】
     *
     * @param employeeid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEmployeetypeByEmployeeid(String employeeid);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param employeeids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmployeetypeByEmployeeids(String[] employeeids);
}
