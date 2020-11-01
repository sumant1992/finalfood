package com.mapping.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Breakfast 
{
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	public String breakfast;
	public String time;
	public String day;
	@Override
	public String toString() {
		return "Breakfast [id=" + id + ", breakfast=" + breakfast + ", time=" + time + ", day=" + day + "]";
	}
	public Breakfast(int id, String breakfast, String time, String day) {
		super();
		this.id = id;
		this.breakfast = breakfast;
		this.time = time;
		this.day = day;
	}
	public Breakfast() {
		super();
	}
	
	
	
	
	
	
	
	

}
