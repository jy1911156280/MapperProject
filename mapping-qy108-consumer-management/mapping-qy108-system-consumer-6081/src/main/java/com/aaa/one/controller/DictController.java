//package com.aaa.one.controller;
//
//import com.aaa.one.IQYService;
//import com.aaa.one.base.BaseController;
//import com.aaa.one.base.ResultData;
//import com.aaa.one.model.Dict;
//import com.github.pagehelper.PageInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
///**
// * @program: mapping-qy108
// * @author: lwq
// * @create: 2020-05-26 16:35
// * @description:
// **/
//@RestController
//public class DictController extends BaseController {
//
//    @Autowired
//    private IQYService iqyService;
//
//    /**
//     * @author lwq
//     * @description
//     *    分页查询字典信息
//     * @param: [pageNo, pageSize]
//     * @date 2020/5/26
//     * @return com.aaa.six.base.ResultData
//     * @throws
//     **/
//    @PostMapping("/selectDictInfo")
//    public ResultData selectDictInfo(Integer pageNo , Integer pageSize){
//        PageInfo<Dict> dictPageInfo = iqyService.selectDictInfo(pageNo, pageSize);
//        if (!"".equals ( dictPageInfo ) && null != dictPageInfo){
//            return super.selectSuccess(dictPageInfo);
//        }else {
//            return super.selectFailed();
//        }
//    }
//
//    /**
//     * @author lwq
//     * @description
//     *    新增字典信息
//     * @param: [dict]
//     * @date 2020/5/26
//     * @return com.aaa.six.base.ResultData
//     * @throws
//     **/
//    @PostMapping("/addDict")
//    public ResultData addDict(Dict dict){
//        Boolean aBoolean = iqyService.addDict(dict);
//        if (aBoolean){
//            return super.ADDSuccess();
//        }
//        return super.ADDFailed();
//    }
//
//    /**
//     * @author lwq
//     * @description
//     *    根据id查询用户详细信息
//     * @param: [dict]
//     * @date 2020/5/26
//     * @return com.aaa.six.base.ResultData
//     * @throws
//     **/
//    @PostMapping("/selectDictById")
//    public ResultData selectDictById(Dict dict){
//        Dict dict1 = iqyService.selectDictById(dict);
//        if (!"".equals(dict1) && null != dict1){
//            return super.selectSuccess(dict1);
//        }
//        return super.selectFailed();
//    }
//
//    /**
//     * @author lwq
//     * @description
//     *    修改字典信息
//     * @param: [dict]
//     * @date 2020/5/27
//     * @return com.aaa.six.base.ResultData
//     * @throws
//     **/
//    @PostMapping("/updateDict")
//    public ResultData updateDict(Dict dict){
//        Boolean aBoolean = iqyService.updateDict(dict);
//        if (aBoolean){
//            return super.updateSuccess();
//
//        }else {
//            return super.updateFailed();
//        }
//    }
//    /**
//     * @author lwq
//     * @description
//     *    删除用户
//     * @param:
//     * @date 2020/5/21
//     * @return
//     * @throws
//     **/
//    @PostMapping("/deleteDictById")
//    public ResultData deleteDictById(Dict dict){
//        Boolean aBoolean = iqyService.deleteDictById(dict);
//        if (aBoolean){
//            return super.deleteSuccess();
//        }
//        return super.deleteFailed();
//    }
//
//    /**
//     * @author lwq
//     * @description
//     *    批量删除
//     * @param: [ids]
//     * @date 2020/5/27
//     * @return com.aaa.six.base.ResultData
//     * @throws
//     **/
//    @PostMapping("/deleteDictByIds")
//    public ResultData deleteDictByIds(@RequestBody List<Object> ids){
//        Integer integer = iqyService.deleteDictByIds(ids);
//        if (integer > 0 ){
//            return super.deleteSuccess();
//        }else {
//            return super.deleteFailed();
//        }
//    }
//}
