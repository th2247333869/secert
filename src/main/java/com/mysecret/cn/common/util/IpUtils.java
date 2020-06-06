package com.mysecret.cn.common.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @date 200606
 * @author tianhao
 */
public class IpUtils {

    private static final String HEADER = "x-forwarded-for";

    private static final String UN_KNOW = "unknown";

    private static final String PROXY = "Proxy-Client-IP";

    private static final String WL_PROXY = "WL-Proxy-Client-IP";

    private static final String DEFAULT_IP = "0:0:0:0:0:0:0:1";

    private static final String DEFAULT_LOCALHOST = "127.0.0.1";

    private static final String COMMA = ",";
    /**
     *  获取ip工具类
     * @param request 请求
     * @return ip
     */
    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader(HEADER);
        if (ip == null || ip.length() == 0 || UN_KNOW.equalsIgnoreCase(ip)) {
            ip = request.getHeader(PROXY);
        }
        if (ip == null || ip.length() == 0 || UN_KNOW.equalsIgnoreCase(ip)) {
            ip = request.getHeader(WL_PROXY);
        }
        if (ip == null || ip.length() == 0 || UN_KNOW.equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if (DEFAULT_IP.equals(ip)) {
            ip = DEFAULT_LOCALHOST;
        }
        if (ip.split(COMMA).length > 1) {
            ip = ip.split(COMMA)[0];
        }
        return ip;
    }

}