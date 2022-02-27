package com.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <h1>随机负载均衡配置</h1>
 *
 * <p>
 * createDate 2022/02/27 19:46:27
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@Configuration
public class Random {

    @Bean
    public IRule myRule() {
        // RoundRobinRule 轮训(默认)
        // RandomRule 随机
        // RetryRule 先按RoundRobinRule获取，获取失败后在指定时间内重试
        // WeightedResponseTimeRule 对RoundRobinRule的拓展，响应速度快的权重大
        // BestAvailableRule 过滤掉多次访问故障处于断路器跳闸状态的服务，选一个并发量小的
        // AvailabilityFilteringRule 过滤掉故障实例，，选一个并发量小的
        // ZoneAvoidanceRule 复合判断server所在区域的性能和可用性来选择
        return new RandomRule();
    }

}
