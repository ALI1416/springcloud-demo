package com.demo.controller;

import cn.z.entity.pojo.Result;
import com.demo.autoconfigure.Test2Properties;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
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
public class TestController {

    private Test2Properties test2Properties;

    /**
     * <h1>获取</h1>
     * http://127.0.0.1:8080/get
     */
    @GetMapping("get")
    public Result<Test2Properties> get() {
        return Result.o(test2Properties);
    }

}
