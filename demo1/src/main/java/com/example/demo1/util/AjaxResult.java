package com.example.demo1.util;

import java.util.Collections;

public class AjaxResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public int getCode() {
        return null == code ? 200 : code;
    }

    public String getMsg() {
        return null == msg ? "操作成功" : msg;
    }

    public Object getData() {
        return null == data ? Collections.EMPTY_MAP : data;
    }

    public AjaxResult<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public AjaxResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public AjaxResult<T> setData(T data) {
        this.data = data;
        return this;
    }
}
