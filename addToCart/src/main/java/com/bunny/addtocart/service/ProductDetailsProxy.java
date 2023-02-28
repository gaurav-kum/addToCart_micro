package com.bunny.addtocart.service;

import com.bunny.addtocart.entity.Product;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

// this proxy is feignClient, which talks to
//other microservice
@FeignClient(name = "product-details", url="localhost:8092")
public interface ProductDetailsProxy {

    @GetMapping("/amazon/products/search/{productId}")
    public Product getProductById(@PathVariable @Param("productId") UUID productId);
}
