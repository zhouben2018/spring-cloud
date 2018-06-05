package com.zben.test.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午11:45 2018/6/5
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationConsumer {
    @Bean
    @LoadBalanced  //该注解就是能够让RestTemplate启用客户端负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    @Primary
    RestTemplate lbcRestTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConsumer.class, args);
    }
}
