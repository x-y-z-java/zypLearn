package com.alllearn.commons;

/**
 * 统一Json返回值封装对象
 */
public final class ReturnObject<T> {
    //状态码 0 表示成功 1表示失败
    private CodeEnum code;
    //返回的提示信息例如获取数据成功
    private String msg;
    //具体返回对象
    private T result;

    public ReturnObject() {
    }
    public ReturnObject(CodeEnum code, String msg, T result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }
    public CodeEnum getCode() {
        return code;
    }

    public void setCode(CodeEnum code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
