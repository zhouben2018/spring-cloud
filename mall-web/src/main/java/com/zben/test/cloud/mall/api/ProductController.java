package com.zben.test.cloud.mall.api;

import com.zben.test.cloud.mall.model.Product;
import com.zben.test.cloud.mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zben
 * @Description:
 * @Date: 下午7:34 2018/6/5
 */
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> list() {
        return this.productService.findAll();
    }

    @GetMapping(value = "/{itemCode}")
    public Product detail(@PathVariable String itemCode) {
        return this.productService.loadByItemCode(itemCode);
    }
}
