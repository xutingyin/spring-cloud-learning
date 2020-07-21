package cn.xutingyin.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: @FeignClient(name = "spring-cloud-provider") name:远程服务名，即远程服务中spring.application.name配置的名称
 * @author: xuty
 * @date: 2020/7/21 15:58
 */

@FeignClient(name = "spring-cloud-provider")
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}