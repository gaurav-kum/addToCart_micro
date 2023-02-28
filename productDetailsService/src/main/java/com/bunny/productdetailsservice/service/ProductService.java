package com.bunny.productdetailsservice.service;

import com.bunny.productdetailsservice.entity.Product;
import com.bunny.productdetailsservice.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public Product saveDataToDb(Product product) {
        // product id should be auto-generated id
        product.setProductId(UUID.randomUUID());
        Product prod = productRepo.save(product);
        return prod;
    }

    public ArrayList<Product> findAllProducts() {
        return productRepo.findAll();
    }

    public Product getProductDetails(UUID productId) {
        return productRepo.findByProductId(productId);
    }
}
