package cn.xutingyin.serviceproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import cn.xutingyin.serviceproducer.service.ProducerService;

/**
 * @description:商品服务对外提供接口
 * @author: xuty
 * @date: 2020/7/14 14:06
 */

@RestController
@RequestMapping("/api/v1/produce")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    /**
     * 根据主键ID获取商品
     */
    @GetMapping("/find")
    public String findById(@RequestParam(value = "produceId") int produceId) {
        return JSON.toJSONString(producerService.findById(produceId));

    }

}