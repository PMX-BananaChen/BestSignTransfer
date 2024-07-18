package com.primax.bestsigntransfer.admin.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.primax.bestsigntransfer.admin.domain.to.Facepicinfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@DS("SmartAccess")
public interface FacepicinfoMapper extends BaseMapper<Facepicinfo> {
}
