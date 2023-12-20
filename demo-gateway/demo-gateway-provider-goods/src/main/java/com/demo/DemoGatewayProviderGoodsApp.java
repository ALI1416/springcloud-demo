package com.demo;

import com.demo.config.FeignConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <h1>提供者-商品</h1>
 *
 * <p>
 * createDate 2022/02/19 17:14:57
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@EnableFeignClients(basePackages = "cn.z.api", defaultConfiguration = FeignConfig.class)
@SpringBootApplication
public class DemoGatewayProviderGoodsApp {

    public static void main(String[] args) {
        SpringApplication.run(DemoGatewayProviderGoodsApp.class, args);
    }

}
