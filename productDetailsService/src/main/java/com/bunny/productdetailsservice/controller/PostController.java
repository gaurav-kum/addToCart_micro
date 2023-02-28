package com.bunny.productdetailsservice.controller;

import com.bunny.productdetailsservice.entity.Product;
import com.bunny.productdetailsservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("/amazon/products")
public class PostController {

    @Autowired
    ProductService productService;

    @PostMapping("/save")
    public Product saveData(@RequestBody Product product) {
        return productService.saveDataToDb(product);
    }

    @GetMapping("/getAllProducts")
    public ArrayList<Product> getAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/search/{productId}")
    public Product getProductById(@PathVariable UUID productId) {
        return productService.getProductDetails(productId);
    }
}
