package com.aaa.one.mapper;


import com.aaa.one.model.TecUnitEptVo;

import java.util.List;


public interface TecUnitEptVoMapper {
    /*
        人员设备汇总统计查询
     */
    List<TecUnitEptVo> getAll();
}
