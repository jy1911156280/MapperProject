package com.aaa.one.controller;

import com.aaa.one.model.MappingUnit;
import com.aaa.one.model.TecUnitEptVo;
import com.aaa.one.service.MappingUnitService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UnitController
 * @Description
 * @Author Jiayi
 * @Date 2020/6/4 9:38
 * @Version 1.0
 **/
public class MappingUnitController {
    @Autowired
    private MappingUnitService mappingUnitService;

    /**
        *@Author Jiayi
        *@Description   查询所有单位信息
        *@Param []
        *@Date 2020/6/4 9:39
        *@return java.util.List<com.aaa.one.model.MappingUnit>
    **/
    @GetMapping("/queryListAllUnit")
    public List<MappingUnit> queryListAllUnit(){
        return mappingUnitService.queryListAll();
    }

    /**
        *@Author Jiayi
        *@Description   查询所有单位信息    开启分页
        *@Param [currentPage, pageSize]
        *@Date 2020/6/4 9:41
        *@return com.github.pagehelper.PageInfo<com.aaa.one.model.MappingUnit>
    **/
    @GetMapping("/queryListAllUnitByPage")
    public PageInfo<MappingUnit> queryListAllUnitByPage(@RequestParam("currentPage") Integer currentPage, @RequestParam("pageSize") Integer pageSize){
        return mappingUnitService.queryListAllByPage(currentPage,pageSize);
    }

//    /**
//        *@Author Jiayi
//        *@Description   人员设备统计查询
//        *@Param []
//        *@Date 2020/6/4 9:42
//        *@return java.util.List<com.aaa.one.model.TecUnitEptVo>
//    **/
//    @GetMapping("/getAllInfoUnit")
//    public List<TecUnitEptVo> getAllInfo(){
//        return mappingUnitService.getAllInfo();
//    }

    /**
        *@Author Jiayi
        *@Description   单位资质统计
        *@Param []
        *@Date 2020/6/4 9:42
        *@return java.util.Map<java.lang.String,java.lang.Object>
    **/
    @GetMapping("/getUnitLevel")
    public Map<String,Object> getUnitLevel(){
        return mappingUnitService.getUnitLevel();
    }







}
