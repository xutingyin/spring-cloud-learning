package cn.xutingyin.serviceorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: 支持熔断降级 和 Feign
 * @author: xuty
 * @date: 2020/7/14 14:28
 */

@SpringBootApplication
@EnableFeignClients
// 添加熔断降级注解
@EnableCircuitBreaker
@EnableDiscoveryClient
public class ServiceOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceOrderApplication.class, args);
    }

}
