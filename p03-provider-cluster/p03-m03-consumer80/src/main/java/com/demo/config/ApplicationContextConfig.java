package com.demo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <h1>配置</h1>
 *
 * <p>
 * createDate 2022/02/20 11:37:40
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    // 负载均衡注解(默认是轮训)
    // 可以修改为其他或自定义模式，修改后的自定义配置类，不能放在@ComponentScan所扫描的包和子包下
    // 否则会被所有的Ribbon客户端共享
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
