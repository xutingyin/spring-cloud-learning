package cn.xutingyin.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;

/**
 * @description: @EnableDiscoveryClient 启动服务注册和发现，@EnableFeignClients 启用feign进行远程调用
 * @author: xuty
 * @date: 2020/7/21 15:56
 */

@SpringBootApplication
// @EnableEurekaClient -- 和 @EnableDiscoveryClient 一样的作用，都能实现将服务注册到注册中心。只是@EnableEurekaClient 只能注册到Eureka Server 注册中心
// @EnableDiscoveryClient 能够注册到其它的注册中心，比如nacos,zk等
@EnableDiscoveryClient
// @EnableFeignClients启用feign客户端；这里必须指定defaultConfiguration，具体为啥还不太清楚
@EnableFeignClients(defaultConfiguration = FeignClientsConfiguration.class)
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}
