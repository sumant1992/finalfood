package com.mapping.demo.dto;

import com.mapping.demo.model.Dish;

public class DishDto 
{
	
	public Dish dish;

	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	public DishDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DishDto(Dish dish) {
		super();
		this.dish = dish;
	}

	@Override
	public String toString() {
		return "DishDto [dish=" + dish + "]";
	}
	
	
	

}
