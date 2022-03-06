package com.demo.controller;

import com.demo.service.PaymentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h1>支付</h1>
 *
 * <p>
 * createDate 2022/02/20 11:12:01
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@RestController
@RequestMapping("payment")
@AllArgsConstructor
@Slf4j
public class PaymentController {

    private final PaymentService paymentService;

    /**
     * 正常访问
     * http://localhost:8080/payment/ok?id=123
     *
     * @param id id
     */
    @GetMapping("ok")
    public String ok(Integer id) {
        String s = paymentService.ok(id);
        log.info(s);
        return s;
    }

    /**
     * 超时访问
     * 延时2000毫秒
     * http://localhost:8080/payment/timeout?time=2000
     * 当启用压力测试时，正常访问ok时也变慢
     *
     * @param time 毫秒
     */
    @GetMapping("timeout")
    public String timeout(Integer time) {
        String s = paymentService.timeout(time);
        log.info(s);
        return s;
    }

    /**
     * 熔断测试
     * http://localhost:8080/payment/circuit?time=2000
     * time小于0时报错
     *
     * @param time 毫秒
     */
    @GetMapping("circuit")
    public String circuit(Integer time) {
        String s = paymentService.circuit(time);
        log.info(s);
        return s;
    }

}
