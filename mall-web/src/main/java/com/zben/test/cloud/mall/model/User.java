package com.zben.test.cloud.mall.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午9:59 2018/6/6
 */
@Data
@NoArgsConstructor@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = -5770850186344142278L;

    private Long id;
    private String name;
}
