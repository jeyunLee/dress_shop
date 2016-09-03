package com.bit.dress_shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.dress_shop.domain.Cart;
import com.bit.dress_shop.repository.CartRepository;

@Service
public class CartService {
	
	@Autowired
	private CartRepository cartRepository;
	
	public boolean addCart(Cart cart) {
		return cartRepository.addCart(cart);
	}
	
	public List<Cart> showCart(String session_id) {
		return cartRepository.showCart(session_id);
	}
	
	public boolean deleteCart(int cart_id) {
		return cartRepository.deleteCart(cart_id);
	}
	
	public boolean updateCart(Cart cart) {
		return cartRepository.updateCart(cart);
	}
} 
