package cn.xutingyin.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

@SpringBootApplication
// @EnableEurekaClient -- 和 @EnableDiscoveryClient 一样的作用，都能实现将服务注册到注册中心。只是@EnableEurekaClient 只能注册到Eureka Server 注册中心
// @EnableDiscoveryClient 能够注册到其它的注册中心，比如nacos,zk等
@EnableDiscoveryClient
// @EnableFeignClients启用feign客户端；这里必须指定defaultConfiguration，具体为啥还不太清楚
@EnableFeignClients(defaultConfiguration = FeignClientsConfiguration.class)
// 开启HystrixDashboard
@EnableHystrixDashboard
// 开启CircuitBreaker
@EnableCircuitBreaker
public class HystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class, args);
    }

    // 增加一个Servlet，为了配合监控使用,这里不增加，访问Hystrix DashBoard 会出现 Unable to connect to Command Metric Stream.
    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }

}
