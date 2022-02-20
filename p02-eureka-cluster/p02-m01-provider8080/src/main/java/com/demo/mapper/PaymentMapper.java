package com.demo.mapper;

import com.demo.entity.po.Payment;

/**
 * <h1>支付</h1>
 *
 * <p>
 * createDate 2022/02/19 20:28:35
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
public interface PaymentMapper {

    /**
     * 插入
     *
     * @param payment Payment(必须serial)
     * @return 插入成功数量
     */
    int insert(Payment payment);

    /**
     * 查询，根据id
     *
     * @param id id
     * @return Payment
     */
    Payment findById(Long id);

}
