package com.demo.mapper;

import cn.z.entity.po.Goods;

import java.util.List;

/**
 * <h1>商品</h1>
 *
 * <p>
 * createDate 2022/02/19 20:28:35
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
public interface GoodsMapper {

    /**
     * 插入
     *
     * @param goods id,name,price
     * @return 插入成功数量
     */
    int insert(Goods goods);

    /**
     * 查询，根据id
     *
     * @param id id
     * @return Goods
     */
    Goods findById(long id);

    /**
     * 查询，根据id列表
     *
     * @param idList id
     * @return List Goods
     */
    List<Goods> findByIdList(List<Long> idList);

}
