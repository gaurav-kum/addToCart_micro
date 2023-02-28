package com.bunny.productdetailsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication

public class ProductDetailsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductDetailsServiceApplication.class, args);
    }

}
