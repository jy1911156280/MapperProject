package com.aaa.one.base;

import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @Company AAA软件教育
 * @Title mapping-qy108
 * @Author hhy
 * @Version 0.1.0
 * @Date Create in 2020/5/13 11:35
 * @Description
 */
public abstract class CommonController <T> extends BaseController{
    
    /**
     * @author hhy
     * @description
     *    钩子函数，在新增之前执行的内容
     * @param: [map]
     * @date 2020/5/13 11:36
     * @return void
     * @throws 
     */
    protected void beforeAdd(Map map){

    }

    /**
     * @author hhy
     * @description
     *    钩子函数，在新增之后执行
     * @param: [map]
     * @date 2020/5/13 11:38
     * @return void
     * @throws 
     */
    protected void afterAdd(Map map){
        
    }

    public abstract BaseService<T> getBaseService();

    /**
     * @author hhy
     * @description
     *    新增数据
     * @param: [map]
     * @date 2020/5/13 12:58
     * @return com.aaa.six.base.ResultData
     * @throws 
     */
    public ResultData add(@RequestBody Map map){
        ResultData resultData = new ResultData();
        beforeAdd(map);

        //中间写业务
        T instance = getBaseService().newInstance(map);
        try{
            Integer insertResult = getBaseService().add(instance);
            if(insertResult>0){
               //说明保存成功
                afterAdd(map);
                return insertSuccess();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return insertFailed();
    }
    // TODO delete, batchDelete, update, getOne, getList, getListByPage(不带条件的分页查询)

    /**
     * @author hhy
     * @description
     *    删除数据
     * @param: [map]
     * @date 2020/5/13 13:34
     * @return com.aaa.six.base.ResultData
     * @throws
     */
    public ResultData delete(Map map){
        ResultData resultData = new ResultData();
        T instance = getBaseService().newInstance(map);
        try{
            Integer deleteResult = getBaseService().delete(instance);
            if(deleteResult>0){
                return deleteSuccess();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return deleteFailed();
    }

    /**
     * @author hhy
     * @description
     *    批量删除
     * @param: [map]
     * @date 2020/5/13 13:52
     * @return com.aaa.six.base.ResultData
     * @throws
     */
    public ResultData batchDelete(List<Map> list){
        ResultData resultData = new ResultData();
        List instance = getBaseService().newInstance(list);
        try{
            Integer deleteResult = getBaseService().delete(instance);
            if(deleteResult>0){
                return deleteSuccess();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return deleteFailed();
    }


    /**
     * @author hhy
     * @description
     *    修改数据
     * @param: [map]
     * @date 2020/5/13 13:37
     * @return com.aaa.six.base.ResultData
     * @throws
     */
    public ResultData update(Map map){
        ResultData resultData = new ResultData();
        T instance = getBaseService().newInstance(map);
        try{
            Integer updateResult = getBaseService().update(instance);
            if(updateResult>0){
                return updateSuccess();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return updateFailed();
    }

    /**
     * @author hhy
     * @description
     *    查询一条数据
     * @param: [map]
     * @date 2020/5/13 13:38
     * @return com.aaa.six.base.ResultData
     * @throws 
     */
    public ResultData getOne(Map map){
        ResultData resultData = new ResultData();
        T instance = getBaseService().newInstance(map);
        try{
            T selectResult = getBaseService().queryOne(instance);
            if(null != selectResult && !"".equals(selectResult)){
                return selectSuccess();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return selectFailed();
    }

    /**
     * @author hhy
     * @description
     *    查询多条数据
     * @param: [map]
     * @date 2020/5/13 13:43
     * @return com.aaa.six.base.ResultData
     * @throws
     */
    public ResultData getList(Map map){
        ResultData resultData = new ResultData();
        T instance = getBaseService().newInstance(map);
        try{
            List<T> list = getBaseService().queryList(instance);
            if(list.size()>0){
                return selectSuccess();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return selectFailed();
    }

    /**
     * @author hhy
     * @description
     *    不带条件的分页查询
     * @param: [map]
     * @date 2020/5/13 13:49
     * @return com.aaa.six.base.ResultData
     * @throws
     */
    public ResultData getListByPage(Map map){
        ResultData resultData = new ResultData();
        T instance = getBaseService().newInstance(map);
        try{
            PageInfo<T> listByPage = getBaseService().queryListByPage(instance, null, null);
            if(null !=listByPage && "".equals(listByPage)){
                return selectSuccess();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return selectFailed();
    }
    
    
    /**
     * @author hhy
     * @description
     *    防止数据不安全，所以不能直接在controller某个方法中直接接收HttpServletRequest对象
     *    必须要从本地当前线程中获取对象
     * @param: []
     * @date 2020/5/13 12:57
     * @return javax.servlet.http.HttpServletRequest
     * @throws
     */
    public HttpServletRequest getServletRequest() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servletRequestAttributes;
        if(requestAttributes instanceof ServletRequestAttributes) {
            servletRequestAttributes = (ServletRequestAttributes) requestAttributes;
            return servletRequestAttributes.getRequest();
        }
        return null;
    }

    /**
     * @author hhy
     * @description
     *    获取当前客户端的session对象(如果不存在，则会重新创建一个)
     * @param: []
     * @date 2020/5/13 12:57
     * @return javax.servlet.http.HttpSession
     * @throws 
     */
    public HttpSession getSession() {
        return getServletRequest().getSession();
    }

    /**
     * @author hhy
     * @description
     *    获取当前客户端的session对象(如果不存在，则直接返回为null)
     * @param: []
     * @date 2020/5/13 12:57
     * @return javax.servlet.http.HttpSession
     * @throws 
     */
    public HttpSession getExistSession() {
        return getServletRequest().getSession(false);

    }
}
