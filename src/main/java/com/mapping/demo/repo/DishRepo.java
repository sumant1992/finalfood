package com.mapping.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.demo.model.Dish;

public interface DishRepo extends JpaRepository<Dish,Integer> {

}
