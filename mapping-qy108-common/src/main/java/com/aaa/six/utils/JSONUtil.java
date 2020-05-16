package com.aaa.six.utils;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Title mapping-qy108
 * @Author hhy
 * @Version 0.1.0
 * @Date Create in 2020/5/13 13:05
 * @Description
 */
public class JSONUtil {

    // 1.定义私有静态常量ObjectMapper(命名规则：所有字母全部大写，单词与单词之间使用_连接)
        // ObjectMapper:就是fastjson包中进行类型转换的工具类
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /**
     * @author hhy
     * @description
     *    把对象转换为json字符串
     * @param: [object]
     * @date 2020/5/16 20:39
     * @return java.lang.String
     * @throws 
     */
    public static String toJsonString(Object object) {
        try {
            String jsonString = OBJECT_MAPPER.writeValueAsString(object);
            return jsonString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @author hhy
     * @description
     *      把json转换为指定的对象
     *      <T>:定义了一个类型
     *      T:返回值的类型
     * @param jsonData:传入的json对象
     *        beanType:所需要转换对象的目标类型
     *                  User.class, Book.class
     * @param: [jsonData, beanType]
     * @date 2020/5/16 20:39
     * @return T
     * @throws 
     */
    public static <T> T toObject(String jsonData, Class<T> beanType) {
        try {
            T t = OBJECT_MAPPER.readValue(jsonData, beanType);
            return t;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @author hhy
     * @description
     *    把Json转换为List集合
     * @param: [jsonData, beanType]
     * @date 2020/5/16 20:42
     * @return java.util.List<T>
     * @throws 
     */
    public static <T> List<T> toList(String jsonData, Class<T> beanType) {
        // 1.为List集合添加一个指定的泛型
            // List  User.class ---> 通过constructParametricType方法把List和User合并，也就是说为List指定一个User对象的泛型(List<User>)
        JavaType javaType = OBJECT_MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
        try {
            List<T> list = OBJECT_MAPPER.readValue(jsonData, javaType);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
