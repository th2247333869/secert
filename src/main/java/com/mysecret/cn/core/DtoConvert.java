package com.mysecret.cn.core;


/**
 * @date 200606
 * @author tianhao
 */
public abstract class DtoConvert<T,S> {
    /**
     * 转换对象
     * @param s 被转换对象
     * @return 转换结果
     * @throws Exception 抛出异常
     */
    protected abstract T doForward(S s);

    /**
     * 反转换对象
     * @param t 被转换对象
     * @return 转换结果
     * @throws Exception 抛出异常
     */
    protected abstract S doBackForward(T t) throws Exception;
}
