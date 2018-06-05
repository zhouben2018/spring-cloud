package com.zben.test.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午7:19 2018/6/5
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.zben.test.cloud.mall.**")     //开启Feign相关功能
public class ApplicationMall {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMall.class, args);
    }
}
