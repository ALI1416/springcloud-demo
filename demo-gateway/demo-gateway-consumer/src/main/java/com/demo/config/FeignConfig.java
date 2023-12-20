package com.demo.config;

import cn.z.util.UserInfo;
import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * <h1>Feign配置</h1>
 *
 * <p>
 * createDate 2023/12/16 11:11:11
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 */
public class FeignConfig {

    /**
     * 日志级别
     */
    @Bean
    public Logger.Level loggerLevel() {
        return Logger.Level.FULL;
    }

    /**
     * 请求拦截器
     */
    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            Long userId = UserInfo.getId();
            if (userId != null) {
                // 新增请求头
                requestTemplate.header("user-id", userId.toString());
            }
        };
    }

}
