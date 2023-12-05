package com.demo.controller;

import cn.z.base.ControllerBase;
import cn.z.entity.po.Goods;
import cn.z.entity.pojo.Result;
import com.demo.service.GoodsService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
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
public class GoodsController extends ControllerBase {

    private final GoodsService goodsService;

    /**
     * <h1>插入</h1>
     * http://127.0.0.1:8080/insert<br>
     * {"name":"苹果","price":2}
     */
    @PostMapping("insert")
    public Result<Long> insert(@RequestBody Goods goods) {
        long id = goodsService.insert(goods);
        log.info("插入 id {} {}", id, goods);
        return Result.o(id);
    }

    /**
     * <h1>查询，根据id</h1>
     * http://127.0.0.1:8080/findById?id=0
     */
    @GetMapping("findById")
    public Result<Goods> findById(long id) {
        Goods goods = goodsService.findById(id);
        log.info("查询id {}", goods);
        return Result.o(goods);
    }

    /**
     * <h1>查询，根据id列表</h1>
     * http://127.0.0.1:8080/findByIdList?idArray=0&idArray=1
     */
    @GetMapping("findByIdList")
    public Result<List<Goods>> findByIdList(Long[] idArray) {
        List<Goods> list = goodsService.findByIdList(Arrays.asList(idArray));
        log.info("查询id列表 {}", list);
        return Result.o(list);
    }

}
