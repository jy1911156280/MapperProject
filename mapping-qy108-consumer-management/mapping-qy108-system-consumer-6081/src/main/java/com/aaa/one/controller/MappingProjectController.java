package com.aaa.one.controller;

import com.aaa.one.IQYService;
import com.aaa.one.base.BaseController;
import com.aaa.one.base.ResultData;
import com.aaa.one.model.MappingProject;
import com.aaa.one.model.MappingUnit;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@Api(value = "项目信息", tags = "项目管理板块")
public class MappingProjectController extends BaseController{
    @Autowired
    private IQYService iqyService;

    /**
     *@Author Jiayi
     *@Description       根据项目类型查询项目 开启分页
     *@Param [where, currentPage, pageSize]
     *@Date 2020/6/3 14:07
     *@return com.github.pagehelper.PageInfo<com.aaa.one.model.MappingProject>
     **/
    @GetMapping("queryListByTypeAndPage")
    PageInfo<MappingProject> queryListByTypeAndPage(@RequestParam("where") String where, @RequestParam("currentPage") Integer currentPage, @RequestParam("pageSize") Integer pageSize){
        return iqyService.queryListByTypeAndPage(where,currentPage,pageSize);
    }


    /**
     *@Author Jiayi
     *@Description   添加项目
     *@Param [mappingProject]
     *@Date 2020/6/3 13:54
     *@return boolean
     **/
    @PostMapping("/addMappingProject")
    boolean addMappingProject(@RequestBody MappingProject mappingProject){
        return iqyService.addMappingProject(mappingProject);
    }

    /**
     *@Author Jiayi
     *@Description   查询所有项目
     *@Param []
     *@Date 2020/6/3 14:01
     *@return java.util.List<com.aaa.one.model.MappingProject>
     **/
    @GetMapping("/queryListAllProject")
    List<MappingProject> queryListAllProject(){
        return iqyService.queryListAllProject();
    }

    /**
     *@Author Jiayi
     *@Description       查询所有项目 开启分页
     *@Param [currentPage, pageSize]
     *@Date 2020/6/3 14:04
     *@return com.github.pagehelper.PageInfo<com.aaa.one.model.MappingProject>
     **/
    @GetMapping("/queryListAllByPage")
    PageInfo<MappingProject> queryListAllByPage(@RequestParam("currentPage")  Integer currentPage, @RequestParam("pageSize") Integer pageSize){
        return iqyService.queryListAllByPage(currentPage,pageSize);
    }

    /**
     *@Author Jiayi
     *@Description   修改项目信息
     *@Param [mappingProject]
     *@Date 2020/6/3 14:08
     *@return java.lang.Boolean
     **/
    @PutMapping("/updateProject")
    Boolean updateProject(@RequestBody MappingProject mappingProject){
        return iqyService.updateProject(mappingProject);
    }

    /**
     *@Author Jiayi
     *@Description   删除项目
     *@Param [mappingProject]
     *@Date 2020/6/3 14:09
     *@return java.lang.Boolean
     **/
    @DeleteMapping("/deleteProject")
    Boolean deleteProject(@RequestBody MappingProject mappingProject){
        return iqyService.deleteProject(mappingProject);
    }
    /**
     *@Author Jiayi
     *@Description   项目统计信息
     *@Param []
     *@Date 2020/6/3 14:09
     *@return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    @GetMapping("/projectTypeStatistics")
    List<Map<String,Object>> projectTypeStatistics(){
        return iqyService.projectTypeStatistics();
    }





    /**
     *@Author Jiayi
     *@Description  根据项目类型查询项目
     *@Param [where]
     *@Date 2020/6/2 11:35
     *@return java.util.List<com.aaa.one.model.MappingProject>
     **/
    @GetMapping("/queryListByType")
    List<MappingProject> queryListByType(@RequestParam("where") String where){
        return iqyService.queryListByType(where);
    }






}
