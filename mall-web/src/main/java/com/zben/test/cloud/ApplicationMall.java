package com.zben.test.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午7:19 2018/6/5
 */
@SpringBootApplication
@EnableHystrixDashboard        //开启Hystrix Dashboard服务
@EnableCircuitBreaker       //启用断路器支持
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.zben.test.cloud.mall.**")     //开启Feign相关功能
public class ApplicationMall {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMall.class, args);
    }
}
