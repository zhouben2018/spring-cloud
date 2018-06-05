package com.zben.test.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午4:21 2018/6/5
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationProduct {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationProduct.class, args);
    }
}
