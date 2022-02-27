package com.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

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
@Slf4j
public class PaymentController {

    /**
     * <h1>zk</h1>
     */
    @PostMapping("zk")
    public String insert() {
        String s = "端口号：8081，UUID：" + UUID.randomUUID();
        log.info(s);
        return s;
    }

}
