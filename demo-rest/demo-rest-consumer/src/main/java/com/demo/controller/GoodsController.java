package com.demo.controller;

import cn.z.entity.po.Goods;
import cn.z.entity.pojo.Result;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
public class GoodsController {

    public static final String URL = "http://127.0.0.1:8080/";
    private final RestTemplate restTemplate;

    /**
     * <h1>插入</h1>
     * http://127.0.0.1:8081/insert?name=apple&price=3
     */
    @GetMapping("insert")
    public Result<Goods> insert(Goods goods) {
        ResponseEntity<Result<Goods>> response = restTemplate.exchange(
                // URL
                URL + "insert",
                // 请求方法
                HttpMethod.POST,
                // 请求体
                RequestEntity.post("").accept(MediaType.APPLICATION_JSON).body(goods),
                // 响应体
                new ParameterizedTypeReference<Result<Goods>>() {
                }
        );
        Result<Goods> body = response.getBody();
        log.info("插入 {}", body);
        return body;
    }

    /**
     * <h1>查询id</h1>
     * http://127.0.0.1:8081/findById?id=0
     */
    @GetMapping("findById")
    public Result<Goods> findById(long id) {
        ResponseEntity<Result<Goods>> response = restTemplate.exchange(
                URL + "findById?id={id}",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Result<Goods>>() {
                },
                // 参数
                id
        );
        Result<Goods> body = response.getBody();
        log.info("查询id {}", body);
        return body;
    }

    /**
     * <h1>查询id数组</h1>
     * http://127.0.0.1:8081/findByIdArray?idArray=0,1
     */
    @GetMapping("findByIdArray")
    public Result<List<Goods>> findByIdArray(Long[] idArray) {
        HashMap<String, String> param = new HashMap<>();
        String idArrayString = Arrays.stream(idArray).map(Object::toString).collect(Collectors.joining(","));
        param.put("idArray", idArrayString);
        ResponseEntity<Result<List<Goods>>> response = restTemplate.exchange(
                URL + "findByIdArray?idArray={idArray}",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Result<List<Goods>>>() {
                },
                // 参数
                param
        );
        Result<List<Goods>> body = response.getBody();
        log.info("查询id数组 {}", body);
        return body;
    }

}
