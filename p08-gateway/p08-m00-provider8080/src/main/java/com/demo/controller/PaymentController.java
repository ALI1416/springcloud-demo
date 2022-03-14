package com.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@Slf4j
public class PaymentController {

    /**
     * <h1>a</h1>
     */
    @GetMapping("a/{id}")
    public String a(@PathVariable("id") Integer id) {
        String s = "a/" + id + "，端口号：8080，UUID：" + UUID.randomUUID();
        log.info(s);
        return s;
    }

    /**
     * <h1>b</h1>
     */
    @GetMapping("b")
    public String b() {
        String s = "b，端口号：8080，UUID：" + UUID.randomUUID();
        log.info(s);
        return s;
    }

    /**
     * <h1>c</h1>
     */
    @GetMapping("c")
    public String c() {
        String s = "c，端口号：8080，UUID：" + UUID.randomUUID();
        log.info(s);
        return s;
    }

    /**
     * <h1>d</h1>
     */
    @GetMapping("d")
    public String d() {
        String s = "d，端口号：8080，UUID：" + UUID.randomUUID();
        log.info(s);
        return s;
    }

}
