package com.aaa.one.base;

import static com.aaa.one.status.CRUDStatus.*;
import static com.aaa.one.status.LoginStatus.*;

/**
 * @Company AAA软件教育
 * @Title mapping-qy108
 * @Author hhy
 * @Version 0.1.0
 * @Date Create in 2020/5/13 12:32
 * @Description
 *     通用controller，就是实现consumer和provider统一返回值
 */
public class BaseController {

    /**
     * @author hhy
     * @description
     *    登陆成功，使用系统消息
     * @param: []
     * @date 2020/5/13 12:46
     * @return com.aaa.six.base.ResultData
     * @throws
     */
    protected ResultData loginSuccess(){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    登陆成功，使用自定义消息
     * @param: [msg]
     * @date 2020/5/13 12:47
     * @return com.aaa.six.base.ResultData
     * @throws
     */
    protected ResultData loginSuccess(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    登陆成功，使用系统消息，自定义返回数据
     * @param: [data]
     * @date 2020/5/13 12:48
     * @return com.aaa.six.base.ResultData
     * @throws 
     */
    protected ResultData loginSuccess(Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        resultData.setData(data);
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    登陆失败，使用系统消息
     * @param: []
     * @date 2020/5/13 12:51
     * @return com.aaa.six.base.ResultData
     * @throws 
     */
    protected ResultData loginFailed() {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(LOGIN_FAILED.getMsg());
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    添加成功，使用系统消息
     * @param: []
     * @date 2020/5/13 13:17
     * @return com.aaa.six.base.ResultData
     * @throws
     */
    protected ResultData insertSuccess(){
        ResultData resultData = new ResultData();
        resultData.setCode(INSERT_SUCCESS.getCode());
        resultData.setMsg(INSERT_SUCCESS.getMsg());
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    添加成功，使用自定义消息
     * @param: [msg]
     * @date 2020/5/13 13:17
     * @return com.aaa.six.base.ResultData
     * @throws
     */
    protected ResultData insertSuccess(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(INSERT_SUCCESS.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    添加失败，使用系统消息
     * @param: []
     * @date 2020/5/13 13:20
     * @return com.aaa.six.base.ResultData
     * @throws
     */
    protected ResultData insertFailed(){
        ResultData resultData = new ResultData();
        resultData.setCode(INSERT_FAILED.getCode());
        resultData.setMsg(INSERT_FAILED.getMsg());
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    添加失败，使用自定义消息
     * @param: [msg]
     * @date 2020/5/13 13:21
     * @return com.aaa.six.base.ResultData
     * @throws
     */
    protected ResultData insertFailed(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(INSERT_FAILED.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    更新成功，使用系统消息
     * @param: []
     * @date 2020/5/13 13:18
     * @return com.aaa.six.base.ResultData
     * @throws
     */
    protected ResultData updateSuccess(){
        ResultData resultData = new ResultData();
        resultData.setCode(UPDATE_SUCCESS.getCode());
        resultData.setMsg(UPDATE_SUCCESS.getMsg());
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    更新成功，使用自定义消息
     * @param: [msg]
     * @date 2020/5/13 13:19
     * @return com.aaa.six.base.ResultData
     * @throws
     */
    protected ResultData updateSuccess(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(UPDATE_SUCCESS.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    更新失败，使用系统消息
     * @param: []
     * @date 2020/5/13 13:22
     * @return com.aaa.six.base.ResultData
     * @throws
     */
    protected ResultData updateFailed(){
        ResultData resultData = new ResultData();
        resultData.setCode(UPDATE_FAILED.getCode());
        resultData.setMsg(UPDATE_FAILED.getMsg());
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    更新失败，使用自定义消息
     * @param: [msg]
     * @date 2020/5/13 13:23
     * @return com.aaa.six.base.ResultData
     * @throws
     */
    protected ResultData updateFailed(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(UPDATE_FAILED.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    删除成功，使用系统消息
     * @param: []
     * @date 2020/5/13 13:24
     * @return com.aaa.six.base.ResultData
     * @throws 
     */
    protected ResultData deleteSuccess(){
        ResultData resultData = new ResultData();
        resultData.setCode(DELETE_SUCCESS.getCode());
        resultData.setMsg(DELETE_SUCCESS.getMsg());
        return resultData;
    }
    
    /**
     * @author hhy
     * @description
     *    删除成功，使用自定义消息
     * @param: [msg]
     * @date 2020/5/13 13:25
     * @return com.aaa.six.base.ResultData
     * @throws 
     */
    protected ResultData deleteSuccess(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(DELETE_SUCCESS.getCode());
        resultData.setMsg(msg);
        return resultData;
    }
    
    /**
     * @author hhy
     * @description
     *    删除失败，使用系统消息
     * @param: []
     * @date 2020/5/13 13:24
     * @return com.aaa.six.base.ResultData
     * @throws 
     */
    protected ResultData deleteFailed(){
        ResultData resultData = new ResultData();
        resultData.setCode(DELETE_FAILED.getCode());
        resultData.setMsg(DELETE_FAILED.getMsg());
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    删除失败，使用自定义消息
     * @param: [msg]
     * @date 2020/5/13 13:25
     * @return com.aaa.six.base.ResultData
     * @throws 
     */
    protected ResultData deleteFailed(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(DELETE_FAILED.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    查询成功，使用系统消息
     * @param: []
     * @date 2020/5/13 13:26
     * @return com.aaa.six.base.ResultData
     * @throws 
     */
    protected ResultData selectSuccess(){
        ResultData resultData = new ResultData();
        resultData.setCode(SELECT_SUCCESS.getCode());
        resultData.setMsg(SELECT_SUCCESS.getMsg());
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    查询成功，使用自定义消息
     * @param: [msg]
     * @date 2020/5/13 13:27
     * @return com.aaa.six.base.ResultData
     * @throws 
     */
    protected ResultData selectSuccess(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(SELECT_SUCCESS.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *   查询成功，使用系统消息，自定义返回数据
     * @param: [data]
     * @date 2020/5/13 13:28
     * @return com.aaa.six.base.ResultData
     * @throws 
     */
    protected ResultData selectSuccess(Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(SELECT_SUCCESS.getCode());
        resultData.setMsg(SELECT_SUCCESS.getMsg());
        resultData.setData(data);
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    查询失败，使用系统消息
     * @param: []
     * @date 2020/5/13 13:29
     * @return com.aaa.six.base.ResultData
     * @throws 
     */
    protected ResultData selectFailed(){
        ResultData resultData = new ResultData();
        resultData.setCode(SELECT_FAILED.getCode());
        resultData.setMsg(SELECT_FAILED.getMsg());
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    查询失败，使用自定义消息
     * @param: [msg]
     * @date 2020/5/13 13:30
     * @return com.aaa.six.base.ResultData
     * @throws 
     */
    protected ResultData selectFailed(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(SELECT_FAILED.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * @author hhy
     * @description
     *    查询失败，使用系统消息，自定义返回值
     * @param: [data]
     * @date 2020/5/13 13:31
     * @return com.aaa.six.base.ResultData
     * @throws 
     */
    protected ResultData selectFailed(Object data){
        ResultData resultData = new ResultData();
        resultData.setCode(SELECT_FAILED.getCode());
        resultData.setMsg(SELECT_FAILED.getMsg());
        resultData.setData(data);
        return resultData;
    }
}
