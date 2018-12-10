package com.elevenst.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductRemoteServiceImpl implements ProductRemoteService {

    private static final String url = "http://product/products/";
    private final RestTemplate restTemplate;

    public ProductRemoteServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    @HystrixCommand(commandKey = "productInfo", fallbackMethod = "getProductInfoFallback")
    public String getProductInfo(String productId) {
        return this.restTemplate.getForObject(url + productId, String.class);
    }

    public String getProductInfoFallback(String productId, Throwable t) {
        System.out.println("t = " + t);
        return "[ this product is sold out ]";
    }
}
