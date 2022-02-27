package com.demo;

import com.ribbon.Random;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

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
// 注册Eureka客户端
@EnableEurekaClient
// 自定义负债均衡
@RibbonClient(name = "PROVIDER-CLUSTER-PROVIDER", configuration = Random.class)
public class P03M03Consumer80App {

    public static void main(String[] args) {
        SpringApplication.run(P03M03Consumer80App.class, args);
    }

}
