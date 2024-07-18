package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.entity.EmployeeIdl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-06
 */
@Mapper
//@DS("DL_Inauguration_DG")
public interface EmployeeIdlMapper extends BaseMapper<EmployeeIdl>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public EmployeeIdl selectEmployeeIdlById(String id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param employeeIdl 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<EmployeeIdl> selectEmployeeIdlList(EmployeeIdl employeeIdl);

    /**
     * 新增【请填写功能名称】
     *
     * @param employeeIdl 【请填写功能名称】
     * @return 结果
     */
    public int insertEmployeeIdl(EmployeeIdl employeeIdl);

    /**
     * 修改【请填写功能名称】
     *
     * @param employeeIdl 【请填写功能名称】
     * @return 结果
     */
    public int updateEmployeeIdl(EmployeeIdl employeeIdl);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEmployeeIdlById(String id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmployeeIdlByIds(String[] ids);
}
