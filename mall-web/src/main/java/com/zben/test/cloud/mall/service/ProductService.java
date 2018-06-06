package com.zben.test.cloud.mall.service;

import com.zben.test.cloud.mall.model.Product;
import com.zben.test.cloud.mall.service.impl.ProductServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午7:25 2018/6/5
 */
@FeignClient(name = "SERVICE-PRODUCT", fallback = ProductServiceFallback.class)
public interface ProductService {

    @GetMapping(value = "/products")
    List<Product> findAll();

    @GetMapping(value = "/products/{itemCode}")
    Product loadByItemCode(@PathVariable("itemCode") String itemCode);
}
