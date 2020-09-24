package com.luisramirez.CRUD;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Product {
    private Long id;
    private String name;
    private String brand;
    private String madein;
    private float price;
    private float taxes;
    private float discount;


	private float total;
 
    

	protected Product() {
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMadein() {
		return madein;
	}

	public void setMadein(String madein) {
		this.madein = madein;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getTaxes() {
		return taxes;
	}

	public void setTaxes(float taxes) {
		this.taxes = taxes;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
    public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	
     
}
