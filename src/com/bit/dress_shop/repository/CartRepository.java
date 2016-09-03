package com.bit.dress_shop.repository;

import java.util.List;

import com.bit.dress_shop.domain.Cart;

public interface CartRepository {
	public boolean addCart(Cart cart);
	public List<Cart> showCart(String session_id);
	public boolean deleteCart(int cart_id);
	public boolean updateCart(Cart cart);
	
	
}