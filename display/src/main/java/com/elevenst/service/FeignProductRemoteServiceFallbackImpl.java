package com.elevenst.service;

import org.springframework.stereotype.Component;

@Component
public class FeignProductRemoteServiceFallbackImpl implements FeignProductRemoteService {
    @Override
    public String getProductInfo(String productId) {
        return "[ this product is sold out ]";
    }
}
