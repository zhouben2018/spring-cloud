package com.zben.test.cloud.mall.service.impl;

import com.zben.test.cloud.mall.model.Product;
import com.zben.test.cloud.mall.service.ProductService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.List;

/**
 * @Author: zben
 * @Description:
 * @Date: 上午9:36 2018/6/6
 */
@Component
public class ProductServiceFallback implements ProductService {

    @Override
    public List<Product> findAll() {
        return Collections.emptyList();
    }

    @Override
    public Product loadByItemCode(@PathVariable("itemCode") String itemCode) {
        return new Product("error", "未知", "service-product-fallback", 0);
    }
}
