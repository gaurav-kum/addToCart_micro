package com.bunny.productdetailsservice.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// mongodb stores values in form of document
@Document
public class Product {

    // mongo only supports string, bigint, object for unique
    // identifier
    @Id
    @GeneratedValue
    private BigInteger id;

    private UUID productId;
    private String name;
    private double price;
    private double rating;
    private String imageUrl;

}
