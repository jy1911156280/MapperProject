package com.aaa.one.mapper;


import com.aaa.one.model.MappingProject;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface MappingProjectMapper extends Mapper<MappingProject> {
    /*
    项目类型统计
     */
    List<Map<String,Object>> projectTypeStatistics();

}