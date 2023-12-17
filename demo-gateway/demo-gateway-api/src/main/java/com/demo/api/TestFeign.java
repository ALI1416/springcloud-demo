package com.demo.api;

import cn.z.entity.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <h1>测试</h1>
 *
 * <p>
 * createDate 2023/12/16 16:07:30
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@FeignClient(value = "demo-gateway-provider-test", path = "test", contextId = "test")
public interface TestFeign {

    /**
     * <h1>获取</h1>
     */
    @GetMapping("get")
    Result<Long> get();

}
