package com.zben.test.cloud.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午2:02 2018/6/6
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String loginName;                                   // 用户登陆名称
    private String name;                                        // 用户姓名
    private String avatar;                                      // 用户头像
    private String memos;                                       // 信息备注

}
