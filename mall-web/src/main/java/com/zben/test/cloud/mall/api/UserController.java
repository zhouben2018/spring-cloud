package com.zben.test.cloud.mall.api;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zben.test.cloud.mall.model.User;
import com.zben.test.cloud.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午10:08 2018/6/6
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserService userService;

    @HystrixCommand(fallbackMethod = "findByIdFallback")
    @GetMapping(value = "/users/{id}")
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForEntity("http://SERVICE-PRODUCT/users/" + id, User.class).getBody();
    }

    @GetMapping("/users")
    public List<User> list() {
        return this.userService.findAllUsers();
    }

    public User findByIdFallback(Long id) {
        User user = new User();
        user.setId(-1L);
        user.setName("-default-");
        return user;
    }
}
