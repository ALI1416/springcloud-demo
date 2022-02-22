package com.demo.controller;

import com.demo.entity.po.Payment;
import com.demo.entity.pojo.Result;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <h1>消费者</h1>
 *
 * <p>
 * createDate 2022/02/19 19:57:45
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@RestController
@AllArgsConstructor
@RequestMapping("consumer")
@Slf4j
public class ConsumerController {

    // 订单URL：名称为提供者名称(全大写)
    public static final String PAYMENT_URL = "http://PROVIDER-CLUSTER-PROVIDER/";

    private final RestTemplate restTemplate;

    /**
     * eureka服务发现
     */
    private final DiscoveryClient discoveryClient;

    /**
     * <h1>插入</h1>
     * GET http://localhost/consumer/payment/insert?serial=123<br>
     * 返回 {"ok":true,"code":0,"msg":"成功","data":37611884112773120}
     *
     * @param payment Payment(必须serial)
     * @return ok:id,e:0
     */
    @GetMapping("payment/insert")
    public Result insert(Payment payment) {
        Result result = restTemplate.postForObject(PAYMENT_URL + "payment/insert", payment, Result.class);
        log.info("插入数据：{}，返回结果：{}", payment, result);
        return result;
    }

    /**
     * <h1>查询，根据id</h1>
     * GET http://localhost/consumer/payment/findById/0<br>
     * 返回 {"ok":true,"code":0,"msg":"成功","data":0}
     *
     * @param id id
     * @return Payment
     */
    @GetMapping("payment/findById/{id}")
    public Result findById(@PathVariable("id") Long id) {
        Result result = restTemplate.getForObject(PAYMENT_URL + "payment/findById/" + id, Result.class);
        log.info("查询id：{}，返回结果：{}", id, result);
        return result;
    }

    /**
     * eureka服务发现
     * GET http://localhost/consumer/discovery
     */
    @GetMapping("discovery")
    public Result discovery() {
        // 注册的服务
        for (String service : discoveryClient.getServices()) {
            log.info(service);
            // 服务示例详情
            for (ServiceInstance instance : discoveryClient.getInstances(service)) {
                log.info(instance.toString());
            }
        }
        return Result.o(discoveryClient);
    }

}
