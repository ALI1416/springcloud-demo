package com.demo.controller;

import cn.z.entity.po.Goods;
import cn.z.entity.pojo.Result;
import cn.z.id.Id;
import cn.z.api.TestFeign;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
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

    private final TestFeign testFeign;

    /**
     * <h1>插入</h1>
     * http://127.0.0.1:9080/goods/insert<br>
     * {"name":"苹果","price":2}
     */
    @PostMapping("insert")
    public Result<Goods> insert(@RequestBody Goods goods) {
        goods.setId(Id.next());
        log.info("插入 {}", goods);
        return Result.o(goods);
    }

    /**
     * <h1>查询id</h1>
     * http://127.0.0.1:9080/goods/findById?id=0
     */
    @GetMapping("findById")
    public Result<Goods> findById(long id, HttpServletRequest request) {
        String hi = request.getHeader("hi");
        if (hi != null) {
            log.info("全局AddRequestHeader请求头hi:{}", hi);
        }
        Goods goods = new Goods();
        goods.setId(id);
        goods.setName("苹果");
        goods.setPrice(2);
        log.info("查询id {}", goods);
        return Result.o(goods);
    }

    /**
     * <h1>查询id数组</h1>
     * http://127.0.0.1:9080/goods/findByIdArray?idArray=0,1
     */
    @GetMapping("findByIdArray")
    public Result<List<Goods>> findByIdArray(Long[] idArray) {
        List<Goods> list = new ArrayList<>();
        for (Long id : idArray) {
            Goods goods = new Goods();
            goods.setId(id);
            goods.setName("苹果" + id);
            goods.setPrice(2);
            list.add(goods);
        }
        log.info("查询id数组 {}", list);
        return Result.o(list);
    }

    /**
     * <h1>获取2</h1>
     * http://127.0.0.1:8090/consumer/get2
     */
    @GetMapping("get2")
    public Result<Long> get2() {
        Result<Long> result = testFeign.get2();
        log.info("获取2 {}", result);
        return result;
    }

}
