package com.elevenst.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductRemoteServiceImpl implements ProductRemoteService {

    private static final String url = "http://localhost:8082/products/";
    private final RestTemplate restTemplate;

    public ProductRemoteServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String getProductInfo(String productId) {
        return this.restTemplate.getForObject(url + productId, String.class);
    }
}
