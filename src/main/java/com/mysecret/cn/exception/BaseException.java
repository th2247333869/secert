package com.mysecret.cn.exception;


/**
 * @date 200606
 * @author Administrator
 */
public class BaseException extends Exception{
    /**
     * 异常信息
     */
    private String message;

    public BaseException(String msg)
    {
        this.message = msg;
    }
    @Override
    public String getMessage() {
        return message;
    }
}