package com.demo.autoconfigure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * <h1>Test2自动配置</h1>
 *
 * <p>
 * createDate 2023/08/31 14:28:48
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@Configuration
@EnableConfigurationProperties(Test2Properties.class)
public class Test2AutoConfiguration {

    /**
     * 日志实例
     */
    private static final Logger log = LoggerFactory.getLogger(Test2AutoConfiguration.class);

    /**
     * 构造函数(自动注入)
     *
     * @param test2Properties Test2Properties
     */
    public Test2AutoConfiguration(Test2Properties test2Properties) {
        log.info("Test2配置：{}", test2Properties);
    }

}
