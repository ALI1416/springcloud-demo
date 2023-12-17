package com.demo.api;

import cn.z.entity.po.Goods;
import cn.z.entity.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <h1>消费者</h1>
 *
 * <p>
 * createDate 2023/12/16 16:07:30
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@FeignClient(value = "demo-gateway-consumer", path = "consumer", contextId = "consumer")
public interface ConsumerFeign {

    /**
     * <h1>插入</h1>
     */
    @PostMapping("insert")
    Result<Goods> insert(@RequestBody Goods goods);

    /**
     * <h1>查询id</h1>
     */
    @GetMapping("findById")
    Result<Goods> findById(@RequestParam("id") long id);

    /**
     * <h1>查询id数组</h1>
     */
    @GetMapping("findByIdArray")
    Result<List<Goods>> findByIdArray(@RequestParam("idArray") Long[] idArray);

}
