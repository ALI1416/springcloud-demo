package com.demo.controller;

import cn.z.entity.po.Goods;
import cn.z.entity.pojo.Result;
import cn.z.id.Id;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
     * <h1>插入</h1>
     * http://127.0.0.1:9080/goods/insert<br>
     * {"name":"苹果","price":2}
     */
    @Transactional
    @PostMapping("insert")
    public Result<Goods> insert(@RequestBody Goods goods) {
        if (goods.getPrice() == 1) {
            log.error("回滚");
            int a = 1 / 0;
        }
        goods.setId(Id.next());
        log.info("插入 {}", goods);
        return Result.o(goods);
    }

}
