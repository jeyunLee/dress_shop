package com.bit.dress_shop.domain;

public class Product {
	private int category_id;
	private int item_id;
	private int product_id;
	private String product_name;
	private int price;
	private String description;
	private String size;
	private String color;
	private String image_address;
	
	public Product() {
		
	}
	public Product(int category_id,  int item_id, int product_id, String product_name, int price, String description, String size, String color, String image_address) {
		this.category_id = category_id;
		this.item_id = item_id;
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
		this.description = description;
		this.size =size;
		this.color = color;
		this.image_address = image_address;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getImage_address() {
		return image_address;
	}
	public void setImage_address(String image_address) {
		this.image_address = image_address;
	}
}
