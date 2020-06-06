package com.mysecret.cn.exception;

/**
 * @date 200606
 * @author tianhao
 */
public class LoginException {

    /**
     * 未登陆异常
     */
    public static class UnLoginException extends BaseException{
        public UnLoginException(String msg) {
            super(msg);
        }
    }

    /**
     * 登陆过期异常
     */
    public static class LoginInvalidException extends BaseException{
        public LoginInvalidException(String msg) {
            super(msg);
        }
    }

}