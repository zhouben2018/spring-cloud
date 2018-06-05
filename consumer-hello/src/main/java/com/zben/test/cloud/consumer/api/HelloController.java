package com.zben.test.cloud.consumer.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午11:48 2018/6/5
 */
@RestController
@Slf4j
public class HelloController {

    @Autowired
    @Qualifier(value = "restTemplate")
    private RestTemplate restTemplate;

    @Autowired
    @Qualifier(value = "lbcRestTemplate")
    private RestTemplate lbcRestTemplate;

    /**
     * 直接使用Ribbon所提供的LoadBalancerClient来实现负载均衡
     */
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping(value = "/hello")
    public String hello() {
        return restTemplate.getForEntity("http://SERVICE-HELLO/hello", String.class).getBody();
    }

    @GetMapping(value = "helloEx")
    public String helloEx() {
        ServiceInstance instance = this.loadBalancerClient.choose("SERVICE-HELLO");
        URI helloUri = URI.create(String.format("http://%s:%s/hello", instance.getHost(), instance.getPort()));
        log.info("Target service uri = {}.", helloUri.toString());
        return this.lbcRestTemplate.getForEntity(helloUri, String.class).getBody();
    }
}
