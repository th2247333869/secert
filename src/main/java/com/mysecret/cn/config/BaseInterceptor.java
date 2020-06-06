package com.mysecret.cn.config;

import com.mysecret.cn.common.util.JwtUtils;
import com.mysecret.cn.exception.LoginException;
import io.jsonwebtoken.Claims;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @date 200606
 * @author tianhao
 */
public class BaseInterceptor implements HandlerInterceptor {

    private static final String HEADER = "authorization";

    private static final String AUTH_HEADER = "Bearer:";

    private static final String TOKEN = "token:";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String authHeader = request.getHeader(HEADER);

        if (authHeader == null || !authHeader.startsWith(AUTH_HEADER)) {

            throw new LoginException.UnLoginException("user is not login");

        }
        //取得token
        String token = authHeader.substring(7);
        //验证token
        Claims claims = JwtUtils.checkToken(token);
        //设置token
        request.setAttribute(TOKEN,claims.getSubject());
        
        return true;
    }
}
