package com.aaa.six.controller;

import com.aaa.six.base.BaseService;
import com.aaa.six.base.CommonController;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Company AAA软件教育
 * @Title mapping-qy108
 * @Author hhy
 * @Version 0.1.0
 * @Date Create in 2020/5/13 11:40
 * @Description
 */
@RestController
public class UserController extends CommonController<User> {
    public BaseService<User> getBaseService() {
        return null;
    }
}
