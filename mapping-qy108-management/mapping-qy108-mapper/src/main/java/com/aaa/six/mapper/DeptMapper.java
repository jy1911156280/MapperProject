package com.aaa.six.mapper;

import com.aaa.six.model.Dept;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DeptMapper extends Mapper<Dept> {

    List<Dept> getAllDept(Long pid);
}