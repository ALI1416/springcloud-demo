package com.demo;

import com.demo.config.FeignConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <h1>消费者</h1>
 *
 * <p>
 * createDate 2022/02/19 17:14:57
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
// 启用OpenFeign basePackages指定扫描的包 defaultConfiguration指定配置
@EnableFeignClients(basePackages = "com.demo.api", defaultConfiguration = FeignConfig.class)
@SpringBootApplication
public class DemoFeignConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(DemoFeignConsumerApp.class, args);
    }

}
