package com.mutti.coffeeapp.coffee.controller;

import com.mutti.coffeeapp.coffee.entity.Coffee;
import com.mutti.coffeeapp.coffee.repository.CoffeeRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/coffee")
@CrossOrigin(origins = "localhost:4200")
public class CoffeeController {

    CoffeeRepository coffeeRepository;

    public CoffeeController(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @GetMapping
    public List<Coffee> getCoffee() {
        return coffeeRepository.findAll();
    }
}
