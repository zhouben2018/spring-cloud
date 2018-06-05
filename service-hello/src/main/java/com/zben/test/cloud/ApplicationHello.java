package com.zben.test.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午11:34 2018/6/5
 */
@SpringBootApplication
@EnableDiscoveryClient      //声明这是一个Eureka Client
public class ApplicationHello {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationHello.class, args);
    }
}
