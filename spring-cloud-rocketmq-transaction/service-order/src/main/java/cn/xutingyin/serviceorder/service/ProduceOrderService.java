package cn.xutingyin.serviceorder.service;

/**
 * @description:订单业务类
 * @author: xuty
 * @date: 2020/7/14 13:50
 */

public interface ProduceOrderService {

    /**
     * @Description: 下单接口
     * @author xub
     */
    int save(int userId, int produceId, int total);
}