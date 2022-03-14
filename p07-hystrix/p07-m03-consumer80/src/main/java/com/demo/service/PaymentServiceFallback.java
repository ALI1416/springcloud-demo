package com.demo.service;

import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * <h1>订单Feign服务降级处理</h1>
 *
 * <p>
 * createDate 2022/03/06 14:32:29
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
// @Component
public class PaymentServiceFallback implements PaymentService {

    @Override
    public String ok(Integer id) {
        return "ok降级" + id;
    }

    @Override
    public String timeout(Integer time) {
        return "降级处理，运行出错或超时1500毫秒调用降级方法，线程池：" + Thread.currentThread().getName() + "，延时：" + time + "毫秒" + "，UUID：" + UUID.randomUUID();
    }

}
