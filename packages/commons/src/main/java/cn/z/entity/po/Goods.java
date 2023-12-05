package cn.z.entity.po;

import cn.z.base.EntityBase;
import lombok.Getter;
import lombok.Setter;

/**
 * <h1>商品</h1>
 *
 * <p>
 * createDate 2023/12/05 15:12:58
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@Getter
@Setter
public class Goods extends EntityBase {

    /**
     * 名称
     */
    private String name;
    /**
     * 价格
     */
    private Integer price;

}
