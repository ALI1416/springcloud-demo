package com.demo.controller;

import cn.z.api.GoodsFeign;
import cn.z.entity.po.Goods;
import cn.z.entity.pojo.Result;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <h1>商品</h1>
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
@RequestMapping("goods")
public class GoodsController {

    private final GoodsFeign goodsFeign;

    /**
     * <h1>插入</h1>
     * http://127.0.0.1:8090/goods/insert?name=apple&price=3
     */
    @GetMapping("insert")
    public Result<Goods> insert(Goods goods) {
        Result<Goods> result = goodsFeign.insert(goods);
        log.info("插入 {}", result);
        return result;
    }

    /**
     * <h1>查询id</h1>
     * http://127.0.0.1:8090/goods/findById?id=0
     */
    @GetMapping("findById")
    public Result<Goods> findById(long id) {
        Result<Goods> result = goodsFeign.findById(id);
        log.info("查询id {}", result);
        return result;
    }

    /**
     * <h1>查询id数组</h1>
     * http://127.0.0.1:8090/goods/findByIdArray?idArray=0,1
     */
    @GetMapping("findByIdArray")
    public Result<List<Goods>> findByIdArray(Long[] idArray) {
        Result<List<Goods>> result = goodsFeign.findByIdArray(idArray);
        log.info("查询id数组 {}", result);
        return result;
    }

}
