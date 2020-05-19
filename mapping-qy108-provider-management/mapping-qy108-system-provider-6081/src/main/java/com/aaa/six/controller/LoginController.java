package com.aaa.six.controller;

import com.aaa.six.model.User;
import com.aaa.six.redis.RedisService;
import com.aaa.six.service.LoginLogsService;
import com.aaa.six.service.LoginService;
import com.aaa.six.vo.TokenVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

/**
 * @program: mapping-qy108
 * @author: lwq
 * @create: 2020-05-16 11:16
 * @description:
 **/
@RestController
public class LoginController {

    @Autowired
    private RedisService redisService;

    @Autowired
    private LoginService loginService;

    @Autowired
    private LoginLogsService loginLogsService;
    
    /**
     * @author lwq 
     * @description
     *    执行登录操作
     * @param: [user]
     * @date 2020/5/19
     * @return com.aaa.six.vo.TokenVo
     * @throws 
     **/
    @PostMapping("/doLogin")
    public TokenVo doLogin(@RequestBody User user){
        TokenVo tokenVo = loginService.doLogin(user, redisService);
        try {
            if ("true".equals(tokenVo.getIfSuccess().toString())){
                loginLogsService.doLoginLogs(user.getUsername());
            }
        }catch (UnknownHostException u){
            u.printStackTrace();
            System.out.println("系统正在维护，请稍后再试");
        }
        return tokenVo;
    }
}

