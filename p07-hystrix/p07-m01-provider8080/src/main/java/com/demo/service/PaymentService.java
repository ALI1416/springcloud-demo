package com.demo.service;

import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * <h1>支付服务</h1>
 *
 * <p>单独降级</p>
 *
 * <p>
 * createDate 2022/03/06 13:28:58
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@Service
@Slf4j
public class PaymentService {

    /**
     * 正常访问
     *
     * @param id id
     */
    public String ok(Integer id) {
        return "正常访问，端口号8080，线程池：" + Thread.currentThread().getName() + "，id：" + id + "，UUID：" + UUID.randomUUID();
    }

    /**
     * 超时访问
     *
     * @param time 毫秒
     * @see HystrixCommandProperties
     */
    // 降级处理，运行出错或超时3000毫秒调用降级方法
    @HystrixCommand(fallbackMethod = "timeoutHandler", commandProperties = {//
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")})
    public String timeout(Integer time) {
        // time小于0时，运行出错
        if (time < 0) {
            log.info(String.valueOf(10 / 0));
        }
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "超时访问，端口号8080，线程池：" + Thread.currentThread().getName() + "，延时：" + time + "毫秒" + "，UUID：" + UUID.randomUUID();
    }

    /**
     * 超时访问fallback
     *
     * @param time 毫秒
     */
    public String timeoutHandler(Integer time) {
        return "超时访问fallback，端口号8080，线程池：" + Thread.currentThread().getName() + "，延时：" + time + "毫秒" + "，UUID：" + UUID.randomUUID();
    }

    /**
     * 熔断测试
     * 熔断后，在下一个窗口期内，会允许少量请求通过，如果成功，取消熔断
     *
     * @param time 毫秒
     * @see HystrixCommandProperties
     */
    @HystrixCommand(fallbackMethod = "circuitHandler", commandProperties = {//熔断后会降级
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),//启用熔断
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),//10秒内
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),//10个请求中
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")//超过60%失败触发熔断
    })
    public String circuit(Integer time) {
        // time小于0时，运行出错
        if (time < 0) {
            log.info(String.valueOf(10 / 0));
        }
        return "熔断测试，端口号8080，线程池：" + Thread.currentThread().getName() + "，延时：" + time + "毫秒" + "，UUID：" + UUID.randomUUID();
    }

    /**
     * 熔断测试fallback
     *
     * @param time 毫秒
     */
    public String circuitHandler(Integer time) {
        return "熔断测试fallback，端口号8080，线程池：" + Thread.currentThread().getName() + "，延时：" + time + "毫秒" + "，UUID：" + UUID.randomUUID();
    }

}
