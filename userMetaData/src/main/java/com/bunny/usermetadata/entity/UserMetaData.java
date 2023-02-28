package com.bunny.usermetadata.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="User")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserMetaData {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String uniqueId;
    private String email;
}
