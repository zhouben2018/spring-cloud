package com.zben.test.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午2:01 2018/6/6
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationUser {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationUser.class, args);
    }
}
