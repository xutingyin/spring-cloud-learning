package cn.xutingyin.serviceorder.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

/**
 * @description:连接RocketMQ服务器实体
 * @author: xuty
 * @date: 2020/7/14 13:46
 */

@Data
@Configuration
public class Jms {

    /**
     * 配置中心读取 服务器地址
     */
    @Value("${name_server}")
    private String nameServer;

    /**
     * 配置中心读取 主题
     */
    @Value("${order_topic}")
    private String orderTopic;

}