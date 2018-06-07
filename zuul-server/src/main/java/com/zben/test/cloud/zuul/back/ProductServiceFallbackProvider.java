package com.zben.test.cloud.zuul.back;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: zben
 * @Description: Product Service服务失败回退处理
 * @Date: 上午10:12 2018/6/7
 */
@Component
@Slf4j
public class ProductServiceFallbackProvider implements ZuulFallbackProvider {

    /**
     * 方法返回了我们要为那个微服务提供回退
     * @return
     */
    @Override
    public String getRoute() {
        /**
         * 这里是route的名称，不是服务的名称
         * 如果这里写成大写的SERVICE-PRODUCT将无法起到回退作用
         */
        return "service-product";
    }

    @Override
    public ClientHttpResponse fallbackResponse() {
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return 200;
            }

            @Override
            public String getStatusText() throws IOException {
                return "OK";
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                return new ByteArrayInputStream("商品服务暂不可用，请稍后重试！".getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
                return headers;
            }
        };
    }
}
