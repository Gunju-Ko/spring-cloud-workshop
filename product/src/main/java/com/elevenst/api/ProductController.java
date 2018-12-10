package com.elevenst.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping(path = "{productId}")
    public String getProductInfo(@PathVariable String productId) {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        return "[product id = " + productId + " at " + System.currentTimeMillis() + "]";
//        throw new RuntimeException("I/O Exception");
    }
}
