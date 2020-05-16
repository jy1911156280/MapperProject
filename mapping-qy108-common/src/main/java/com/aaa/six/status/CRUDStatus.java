package com.aaa.six.status;

/**
 * @Company AAA软件教育
 * @Title mapping-qy108
 * @Author hhy
 * @Version 0.1.0
 * @Date Create in 2020/5/13 13:05
 * @Description
 */
public enum CRUDStatus {
    INSERT_SUCCESS("2001","添加成功"),
    INSERT_FAILED("1001","添加失败"),
    UPDATE_SUCCESS("2002","更新成功"),
    UPDATE_FAILED("1002","更新失败"),
    DELETE_SUCCESS("2003","删除成功"),
    DELETE_FAILED("1003","删除失败"),
    SELECT_SUCCESS("2004","查询成功"),
    SELECT_FAILED("1004","查询失败");

    private String code;
    private String msg;

    CRUDStatus(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
