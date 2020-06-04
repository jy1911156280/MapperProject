package com.aaa.one.controller;

import com.aaa.one.IQYService;
import com.aaa.one.model.MappingUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName MappingUnitController
 * @Description
 * @Author Jiayi
 * @Date 2020/6/4 17:51
 * @Version 1.0
 **/
@RestController
public class MappingUnitController {
    @Autowired
    IQYService iqyService;

    /**
        *@Author Jiayi
        *@Description   查询所有单位信息
        *@Param []
        *@Date 2020/6/4 20:24
        *@return java.util.List<com.aaa.one.model.MappingUnit>
    **/
    @GetMapping("/queryListAllUnit")
    public List<MappingUnit> queryListAll(){
        return iqyService.queryListAllUnit();
    }

    /**
     *@Author Jiayi
     *@Description   单位资质统计
     *@Param []
     *@Date 2020/6/4 9:42
     *@return java.util.Map<java.lang.String,java.lang.Object>
     **/
    @GetMapping("/getUnitLevel")
    Map<String,Object> getUnitLevel(){
        return iqyService.getUnitLevel();
    }
}
