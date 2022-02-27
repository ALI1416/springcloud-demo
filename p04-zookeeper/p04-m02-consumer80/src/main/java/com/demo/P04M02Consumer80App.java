package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
@SpringBootApplication
// zookeeper服务发现注解
@EnableDiscoveryClient
public class P04M02Consumer80App {

    public static void main(String[] args) {
        SpringApplication.run(P04M02Consumer80App.class, args);
    }

}
