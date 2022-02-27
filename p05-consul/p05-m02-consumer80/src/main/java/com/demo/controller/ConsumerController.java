package com.demo.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("consumer")
@AllArgsConstructor
@Slf4j
public class ConsumerController {

    public static final String PAYMENT_URL = "http://consul-provider/";

    private final RestTemplate restTemplate;

    /**
     * <h1>consul</h1>
     */
    @GetMapping("consul")
    public String consul() {
        String result = restTemplate.postForObject(PAYMENT_URL + "payment/consul", null, String.class);
        log.info(result);
        return result;
    }

}
