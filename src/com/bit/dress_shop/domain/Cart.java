package com.bit.dress_shop.domain;

public class Cart {
	private int cart_id;
	private String session_id;
	private int product_id;
	private String image_address;
	private String product_name;
	private int qty;
	private int price;
	private String color;
	private String size;

	public Cart() {

	}

	public Cart(int cart_id, String session_id, int product_id, String image_address, String product_name, int qty,  int price, String color,
			String size) {
		this.cart_id = cart_id;
		this.session_id = session_id;
		this.product_id = product_id;
		this.image_address = image_address;
		this.product_name = product_name;
		this.qty = qty;
		this.price = price;
		this.color = color;
		this.size = size;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getImage_address() {
		return image_address;
	}

	public void setImage_address(String image_address) {
		this.image_address = image_address;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	
}
