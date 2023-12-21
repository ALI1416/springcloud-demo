package com.demo.autoconfigure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * <h1>Test自动配置</h1>
 *
 * <p>
 * createDate 2023/08/31 14:28:48
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@Configuration
@EnableConfigurationProperties(TestProperties.class)
public class TestAutoConfiguration {

    /**
     * 日志实例
     */
    private static final Logger log = LoggerFactory.getLogger(TestAutoConfiguration.class);

    /**
     * 构造函数(自动注入)
     *
     * @param testProperties TestProperties
     */
    public TestAutoConfiguration(TestProperties testProperties) {
        log.info("Test配置：{}", testProperties);
    }

}
