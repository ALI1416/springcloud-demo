package com.demo.controller;

import cn.z.entity.pojo.Result;
import cn.z.id.Id;
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
@Slf4j
@RequestMapping("test")
public class TestController {

    /**
     * <h1>获取</h1>
     * http://127.0.0.1:8080/test/get
     */
    @GetMapping("get")
    public Result<Long> get() {
        long id = Id.next();
        log.info("获取 {}", id);
        return Result.o(id);
    }

}
