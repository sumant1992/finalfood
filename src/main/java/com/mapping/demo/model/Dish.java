package com.mapping.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Dish {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	public boolean template;
	public String tittle;
	public String description;
	
	public String servers;

	public String price;
	
	
	 @OneToMany(targetEntity = Breakfast.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
	public List<Breakfast> breakfast; 
	 
	 
	 @OneToMany(targetEntity = Delevery.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
	 public List<Delevery> delevery;
	 
	 @OneToMany(targetEntity = Inclussion.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
	 public List<Inclussion> inclusion;
	 
	 
	 public String minorder;
	 
	 public String maxorder;
	 
	 public String category;
	  
	 public String foodtype;
	 
	 public String cusinetype;
	 
	 public String usp;
	 
	 
	 public boolean accompaniment;
	 
	 
	 public String anyoffer;
	 
	 public Date calender;

	public Dish(int id, boolean template, String tittle, String description, String servers, String price,
			List<Breakfast> breakfast, List<Delevery> delevery, List<Inclussion> inclusion, String minorder,
			String maxorder, String category, String foodtype, String cusinetype, String usp, boolean accompaniment,
			String anyoffer, Date calender) {
		super();
		this.id = id;
		this.template = template;
		this.tittle = tittle;
		this.description = description;
		this.servers = servers;
		this.price = price;
		this.breakfast = breakfast;
		this.delevery = delevery;
		this.inclusion = inclusion;
		this.minorder = minorder;
		this.maxorder = maxorder;
		this.category = category;
		this.foodtype = foodtype;
		this.cusinetype = cusinetype;
		this.usp = usp;
		this.accompaniment = accompaniment;
		this.anyoffer = anyoffer;
		this.calender = calender;
	}

	@Override
	public String toString() {
		return "Dish [id=" + id + ", template=" + template + ", tittle=" + tittle + ", description=" + description
				+ ", servers=" + servers + ", price=" + price + ", breakfast=" + breakfast + ", delevery=" + delevery
				+ ", inclusion=" + inclusion + ", minorder=" + minorder + ", maxorder=" + maxorder + ", category="
				+ category + ", foodtype=" + foodtype + ", cusinetype=" + cusinetype + ", usp=" + usp
				+ ", accompaniment=" + accompaniment + ", anyoffer=" + anyoffer + ", calender=" + calender + "]";
	}

	public Dish() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isTemplate() {
		return template;
	}

	public void setTemplate(boolean template) {
		this.template = template;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getServers() {
		return servers;
	}

	public void setServers(String servers) {
		this.servers = servers;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public List<Breakfast> getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(List<Breakfast> breakfast) {
		this.breakfast = breakfast;
	}

	public List<Delevery> getDelevery() {
		return delevery;
	}

	public void setDelevery(List<Delevery> delevery) {
		this.delevery = delevery;
	}

	public List<Inclussion> getInclusion() {
		return inclusion;
	}

	public void setInclusion(List<Inclussion> inclusion) {
		this.inclusion = inclusion;
	}

	public String getMinorder() {
		return minorder;
	}

	public void setMinorder(String minorder) {
		this.minorder = minorder;
	}

	public String getMaxorder() {
		return maxorder;
	}

	public void setMaxorder(String maxorder) {
		this.maxorder = maxorder;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFoodtype() {
		return foodtype;
	}

	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}

	public String getCusinetype() {
		return cusinetype;
	}

	public void setCusinetype(String cusinetype) {
		this.cusinetype = cusinetype;
	}

	public String getUsp() {
		return usp;
	}

	public void setUsp(String usp) {
		this.usp = usp;
	}

	public boolean isAccompaniment() {
		return accompaniment;
	}

	public void setAccompaniment(boolean accompaniment) {
		this.accompaniment = accompaniment;
	}

	public String getAnyoffer() {
		return anyoffer;
	}

	public void setAnyoffer(String anyoffer) {
		this.anyoffer = anyoffer;
	}

	public Date getCalender() {
		return calender;
	}

	public void setCalender(Date calender) {
		this.calender = calender;
	}

	
	 
	 
	 
	 
	 
	
	
	
	

}
