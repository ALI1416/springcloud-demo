package cn.z.api;

import cn.z.entity.po.Goods;
import cn.z.entity.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <h1>消费者</h1>
 *
 * <p>
 * createDate 2023/12/16 16:07:30
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@FeignClient(value = "demo-seata-consumer", path = "consumer", contextId = "consumer")
public interface ConsumerFeign {

    /**
     * <h1>插入</h1>
     */
    @PostMapping("insert")
    Result<Goods> insert(@RequestBody Goods goods);

}
