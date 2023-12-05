package com.demo.service;

import cn.z.entity.po.Goods;
import com.demo.dao.mysql.GoodsDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <h1>商品</h1>
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
public class GoodsService {

    private final GoodsDao goodsDao;

    /**
     * 插入
     *
     * @param goods id,name,price
     * @return ok:id,e:0
     */
    @Transactional
    public long insert(Goods goods) {
        return goodsDao.insert(goods);
    }

    /**
     * 查询，根据id
     *
     * @param id id
     * @return Goods
     */
    public Goods findById(Long id) {
        return goodsDao.findById(id);
    }

    /**
     * 查询，根据id列表
     *
     * @param idList id
     * @return List Goods
     */
    public List<Goods> findByIdList(List<Long> idList) {
        return goodsDao.findByIdList(idList);
    }

}
