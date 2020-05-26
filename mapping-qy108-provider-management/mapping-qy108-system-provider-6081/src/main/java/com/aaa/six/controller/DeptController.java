package com.aaa.six.controller;

import com.aaa.six.model.Dept;
import com.aaa.six.service.DeptService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    /**
     * @Author: ly
     * @description:
     *      获取所有的部门
     * @date: 2020/5/20
     * @param pid
     * @param pageNo
     * @param pageSize
     * @return: com.aaa.six.base.ResultData
     *
     */
    @PostMapping("/getAllDept")
    public PageInfo getAllDept(@RequestParam("pid") Integer pid, @RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize){
        PageInfo allDept = deptService.getAllDept(pid, pageNo, pageSize);
        return allDept;
    }

    /**
     * @Author: ly
     * @description:
     *
     *      根据主键获取部门信息
     * @date: 2020/5/22
     * @param id
     * @return: com.aaa.six.model.Dept
     *
     */
    @GetMapping("/getDeptById")
    public Dept getDeptById(@RequestParam("id")Integer id){
        Dept deptByID = deptService.getDeptByID(id);
        return deptByID;
    }


    /**
     * @Author: ly
     * @description:
     *      根据条件查询部门
     *      直接调用baseService中的方法
     * @date: 2020/5/21
     * @param dept
     * @return: java.util.List<com.aaa.six.model.Dept>
     *
     */
    @PostMapping("/getDeptByFileds")
    public List<Dept> getDeptByFileds(@RequestBody Dept dept){
        try {
            List<Dept> deptList = deptService.queryList(dept);
            return deptList;
        } catch (Exception e) {
            e.printStackTrace();
        }
       return null;
    }

    /**
     * @Author: ly
     * @description:
     *
     *      修改部门信息
     * @date: 2020/5/23
     * @param dept
     * @return: java.lang.Integer
     *
     */
    @PostMapping("/updateDept")
    public Integer updateDept(@RequestBody Dept dept){
        try {
            Integer i = deptService.updateDept(dept);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @Author: ly
     * @description:
     *      批量删除
     * @date: 2020/5/23
     * @param ids
     * @return: java.lang.Integer
     *
     */
    @PostMapping("/delByIds")
    public Integer delByIds(@RequestBody List<Object> ids){

        try{
            Integer i = deptService.delByIds(ids);
            return i;
        } catch (Exception e){
            e.printStackTrace();
        }
       return null;
    }

    /**
     * @Author: ly
     * @description:
     *
     *      添加新的部门
     * @date: 2020/5/23
     * @param dept
     * @return: java.lang.Integer
     *
     */
    @PostMapping("/addDept")
    public Integer addDept(@RequestBody Dept dept){

        try {
            Integer i = deptService.addDept(dept);
            return i;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
