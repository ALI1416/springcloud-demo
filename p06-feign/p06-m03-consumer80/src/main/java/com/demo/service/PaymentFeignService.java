package com.demo.service;

import com.demo.entity.po.Payment;
import com.demo.entity.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

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
// feign客户端(name是微服务地址，path是前缀)
@FeignClient(name = "FEIGN-PROVIDER", path = "payment")
public interface PaymentFeignService {

    /**
     * <h1>插入</h1>
     * GET http://localhost:8080/payment/insert<br>
     * body JSON {"serial":"123"}<br>
     * 返回 {"ok":true,"code":0,"msg":"成功","data":37611884112773120}
     *
     * @param payment Payment(必须serial)
     * @return ok:id,e:0
     */
    @PostMapping("insert")
    Result insert(@RequestBody Payment payment);

    /**
     * <h1>查询，根据id</h1>
     * GET http://localhost:8080/payment/findById/0<br>
     * 返回 {"ok":true,"code":0,"msg":"成功","data":0}
     *
     * @param id id
     * @return Payment
     */
    @GetMapping("findById/{id}")
    Result findById(@PathVariable("id") Long id);

    /**
     * <h1>延时</h1>
     * GET http://localhost:8080/payment/timeout?time=2<br>
     * 延时2秒后返回<br>
     * 注意：GET请求传参，必须带上@RequestParam("名称")注解，否则会转换成POST请求<br>
     * 如果的对象类型，需要用@SpringQueryMap
     *
     * @param time 延时时间
     */
    @GetMapping("timeout")
    Result timeout(@RequestParam("time") int time);

}
