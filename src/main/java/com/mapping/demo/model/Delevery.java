package com.mapping.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Delevery 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	public String time;
	@Override
	public String toString() {
		return "Delevery [id=" + id + ", time=" + time + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Delevery(int id, String time) {
		super();
		this.id = id;
		this.time = time;
	}
	public Delevery() {
		super();
	}
	
	
	

}
