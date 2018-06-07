package com.zben.test.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午1:54 2018/6/6
 */
@SpringBootApplication
@EnableZuulProxy        //启用zuul的路由服务
public class ApplicationZuul {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationZuul.class, args);
    }
}
