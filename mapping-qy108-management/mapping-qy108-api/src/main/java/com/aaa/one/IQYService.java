package com.aaa.one;

import com.aaa.one.base.ResultData;
import com.aaa.one.model.MappingProject;
import com.aaa.one.model.MappingUnit;
import com.aaa.one.model.TecUnitEptVo;
import com.aaa.one.model.User;
import com.aaa.one.vo.TokenVo;
import com.github.pagehelper.PageInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2020/5/15 16:14
 * @Description
 *      fallbackFactory:就是来实现熔断的，在实际开发中，开发阶段不能去开启熔断
 *      因为一旦开启了熔断，整个异常都不会再抛出，不方便调bug
 *
 *      实际开发必须注意的东西:
 *          无论是springcloud1.x还是2.x版本
 *          一旦使用feign来进行传递参数的时候，必须要注意两个点:
 *              1.如果是简单类型(8种基本类型，String)--->必须使用注解@RequestParam
 *                  基本类型可以传多个，也就是说一个方法的参数中可以使用多@RequestParam
 *
 *              2.如果传递包装类型(List, Map, Vo, Po)，只能传递一个，而且必须要使用@RequestBody注解
 *
 *         也就是说最终把这些参数值传递到provider项目的controller中，在这provider项目的controller中也必须使用
 *         相同的注解，而且provider和api的方法必须要一模一样(copy是最方便的)
 *
 **/
@FeignClient(value = "system-interface" )
 public interface IQYService {

    /**
     * @author Seven Lee
     * @description
     *      执行登录操作
     * @param [user]
     * @date 2020/5/15
     * @return com.aaa.lee.base.ResultData
     * @throws
     **/
    @PostMapping("/doLogin")
    TokenVo doLogin(@RequestBody User user);
    /**
     * @author Seven Lee
     * @description
     *      新增用户信息
     * @param [user]
     * @date 2020/5/27
     * @return java.lang.Boolean
     * @throws
     **/
    @PostMapping("/addUser")
    Boolean addUser(@RequestBody User user);

    /**
     * @author Seven Lee
     * @description
     *      添加登录日志信息
     * @param [map]
     * @date 2020/5/27
     * @return com.aaa.lee.base.ResultData
     * @throws
     **/
    @PostMapping("/addLoginLog")
    ResultData addLoginLog(@RequestBody Map map);

    /**
     * @author Seven Lee
     * @description
     *      ftp文件上传
     *      这个时候如果你自己测试过，你会发现file是无论如何都无法发送到provider项目中
     *      因为feign默认只能发送普通类型(java8种基本类型，封装类型，集合...)
     *      最终这些普通类型都可以转换为二进制流的形式在http之间传输，但是文件类型不行，
     *      因为文件类型只能转换为字节流/字符流
     *      也就是说，最终我可以让PostMapping去接收Multipart/form-data类型
     *      让feign使用json的数据格式来进行接收
     * @param [file]
     * @date 2020/5/29
     * @return java.lang.Boolean
     * @throws
     **/
    @PostMapping(value = "/upload",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Boolean uploadFile(@RequestBody MultipartFile file);



    /**
     *@Author Jiayi
     *@Description  根据项目类型查询项目
     *@Param [where]
     *@Date 2020/6/2 11:35
     *@return java.util.List<com.aaa.one.model.MappingProject>
     **/
    @GetMapping("/queryListByType")
    List<MappingProject> queryListByType(@RequestParam("where") String where);

    /**
     *@Author Jiayi
     *@Description       根据项目类型查询项目 开启分页
     *@Param [where, currentPage, pageSize]
     *@Date 2020/6/3 14:07
     *@return com.github.pagehelper.PageInfo<com.aaa.one.model.MappingProject>
     **/
    @GetMapping("queryListByTypeAndPage")
    PageInfo<MappingProject> queryListByTypeAndPage(@RequestParam("where") String where, @RequestParam("currentPage") Integer currentPage, @RequestParam("pageSize") Integer pageSize);



    /**
     *@Author Jiayi
     *@Description   添加项目
     *@Param [mappingProject]
     *@Date 2020/6/3 13:54
     *@return boolean
     **/
    @PostMapping("/addMappingProject")
    boolean addMappingProject(@RequestBody MappingProject mappingProject);

    /**
     *@Author Jiayi
     *@Description   查询所有项目
     *@Param []
     *@Date 2020/6/3 14:01
     *@return java.util.List<com.aaa.one.model.MappingProject>
     **/
    @GetMapping("/queryListAllProject")
    List<MappingProject> queryListAllProject();

    /**
     *@Author Jiayi
     *@Description       查询所有项目 开启分页
     *@Param [currentPage, pageSize]
     *@Date 2020/6/3 14:04
     *@return com.github.pagehelper.PageInfo<com.aaa.one.model.MappingProject>
     **/
    @GetMapping("/queryListAllByPage")
    PageInfo<MappingProject> queryListAllByPage(@RequestParam("currentPage")  Integer currentPage, @RequestParam("pageSize") Integer pageSize);

    /**
     *@Author Jiayi
     *@Description   修改项目信息
     *@Param [mappingProject]
     *@Date 2020/6/3 14:08
     *@return java.lang.Boolean
     **/
    @PutMapping("/updateProject")
    Boolean updateProject(@RequestBody MappingProject mappingProject);

    /**
     *@Author Jiayi
     *@Description   删除项目
     *@Param [mappingProject]
     *@Date 2020/6/3 14:09
     *@return java.lang.Boolean
     **/
    @DeleteMapping("/deleteProject")
    Boolean deleteProject(@RequestBody MappingProject mappingProject);
    /**
     *@Author Jiayi
     *@Description   项目统计信息
     *@Param []
     *@Date 2020/6/3 14:09
     *@return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    @GetMapping("/projectTypeStatistics")
    List<Map<String,Object>> projectTypeStatistics();



    /**
     *@Author Jiayi
     *@Description   查询所有单位信息
     *@Param []
     *@Date 2020/6/4 9:39
     *@return java.util.List<com.aaa.one.model.MappingUnit>
     **/
    @GetMapping("/queryListAllUnit")
    List<MappingUnit> queryListAllUnit();

    /**
     *@Author Jiayi
     *@Description   查询所有单位信息    开启分页
     *@Param [currentPage, pageSize]
     *@Date 2020/6/4 9:41
     *@return com.github.pagehelper.PageInfo<com.aaa.one.model.MappingUnit>
     **/
    @GetMapping("/queryListAllUnitByPage")
    PageInfo<MappingUnit> queryListAllUnitByPage(@RequestParam("currentPage") Integer currentPage, @RequestParam("pageSize") Integer pageSize);

    /**
     *@Author Jiayi
     *@Description   人员设备统计查询
     *@Param []
     *@Date 2020/6/4 9:42
     *@return java.util.List<com.aaa.one.model.TecUnitEptVo>
     **/
    @GetMapping("/getAllInfoUnit")
     List<TecUnitEptVo> getAllInfo();

    /**
     *@Author Jiayi
     *@Description   单位资质统计
     *@Param []
     *@Date 2020/6/4 9:42
     *@return java.util.Map<java.lang.String,java.lang.Object>
     **/
    @GetMapping("/getUnitLevel")
     Map<String,Object> getUnitLevel();










}
