package cn.xutingyin.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("{environment}")
    private String environment;

    @RequestMapping("/hello")
    public String from() {
        return this.environment;
    }
}
