package com.demo.controller;

import cn.z.entity.pojo.Result;
import cn.z.id.Id;
import cn.z.util.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
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
     * http://127.0.0.1:9090/test/get
     */
    @GetMapping("get")
    public Result<Long> get(@RequestHeader(value = "hello", required = false) String hello) {
        log.info("AddRequestHeader请求头hello {}", hello);
        long id = Id.next();
        log.info("获取 {}", id);
        return Result.o(id);
    }

    /**
     * <h1>获取</h1>
     * http://127.0.0.1:9090/test/get2
     */
    @GetMapping("get2")
    public Result<Long> get2(@RequestHeader(value = "user-id", required = false) Long userId) {
        log.info("权限全局网关过滤器请求头user-id {}", userId);
        log.info("UserInfo.getId() {}", UserInfo.getId());
        long id = Id.next();
        log.info("获取2 {}", id);
        return Result.o(id);
    }

}
