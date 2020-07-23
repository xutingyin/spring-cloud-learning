package cn.xutingyin.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.xutingyin.consumer.remote.HelloRemote;

/**
 * @description:服务消费者控制器
 * @author: xuty
 * @date: 2020/7/21 16:00
 */

@RestController
public class ConsumerController {
    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    @HystrixCommand(fallbackMethod = "fall")
    public String hello(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }

    public String fall() {
        return "fall...";
    }
}
