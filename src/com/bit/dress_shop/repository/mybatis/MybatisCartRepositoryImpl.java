package com.bit.dress_shop.repository.mybatis;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit.dress_shop.domain.Cart;
import com.bit.dress_shop.domain.Member;
import com.bit.dress_shop.repository.CartRepository;
import com.bit.dress_shop.repository.MemberRepository;
import com.bit.dress_shop.repository.mybatis.mapper.CartMapper;

@Repository
public class MybatisCartRepositoryImpl implements CartRepository {
	
	public MybatisCartRepositoryImpl() {
		System.out.println("MybatisCartRepositoryImpl() 생성자");
	}
	@Autowired
	private CartMapper cartMapper;
	
	@Override
	public boolean addCart(Cart cart) {
		return cartMapper.addCart(cart);
	}

	@Override
	public List<Cart> showCart(String session_id) {
		return cartMapper.showCart(session_id);
	}

	@Override
	public boolean deleteCart(int cart_id) {
		return cartMapper.deleteCart(cart_id);
	}

	@Override
	public boolean updateCart(Cart cart) {
		return cartMapper.updateCart(cart);
	}

}
