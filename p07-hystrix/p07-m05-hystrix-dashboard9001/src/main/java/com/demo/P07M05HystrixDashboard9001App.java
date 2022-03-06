package com.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * <h1>hystrix仪表盘</h1>
 *
 * <p>访问 http://localhost:9001/hystrix </p>
 * <p>主页地址填写 http://localhost:8080/hystrix.stream </p>
 *
 * <p>
 * createDate 2022/02/19 17:14:57
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@SpringBootApplication
// 启用仪表盘
@EnableHystrixDashboard
@Slf4j
public class P07M05HystrixDashboard9001App {

    public static void main(String[] args) {
        SpringApplication.run(P07M05HystrixDashboard9001App.class, args);
        log.info("P07M05HystrixDashboard9001App");
    }

}
