package com.aaa.six.utils;

import java.util.UUID;

/**
 * @Company AAA软件教育
 * @Title mapping-qy108
 * @Author hhy
 * @Version 0.1.0
 * @Date Create in 2020/5/13 13:05
 * @Description
 */
public class IDUtils {

    private IDUtils() {

    }

    /**
     * @author hhy
     * @description
     *    获取uuid
     * @param: []
     * @date 2020/5/16 20:42
     * @return java.lang.String
     * @throws 
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
