package com.demo.dao.mysql;

import cn.z.id.Id;
import com.demo.base.DaoBase;
import com.demo.entity.po.Payment;
import com.demo.mapper.PaymentMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * <h1>支付</h1>
 *
 * <p>
 * createDate 2022/02/19 20:56:13
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@Service
@AllArgsConstructor
public class PaymentDao extends DaoBase {

    private PaymentMapper paymentMapper;

    /**
     * 插入
     *
     * @param payment Payment(必须serial)
     * @return ok:id,e:0
     */
    public long insert(Payment payment) {
        payment.setId(Id.next());
        return tryif(() -> paymentMapper.insert(payment)) ? payment.getId() : 0L;
    }

    /**
     * 查询，根据id
     *
     * @param id id
     * @return Payment
     */
    public Payment findById(Long id) {
        return paymentMapper.findById(id);
    }

}
