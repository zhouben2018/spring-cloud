package com.zben.test.cloud.user.api;

import com.zben.test.cloud.user.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午2:03 2018/6/6
 */
@RestController
@RequestMapping("/users")
@Slf4j
public class UserEndpoint {

    @Value("${server.port}")
    private int serverPort = 2200;

    @GetMapping("/{loginName}")
    public User detail(@PathVariable String loginName) {
        String memos = "I come from " +this.serverPort;
        return new User(loginName, loginName, "/avatar/default.png", memos);
    }
}
