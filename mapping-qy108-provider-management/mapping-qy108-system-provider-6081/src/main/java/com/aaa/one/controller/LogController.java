package com.aaa.one.controller;

import com.aaa.one.base.BaseService;
import com.aaa.one.base.CommonController;
import com.aaa.one.base.ResultData;
import com.aaa.one.model.LoginLog;
import com.aaa.one.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2020/5/27 16:16
 * @Description
 **/
@RestController
public class LogController extends CommonController<LoginLog> {

    @Autowired
    private LoginLogService loginLogService;

    @Override
    public BaseService<LoginLog> getBaseService() {
        return loginLogService;
    }

    /**
     * @author Seven Lee
     * @description
     *      实现登录日志保存
     * @param [map]
     * @date 2020/5/27
     * @return com.aaa.lee.base.ResultData
     * @throws
    **/
    @PostMapping("/addLoginLog")
    public ResultData addLoginLog(@RequestBody Map map) {
        return super.add(map);
    }
}
