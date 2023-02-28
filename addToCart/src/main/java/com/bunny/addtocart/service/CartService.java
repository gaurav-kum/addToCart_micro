package com.bunny.addtocart.service;

import com.bunny.addtocart.entity.Cart;
import com.bunny.addtocart.entity.CartDetails;
import com.bunny.addtocart.entity.Product;
import com.bunny.addtocart.repo.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class CartService {
    @Autowired
    CartRepo cartRepo;

    @Autowired
    ProductDetailsProxy productDetailsProxy;

    public void addToCart(Cart cart) {
        cartRepo.save(cart);
    }

    public void removeItemFromCart(Cart cart) {
        cartRepo.delete(cart);
    }

    public CartDetails displayProducts(UUID userId) {
        CartDetails cartDetails = new CartDetails();
        // initialize new objects to save details
        cartDetails.setUserId(userId);
        ArrayList<Product> productList = new ArrayList<Product>();

        ArrayList<Cart> cartList = cartRepo.findByUserId(userId);

        for(int i=0; i<cartList.size();i++) {
            Product product = productDetailsProxy.getProductById(cartList.get(i).getProductId());
            productList.add(product);
        }
        cartDetails.setList(productList);
        return cartDetails;
    }
}
