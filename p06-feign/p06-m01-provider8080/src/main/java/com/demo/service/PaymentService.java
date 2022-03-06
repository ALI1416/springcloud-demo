package com.demo.service;

import cn.z.id.Id;
import com.demo.dao.mysql.PaymentDao;
import com.demo.entity.po.Payment;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <h1>支付</h1>
 *
 * <p>
 * createDate 2022/02/20 11:08:17
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@Service
@AllArgsConstructor
public class PaymentService {

    private final PaymentDao paymentDao;

    /**
     * 插入
     *
     * @param payment Payment(必须serial)
     * @return ok:id,e:0
     */
    @Transactional
    public long insert(Payment payment) {
        return paymentDao.insert(payment);
    }

    /**
     * 查询，根据id
     *
     * @param id id
     * @return Payment
     */
    public Payment findById(Long id) {
        return paymentDao.findById(id);
    }

}
