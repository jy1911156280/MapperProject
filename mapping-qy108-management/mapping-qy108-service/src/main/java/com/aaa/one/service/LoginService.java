package com.aaa.one.service;

import com.aaa.one.base.BaseService;
import com.aaa.one.mapper.UserMapper;
import com.aaa.one.model.User;
import com.aaa.one.redis.RedisService;
import com.aaa.one.utils.IDUtils;
import com.aaa.one.vo.TokenVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.aaa.one.staticstatus.RedisProperties.*;

/**
 * @program: mapping-qy108
 * @author: lwq
 * @create: 2020-05-27 20:13
 * @description:
 **/
@Service
public class LoginService extends BaseService<User> {
    @Autowired
    private UserMapper userMapper;

    /**
     * @author hhy
     * @description
     *    执行登录操作
     * @param: [user, redisService]
     * @date 2020/5/16 9:19
     * @return TokenVo
     * @throws
     */
    public TokenVo doLogin(User user, RedisService redisService) {
        TokenVo tokenVo = new TokenVo();
        tokenVo.setIfSuccess(false);
        // 1.判断(目前实现的是登录功能，也就是说用户在执行登录操作--->肯定没有token)
        if(null != user) {
            // 可以继续往下去执行
            // 2.验证用户名和密码是否正确
            User u = userMapper.selectOne(user);
            // 3.判断如果从数据库中查询的user对象是否为null
            if(null != u) {
                // 说明用户登录成功
                String token = IDUtils.getUUID();
                u.setToken(token);
                int updateResult = userMapper.updateByPrimaryKey(u);
                // 4.判断token是否更新成功
                if(updateResult > 0) {
                    // 说明token更新成功(需要返回token)
                    // 需要给token设置一个失效时间(因为以后每一个方法都需要去查询token，也就是说必须要查询数据库)
                    // 就会大量影响效率(所以说直接存缓存)
                    String setResult = redisService.set(String.valueOf(u.getId()), token, XX, EX, 1800);
                    if("OK".equals(setResult.toUpperCase()) || "1".equals(setResult)) {
                        // TODO OK一定会返回，但是受影响的行数你们自己测试一下，我忘记了！
                        return tokenVo.setIfSuccess(true).setToken(token).setRedisKey(String.valueOf(u.getId()));
                    }
                }
            }
        }
        return tokenVo;
    }
}
