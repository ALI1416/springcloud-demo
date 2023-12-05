package com.demo.controller;

import cn.z.base.ControllerBase;
import cn.z.constant.ResultEnum;
import cn.z.entity.po.Goods;
import cn.z.entity.pojo.Result;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    public static final String URL = "http://127.0.0.1:8080/";

    private final RestTemplate restTemplate;

    /**
     * <h1>插入</h1>
     * http://127.0.0.1:8080/insert<br>
     * {"name":"苹果","price":2}
     */
    @PostMapping("insert")
    public Result insert(@RequestBody Goods goods) {
        ResponseEntity<Result<Long>> response = restTemplate.exchange(URL + "insert",
                HttpMethod.POST, RequestEntity.post("").accept(MediaType.APPLICATION_JSON).body(goods),
                new ParameterizedTypeReference<Result<Long>>() {
                }
        );
        if (response.getStatusCode().is2xxSuccessful()) {
            Result<Long> body = response.getBody();
            log.info("插入 {}", body);
            return Result.o(body);
        } else {
            return Result.e(ResultEnum.SYSTEM_INNER_ERROR, response.getStatusCode().value());
        }
    }

    // /**
    //  * <h1>查询，根据id</h1>
    //  * http://127.0.0.1:8080/findById?id=0
    //  */
    // @GetMapping("findById")
    // public Result<Goods> findById(long id) {
    //     Goods goods = goodsService.findById(id);
    //     log.info("查询id {}", goods);
    //     return Result.o(goods);
    // }
    //
    // /**
    //  * <h1>查询，根据id列表</h1>
    //  * http://127.0.0.1:8080/findByIdList?idArray=0&idArray=1
    //  */
    // @GetMapping("findByIdList")
    // public Result<List<Goods>> findByIdList(Long[] idArray) {
    //     List<Goods> list = goodsService.findByIdList(Arrays.asList(idArray));
    //     log.info("查询id列表 {}", list);
    //     return Result.o(list);
    // }

}
