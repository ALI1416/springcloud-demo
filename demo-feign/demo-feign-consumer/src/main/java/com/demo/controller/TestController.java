package com.demo.controller;

import cn.z.api.TestFeign;
import cn.z.entity.pojo.Result;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h1>测试</h1>
 *
 * <p>
 * createDate 2022/02/20 11:12:01
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("test")
public class TestController {

    private final TestFeign testFeign;

    /**
     * <h1>获取</h1>
     * http://127.0.0.1:8090/test/get
     */
    @GetMapping("get")
    public Result<Long> get() {
        Result<Long> result = testFeign.get();
        log.info("获取 {}", result);
        return result;
    }

}
