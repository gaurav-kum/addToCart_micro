package com.bunny.addtocart.repo;

import com.bunny.addtocart.entity.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface CartRepo extends CrudRepository<Cart, Long> {

    Cart save(Cart cart);
    void delete(Cart cart);
    ArrayList<Cart> findByUserId(UUID userId);
}
