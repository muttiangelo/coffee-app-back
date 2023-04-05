package com.mutti.coffeeapp.coffee.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Getter
@AllArgsConstructor
@Table(name = "coffee")
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "coffee_id_seq")
    private long id;

    private String name;

    private String description;

    private String image;

    private double price;

    private String type;

    private String stock;

    public Coffee() {
        // TODO document why this constructor is empty
    }
}
