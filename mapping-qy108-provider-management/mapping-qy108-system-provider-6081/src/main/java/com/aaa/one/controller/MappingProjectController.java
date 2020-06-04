package com.aaa.one.controller;

import com.aaa.one.base.BaseService;
import com.aaa.one.base.CommonController;
import com.aaa.one.model.MappingProject;
import com.aaa.one.service.MappingProjectService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;


/**
 * @ProjectName: mapping-qy108
 * @Package: com.aaa.six.controller
 * @ClassName: MappingProjectController
 * @Author: lifuju
 * @Description:
 * @Date: 2020/5/21 8:28
 * @Version: 1.0
 */
@RestController
public class MappingProjectController extends CommonController<MappingProject> {

    @Autowired
    private MappingProjectService mappingProjectService;


    @Override
    public BaseService<MappingProject> getBaseService() {
        return mappingProjectService;
    }




    /**
     *@Description: TODO
     * 项目管理 新增方法 单个新增
     *@Param :  [mappingProject]
     *@MethodName: add
     *@Author: lifuju
     *@Date: 2020/5/22 8:18
     *@Return: java.lang.Integer
     */


    @PostMapping("/addMappingProject")
    public Integer add(@RequestBody MappingProject mappingProject){
        try {
            return mappingProjectService.add(mappingProject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     *@Description: TODO
     * 项目管理 删除方法  单个删除
     *@Param :  [mappingProject]
     *@MethodName: delete
     *@Author: lifuju
     *@Date: 2020/5/22 8:23
     *@Return: java.lang.Integer
     */
    @GetMapping("/delMappingProject/{id}")
    public Integer delete1(@PathVariable("id") Long id){
        try {
            return mappingProjectService.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     *@Description: TODO
     * 项目管理 删除方法 批量删除
     *@Param :  [ids]
     *@MethodName: delete2
     *@Author: lifuju
     *@Date: 2020/5/22 8:48
     *@Return: java.lang.Integer
     */
    @PostMapping("/deleteBatchMappingProject")
    public Integer delBatch(@RequestBody List<Object> ids){
        return mappingProjectService.delete(ids);
    }

    /**
     *@Description: TODO
     * 项目管理 更新方法 单个更新
     *@Param :  [mappingProject]
     *@MethodName: queryOne
     *@Author: lifuju
     *@Date: 2020/5/23 9:43
     *@Return: com.aaa.six.model.MappingProject
     */
    @GetMapping("/selectOne")
    public MappingProject selectOne(@RequestParam("id")Long id){
        try {
            return mappingProjectService.getOne(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     *@Description: TODO
     * 项目管理 更新方法 单个更新
     *@Param :  [mappingProject]
     *@MethodName: update
     *@Author: lifuju
     *@Date: 2020/5/22 8:51
     *@Return: java.lang.Integer
     */
    @PostMapping("/updateMappingProject")
    public Integer update(@RequestBody MappingProject mappingProject){
        try {
            return mappingProjectService.update(mappingProject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     *@Description: TODO
     * 项目管理 查询方法 分页查询
     *@Param :  [mappingProject, pageNo, pageSize]
     *@MethodName: queryListByPage
     *@Author: lifuju
     *@Date: 2020/5/22 8:06
     *@Return: com.github.pagehelper.PageInfo
     */
    @PostMapping("/mappingProjectByPage")
    public PageInfo queryListByPage(@RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize){
        try {
            return mappingProjectService.queryListByPage(pageNo, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     *@Description: TODO
     *@Param :  [pageNo, pageSize, where, orderByFileds, fields]
     *@MethodName: queryListByPageAndFields
     *@Author: lifuju
     *@Date: 2020/5/24 10:26
     *@Return: com.github.pagehelper.PageInfo
     */
    @PostMapping("/mappingQueryListByPageAndFields")
    public PageInfo queryListByPageAndFields(Integer pageNo, Integer pageSize, Sqls where, String orderByFileds, String... fields){
        try {
            return mappingProjectService.queryListByPageAndFields(pageNo,pageSize,where,orderByFileds,fields);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
