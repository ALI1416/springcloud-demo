package com.demo.config;

import feign.Logger;
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
     * 日志输出级别
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
