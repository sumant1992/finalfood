package com.mapping.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.demo.model.Breakfast;

public interface BreakfastRepo extends JpaRepository<Breakfast, Integer>{

}
