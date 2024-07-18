package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.entity.SysApplychannel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author stan
 * @date 2022-05-06
 */
@Mapper
public interface SysApplychannelMapper extends BaseMapper<SysApplychannel>
{
    /**
     * 查询【请填写功能名称】
     *
     * @param applychannelid 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysApplychannel selectSysApplychannelByApplychannelid(String applychannelid);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sysApplychannel 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysApplychannel> selectSysApplychannelList(SysApplychannel sysApplychannel);

    /**
     * 新增【请填写功能名称】
     *
     * @param sysApplychannel 【请填写功能名称】
     * @return 结果
     */
    public int insertSysApplychannel(SysApplychannel sysApplychannel);

    /**
     * 修改【请填写功能名称】
     *
     * @param sysApplychannel 【请填写功能名称】
     * @return 结果
     */
    public int updateSysApplychannel(SysApplychannel sysApplychannel);

    /**
     * 删除【请填写功能名称】
     *
     * @param applychannelid 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysApplychannelByApplychannelid(String applychannelid);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param applychannelids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysApplychannelByApplychannelids(String[] applychannelids);
}
