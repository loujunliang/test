package com.hcjava.entity;

import java.io.Serializable;

public class Mall implements Serializable {

	private Integer id;
	private String name;
	private String price;
	private String color;

	public Mall() {
		super();
	}

	public Mall(Integer id, String name, String price, String color) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Mall [id=" + id + ", name=" + name + ", price=" + price + ", color=" + color + "]";
	}

}
