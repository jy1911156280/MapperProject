package com.aaa.one.mapper;

import com.aaa.one.model.Dept;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DeptMapper extends Mapper<Dept> {

    List<Dept> getAllDept(Long pid);
}