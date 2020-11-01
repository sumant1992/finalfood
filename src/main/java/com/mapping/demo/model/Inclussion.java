package com.mapping.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inclussion {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	public String item;
	public String portion;
	public Inclussion(int id, String item, String portion) {
		super();
		this.id = id;
		this.item = item;
		this.portion = portion;
	}
	@Override
	public String toString() {
		return "Inclussion [id=" + id + ", item=" + item + ", portion=" + portion + "]";
	}
	public Inclussion() {
		super();
	}
	
	
	
	
	
	
	
	
}
