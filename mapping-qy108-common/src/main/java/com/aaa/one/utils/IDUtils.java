package com.aaa.one.utils;

import java.util.Random;
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

   /**
    *@Description: TODO
    * 生成唯一主键 Long
    *   格式：时间+随机数
    *@Param :  []
    *@MethodName: genUniqueKey
    *@Author: lifuju
    *@Date: 2020/5/22 17:42
    *@Return: java.lang.Long
    */
   public static synchronized Long genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + number;
    }


}
