package com.demo.controller;

import cn.z.entity.pojo.Result;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

/**
 * <h1>测试</h1>
 *
 * <p>
 * createDate 2022/02/20 11:12:01
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@RestController
@AllArgsConstructor
@Slf4j
public class TestController {

    private static final Random RANDOM = new Random();
    private final RestTemplate restTemplate;
    private final DiscoveryClient discoveryClient;

    /**
     * 获取URL
     *
     * @return URL(不存在返回null)
     */
    private String getUrl() {
        // 获取注册的实例列表
        List<ServiceInstance> instances = discoveryClient.getInstances("demo-nacos-provider");
        if (instances.isEmpty()) {
            return null;
        }
        // 随机获取一个URL
        return instances.get(RANDOM.nextInt(instances.size())).getUri() + "/";
    }

    /**
     * <h1>获取</h1>
     * http://127.0.0.1:8090/get
     */
    @GetMapping("get")
    public Result<Long> get() {
        ResponseEntity<Result<Long>> response = restTemplate.exchange(
                // URL
                getUrl() + "get",
                // 请求方法
                HttpMethod.GET,
                // 请求体
                null,
                // 响应体
                new ParameterizedTypeReference<Result<Long>>() {
                }
        );
        Result<Long> body = response.getBody();
        log.info("获取 {}", body);
        return body;
    }

}
