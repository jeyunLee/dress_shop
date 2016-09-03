package com.bit.dress_shop.repository.mybatis.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bit.dress_shop.domain.Cart;
import com.bit.dress_shop.domain.Member;

public interface CartMapper {
	public boolean addCart(Cart cart);
	public List<Cart> showCart(@Param("session_id") String session_id);
	public boolean deleteCart(@Param("cart_id") int cart_id);
	public boolean updateCart(Cart cart);
}
