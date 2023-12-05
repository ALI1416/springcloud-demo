package com.demo.dao.mysql;

import cn.z.base.DaoBase;
import cn.z.entity.po.Goods;
import cn.z.id.Id;
import com.demo.mapper.GoodsMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <h1>商品</h1>
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
public class GoodsDao extends DaoBase {

    private GoodsMapper goodsMapper;

    /**
     * 插入
     *
     * @param goods id,name,price
     * @return ok:id,e:0
     */
    public long insert(Goods goods) {
        goods.setId(Id.next());
        return tryEq1(() -> goodsMapper.insert(goods)) ? goods.getId() : 0L;
    }

    /**
     * 查询，根据id
     *
     * @param id id
     * @return Goods
     */
    public Goods findById(Long id) {
        return goodsMapper.findById(id);
    }

    /**
     * 查询，根据id列表
     *
     * @param idList id
     * @return List Goods
     */
    public List<Goods> findByIdList(List<Long> idList) {
        return goodsMapper.findByIdList(idList);
    }

}
