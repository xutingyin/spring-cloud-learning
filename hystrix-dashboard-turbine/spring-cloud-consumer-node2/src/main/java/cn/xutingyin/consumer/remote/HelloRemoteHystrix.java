package cn.xutingyin.consumer.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        System.out.println("熔断了...");
        return "hello " + name + ", this messge send failed ";
    }
}