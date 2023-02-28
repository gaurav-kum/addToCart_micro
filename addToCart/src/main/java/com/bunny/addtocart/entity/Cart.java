package com.bunny.addtocart.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Cart {
    @Id
    @GeneratedValue
    private long id;

    // Universally Unique Identifier.
    private UUID userId;
    private UUID productId;

    // userId link with productId
    // 001 -> 999 (iphone)
    // 001 -> 555 (charger)

}
