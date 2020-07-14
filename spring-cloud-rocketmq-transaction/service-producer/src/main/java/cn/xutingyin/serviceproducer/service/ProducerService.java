package cn.xutingyin.serviceproducer.service;

import cn.xutingyin.serviceproducer.model.Produce;

/**
 * @description: 获取商品信息相关接口
 * @author: xuty
 * @date: 2020/7/14 14:02
 */
public interface ProducerService {

    /**
     * 根据商品ID查找商品
     */
    Produce findById(int produceId);

    /**
     * 更新库存
     * 
     * 
     * @param key
     *            唯一值 分布式事务用
     * @param produceId
     *            商品ID
     * @param store
     *            销售库存数量
     */
    void updateStore(int produceId, int store, String key) throws Exception;
}