package com.demo;

import com.demo.config.FeignConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <h1>网关</h1>
 *
 * <p>
 * createDate 2022/02/19 17:14:57
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@SpringBootApplication
@EnableFeignClients(basePackages = "com.demo.api", defaultConfiguration = FeignConfig.class)
public class DemoGatewayGatewayApp {

    /* consumer */
    // 插入 http://127.0.0.1:8080/consumer/insert?name=apple&price=3
    // 查询id http://127.0.0.1:8080/consumer/findById?id=0
    // 查询id数组 http://127.0.0.1:8080/consumer/findByIdArray?idArray=0,1
    // 获取 http://127.0.0.1:8080/consumer/get
    // 获取2 http://127.0.0.1:8080/consumer/get2
    /* goods */
    // 插入 http://127.0.0.1:8080/goods/insert?name=apple&price=3
    // 查询id http://127.0.0.1:8080/goods/findById?id=0
    // 查询id数组 http://127.0.0.1:8080/goods/findByIdArray?idArray=0,1
    // 获取2 http://127.0.0.1:8080/goods/get2
    /* test */
    // 获取 http://127.0.0.1:8080/test/get
    // 获取2 http://127.0.0.1:8080/test/get2
    // 获取3 http://127.0.0.1:8080/test/get3

    public static void main(String[] args) {
        SpringApplication.run(DemoGatewayGatewayApp.class, args);
    }

}
