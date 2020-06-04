package com.aaa.one.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @Company AAA软件教育
 * @Title mapping-qy108
 * @Author hhy
 * @Version 0.1.0
 * @Date Create in 2020/5/13 11:42
 * @Description
 */
@Data
public class ResultData<T> implements Serializable {

    private String code;
    private String msg;
    private String detail;
    private T data;
}
