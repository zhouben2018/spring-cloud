package com.zben.test.cloud.product.api;

import com.zben.test.cloud.product.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午10:05 2018/6/6
 */
@RestController
@RequestMapping("/users")
@Slf4j
public class UserEndpoint {

    private List<User> buildUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "张三"));
        users.add(new User(2L, "李四"));
        users.add(new User(3L, "王五"));
        users.add(new User(4L, "赵六"));
        return users;
    }

    @GetMapping
    public List<User> list() {
        return this.buildUsers();
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        List<User> users = this.buildUsers();
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
