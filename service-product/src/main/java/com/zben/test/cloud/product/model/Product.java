package com.zben.test.cloud.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午4:27 2018/6/5
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
    private static final long serialVersionUID = 6009799346056725311L;

    private String itemCode;                                    // 产品货号
    private String name;                                        // 产品名称
    private String bandName;                                    // 产品品牌名称
    private int price;                                          // 产品价格(分)

}
