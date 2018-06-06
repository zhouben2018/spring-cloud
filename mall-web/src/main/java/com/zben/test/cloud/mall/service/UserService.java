package com.zben.test.cloud.mall.service;

import com.zben.test.cloud.mall.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午10:06 2018/6/6
 */
@FeignClient("SERVICE-PRODUCT")
public interface UserService {

    @GetMapping("/users/{id}")
    User findById(@PathVariable("id") Long id);

    @GetMapping("/users")
    List<User> findAllUsers();
}
