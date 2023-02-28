package com.bunny.addtocart.controller;

import com.bunny.addtocart.entity.Cart;
import com.bunny.addtocart.entity.CartDetails;
import com.bunny.addtocart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/amazon/addToCart")
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping("/add")
    public void addToCart(@RequestBody Cart cart) {
        cartService.addToCart(cart);
    }

    @DeleteMapping("/remove")
    public void removeFromCart(@RequestBody Cart cart) {
        cartService.removeItemFromCart(cart);
    }

    @GetMapping("/show/{userId}")
    public CartDetails showItem(@PathVariable UUID userId) {
        return cartService.displayProducts(userId);
    }

}
