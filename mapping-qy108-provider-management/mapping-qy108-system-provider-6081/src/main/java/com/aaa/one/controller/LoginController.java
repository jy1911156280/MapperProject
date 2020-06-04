package com.aaa.one.controller;

import com.aaa.one.model.User;
import com.aaa.one.redis.RedisService;
import com.aaa.one.service.LoginService;
import com.aaa.one.vo.TokenVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



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
    public TokenVo doLogin(@RequestBody User user) {
        return loginService.doLogin(user, redisService);
    }

}

