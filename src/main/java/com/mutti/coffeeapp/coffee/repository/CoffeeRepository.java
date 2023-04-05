package com.mutti.coffeeapp.coffee.repository;

import com.mutti.coffeeapp.coffee.entity.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoffeeRepository extends JpaRepository<Coffee, Long> {

    @Override
    List<Coffee> findAll();
}
