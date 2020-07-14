package cn.xutingyin.serviceorder.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:商品服务客户端 name = "product-service"是你调用服务端名称
 * @author: xuty
 * @date: 2020/7/14 13:45
 */

@FeignClient(name = "product-service")
public interface ProduceClient {

    /**
     * @Title: @Description: 这样组合就相当于http://product-service/api/v1/product/find @author xub @throws
     */
    @GetMapping("/api/v1/produce/find")
    String findById(@RequestParam(value = "produceId") int produceId);

}