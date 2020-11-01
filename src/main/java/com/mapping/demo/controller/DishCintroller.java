package com.mapping.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.demo.dto.DishDto;
import com.mapping.demo.model.Dish;
import com.mapping.demo.repo.DishRepo;

@RestController
public class DishCintroller {

	@Autowired
	DishRepo repo;
	
	
	@PostMapping("/add")
	public Dish saveDish(@RequestBody DishDto dish) {
		return repo.save(dish.getDish());
		
	}
	
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/all")
	public List<Dish> gelall(){
		return repo.findAll();
	}
}
