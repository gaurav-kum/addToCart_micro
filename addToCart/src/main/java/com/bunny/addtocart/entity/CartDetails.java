package com.bunny.addtocart.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.UUID;

@Getter
@Setter
public class CartDetails {

    private UUID userId;
    private ArrayList<Product> list;
}
