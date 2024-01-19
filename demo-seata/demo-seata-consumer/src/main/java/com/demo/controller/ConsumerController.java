package com.demo.controller;

import cn.z.api.GoodsFeign;
import cn.z.entity.po.Goods;
import cn.z.entity.pojo.Result;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h1>消费者</h1>
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
@RequestMapping("consumer")
public class ConsumerController {

    private final GoodsFeign goodsFeign;

    /**
     * <h1>插入</h1>
     * http://127.0.0.1:8090/consumer/insert?name=apple&price=2
     */
    // seata的全局事务注解
    @GlobalTransactional
    @GetMapping("insert")
    public Result<Goods> insert(Goods goods) {
        Result<Goods> result = goodsFeign.insert(goods);
        log.info("插入 {}", result);
        return result;
    }

}
