package com.zben.test.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午11:18 2018/6/5
 */
@EnableEurekaServer     //声明这是一个Eureka服务器。
@SpringBootApplication
public class ApplicationDiscovery {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationDiscovery.class).web(true).run(args);
    }
}
