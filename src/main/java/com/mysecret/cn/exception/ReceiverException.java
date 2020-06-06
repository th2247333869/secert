package com.mysecret.cn.exception;

/**
 * @date 200606
 * @author tianhao
 */
public class ReceiverException {

    /**
     * 空指针异常
     */
    public static class NullPointReceiverException extends BaseException{
        public NullPointReceiverException(String msg) {
            super(msg);
        }
    }

}