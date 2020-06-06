package com.mysecret.cn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @date 200606
 * @author tianhao
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * 添加拦截器
     * @param registry 注册器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //放掉某些特定不需要校验token的路由
        registry.addInterceptor(new BaseInterceptor()).excludePathPatterns("/doRegister");

    }

}