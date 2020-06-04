package com.aaa.one.status;

/**
 * @ClassName CRUDStatus
 * @Description
 * @Author Jiayi
 * @Date 2020/6/3 17:31
 * @Version 1.0
 **/
public enum  CRUDStatus {
    ADD_SUCCESS("20002","添加成功"),
    ADD_FAILED("20003","添加失败"),
    DELETE_SUCCESS("20004","删除成功"),
    DELETE_FAILED("20005","删除失败"),
    UPDATE_SUCCESS("20006","修改成功"),
    UPDATE_FAILED("20007","修改失败"),
    SELECT_SUCCESS("20008","查询成功"),
    SELECT_FAILED("20009","查询失败");




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
