package com.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <h1>订单Feign服务</h1>
 *
 * <p>以下接口为provider的控制层</p>
 *
 * <p>
 * createDate 2022/03/03 20:24:01
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@Component
// 使用降级方法
@FeignClient(value = "HYSTRIX-PROVIDER")
// 实现接口，单独降级(报错)
// @FeignClient(value = "HYSTRIX-PROVIDER", fallback = PaymentServiceFallback.class)
@RequestMapping("payment")
public interface PaymentService {

    /**
     * 正常访问
     * http://localhost:8080/payment/ok?id=123
     *
     * @param id id
     */
    @GetMapping("ok")
    String ok(@RequestParam("id") Integer id);

    /**
     * 超时访问
     * 延时2000毫秒
     * http://localhost:8080/payment/timeout?time=2000
     * 当启用压力测试时，正常访问ok时也变慢
     *
     * @param time 毫秒
     */
    @GetMapping("timeout")
    String timeout(@RequestParam("time") Integer time);

}
