package com.app.entities;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable{
	
	protected String product_code;
	protected String product_name;
	protected double product_cost;
	protected String description;
	protected Date manufactured_date;
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getProduct_cost() {
		return product_cost;
	}
	public void setProduct_cost(double product_cost) {
		this.product_cost = product_cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getManufactured_date() {
		return manufactured_date;
	}
	public void setManufactured_date(Date manufactured_date) {
		this.manufactured_date = manufactured_date;
	}
	@Override
	public String toString() {
		return "Product [product_code=" + product_code + ", product_name=" + product_name + ", product_cost="
				+ product_cost + ", description=" + description + ", manufactured_date=" + manufactured_date + "]";
	}
}
