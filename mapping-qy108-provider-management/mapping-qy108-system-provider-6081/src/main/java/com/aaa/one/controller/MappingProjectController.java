//package com.aaa.one.controller;
//
//import com.aaa.one.base.BaseService;
//import com.aaa.one.base.CommonController;
//import com.aaa.one.model.MappingProject;
//import com.aaa.one.service.MappingProjectService;
//import com.github.pagehelper.PageInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import tk.mybatis.mapper.util.Sqls;
//
//import java.util.List;
//
//
///**
// * @ProjectName: mapping-qy108
// * @Package: com.aaa.six.controller
// * @ClassName: MappingProjectController
// * @Author: lifuju
// * @Description:
// * @Date: 2020/5/21 8:28
// * @Version: 1.0
// */
//@RestController
//public class MappingProjectController extends CommonController<MappingProject> {
//
//    @Autowired
//    private MappingProjectService mappingProjectService;
//
//
//    @Override
//    public BaseService<MappingProject> getBaseService() {
//        return mappingProjectService;
//    }
//
//
//
//
//    /**
//     *@Description: TODO
//     * 项目管理 新增方法 单个新增
//     *@Param :  [mappingProject]
//     *@MethodName: add
//     *@Author: lifuju
//     *@Date: 2020/5/22 8:18
//     *@Return: java.lang.Integer
//     */
//
//
//    @PostMapping("/addMappingProject")
//    public Integer add(@RequestBody MappingProject mappingProject){
//        try {
//            return mappingProjectService.add(mappingProject);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//    /**
//     *@Description: TODO
//     * 项目管理 删除方法  单个删除
//     *@Param :  [mappingProject]
//     *@MethodName: delete
//     *@Author: lifuju
//     *@Date: 2020/5/22 8:23
//     *@Return: java.lang.Integer
//     */
//    @GetMapping("/delMappingProject/{id}")
//    public Integer delete1(@PathVariable("id") Long id){
//        try {
//            return mappingProjectService.delete(id);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//    /**
//     *@Description: TODO
//     * 项目管理 删除方法 批量删除
//     *@Param :  [ids]
//     *@MethodName: delete2
//     *@Author: lifuju
//     *@Date: 2020/5/22 8:48
//     *@Return: java.lang.Integer
//     */
//    @PostMapping("/deleteBatchMappingProject")
//    public Integer delBatch(@RequestBody List<Object> ids){
//        return mappingProjectService.delete(ids);
//    }
//
//    /**
//     *@Description: TODO
//     * 项目管理 更新方法 单个更新
//     *@Param :  [mappingProject]
//     *@MethodName: queryOne
//     *@Author: lifuju
//     *@Date: 2020/5/23 9:43
//     *@Return: com.aaa.six.model.MappingProject
//     */
//    @GetMapping("/selectOne")
//    public MappingProject selectOne(@RequestParam("id")Long id){
//        try {
//            return mappingProjectService.getOne(id);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//    /**
//     *@Description: TODO
//     * 项目管理 更新方法 单个更新
//     *@Param :  [mappingProject]
//     *@MethodName: update
//     *@Author: lifuju
//     *@Date: 2020/5/22 8:51
//     *@Return: java.lang.Integer
//     */
//    @PostMapping("/updateMappingProject")
//    public Integer update(@RequestBody MappingProject mappingProject){
//        try {
//            return mappingProjectService.update(mappingProject);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//
//    /**
//     *@Description: TODO
//     * 项目管理 查询方法 分页查询
//     *@Param :  [mappingProject, pageNo, pageSize]
//     *@MethodName: queryListByPage
//     *@Author: lifuju
//     *@Date: 2020/5/22 8:06
//     *@Return: com.github.pagehelper.PageInfo
//     */
//    @PostMapping("/mappingProjectByPage")
//    public PageInfo queryListByPage(@RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize){
//        try {
//            return mappingProjectService.queryListByPage(pageNo, pageSize);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//
//    /**
//     *@Description: TODO
//     *@Param :  [pageNo, pageSize, where, orderByFileds, fields]
//     *@MethodName: queryListByPageAndFields
//     *@Author: lifuju
//     *@Date: 2020/5/24 10:26
//     *@Return: com.github.pagehelper.PageInfo
//     */
//    @PostMapping("/mappingQueryListByPageAndFields")
//    public PageInfo queryListByPageAndFields(Integer pageNo, Integer pageSize, Sqls where, String orderByFileds, String... fields){
//        try {
//            return mappingProjectService.queryListByPageAndFields(pageNo,pageSize,where,orderByFileds,fields);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//}
package one.controller;
import com.aaa.one.model.MappingProject;
import com.aaa.one.service.MappingProjectService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 *@ClassName ProjectController
 *@Description
 *@Author Jiayi
 *@Date 2020/6/2 11:24
 *@Version 1.0
 **/
@RestController
public class MappingProjectController {

    @Autowired
    MappingProjectService mappingProjectService;

    /**
     *@Author Jiayi
     *@Description  根据项目类型查询项目
     *@Param [where]
     *@Date 2020/6/2 11:35
     *@return java.util.List<com.aaa.one.model.MappingProject>
     **/
    @GetMapping("/queryListByType")
    public List<MappingProject> queryListByType(@RequestParam String where){
        return mappingProjectService.queryListByType(where);
    }

    /**
     *@Author Jiayi
     *@Description       根据项目类型查询项目 开启分页
     *@Param [where, currentPage, pageSize]
     *@Date 2020/6/3 14:07
     *@return com.github.pagehelper.PageInfo<com.aaa.one.model.MappingProject>
     **/
    PageInfo<MappingProject> queryListByTypeAndPage(@RequestParam("where") String where, @RequestParam("currentPage") Integer currentPage, @RequestParam("pageSize") Integer pageSize) {
        return mappingProjectService.queryListByTypeAndPage( where,  currentPage,  pageSize);
    }


    /**
     *@Author Jiayi
     *@Description   添加项目
     *@Param [mappingProject]
     *@Date 2020/6/3 13:54
     *@return boolean
     **/
    @PostMapping("/addMappingProject")
    public boolean addMappingProject(@RequestBody MappingProject mappingProject){
        return mappingProjectService.addMappingProject(mappingProject);
    }

    /**
     *@Author Jiayi
     *@Description   查询所有项目
     *@Param []
     *@Date 2020/6/3 14:01
     *@return java.util.List<com.aaa.one.model.MappingProject>
     **/
    @GetMapping("/queryListAllProject")
    public List<MappingProject> queryListAllProject(){
        return mappingProjectService.queryListAll();
    }

    /**
     *@Author Jiayi
     *@Description       查询所有项目 开启分页
     *@Param [currentPage, pageSize]
     *@Date 2020/6/3 14:04
     *@return com.github.pagehelper.PageInfo<com.aaa.one.model.MappingProject>
     **/
    @GetMapping("/queryListAllByPage")
    public PageInfo<MappingProject> queryListAllByPage(@RequestParam("currentPage")  Integer currentPage, @RequestParam("pageSize") Integer pageSize){
        PageInfo<MappingProject> info = mappingProjectService.queryListAllByPage(currentPage, pageSize);
        return info;
    }

    /**
     *@Author Jiayi
     *@Description   修改项目信息
     *@Param [mappingProject]
     *@Date 2020/6/3 14:08
     *@return java.lang.Boolean
     **/
    @PutMapping("/updateProject")
    public Boolean updateProject(@RequestBody MappingProject mappingProject){
        return mappingProjectService.updateProject(mappingProject);
    }

    /**
     *@Author Jiayi
     *@Description   删除项目
     *@Param [mappingProject]
     *@Date 2020/6/3 14:09
     *@return java.lang.Boolean
     **/
    @DeleteMapping("/deleteProject")
    public Boolean deleteProject(@RequestBody MappingProject mappingProject){
        return mappingProjectService.deleteProject(mappingProject);

    }
    /**
     *@Author Jiayi
     *@Description   项目统计信息
     *@Param []
     *@Date 2020/6/3 14:09
     *@return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    @GetMapping("/projectTypeStatistics")
    public List<Map<String,Object>> projectTypeStatistics(){
        return mappingProjectService.projectTypeStatistics();
    }

}
