package com.demo.controller;

import com.demo.entity.po.Payment;
import com.demo.entity.pojo.Result;
import com.demo.service.PaymentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * <h1>支付</h1>
 *
 * <p>
 * createDate 2022/02/20 11:12:01
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@RestController
@RequestMapping("payment")
@AllArgsConstructor
@Slf4j
public class PaymentController {

    private final PaymentService paymentService;

    /**
     * <h1>插入</h1>
     * GET http://localhost:8080/payment/insert<br>
     * body JSON {"serial":"123"}<br>
     * 返回 {"ok":true,"code":0,"msg":"成功","data":37611884112773120}
     *
     * @param payment Payment(必须serial)
     * @return ok:id,e:0
     */
    @PostMapping("insert")
    public Result insert(@RequestBody Payment payment) {
        long id = paymentService.insert(payment);
        log.info("本机端口：8080，插入数据：{}，插入id：{}", payment, id);
        return Result.o("本机端口：8080，" + id);
    }

    /**
     * <h1>查询，根据id</h1>
     * GET http://localhost:8080/payment/findById/0<br>
     * 返回 {"ok":true,"code":0,"msg":"成功","data":0}
     *
     * @param id id
     * @return Payment
     */
    @GetMapping("findById/{id}")
    public Result findById(@PathVariable("id") Long id) {
        Payment payment = paymentService.findById(id);
        log.info("本机端口：8080，查询id：{}，查询结果：{}", id, payment);
        return Result.o("本机端口：8080，" + payment);
    }

}
