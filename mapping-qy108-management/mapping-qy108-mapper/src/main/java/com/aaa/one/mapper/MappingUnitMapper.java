package com.aaa.one.mapper;

import com.aaa.one.model.MappingUnit;
import tk.mybatis.mapper.common.Mapper;

import java.util.Map;

public interface MappingUnitMapper extends Mapper<MappingUnit> {
    /*
    单位资质统计
     */
    Map<String,Object> getUnitLevel();
}