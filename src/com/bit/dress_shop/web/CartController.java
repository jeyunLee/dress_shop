package com.bit.dress_shop.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.dress_shop.domain.Cart;
import com.bit.dress_shop.domain.Member;
import com.bit.dress_shop.domain.Product;
import com.bit.dress_shop.service.CartService;

@Controller
public class CartController {

	Logger log = Logger.getLogger(this.getClass());

	@Autowired
	private CartService service;

	@RequestMapping(value = "/cart_product", method = RequestMethod.POST)
	public String addCart(HttpServletRequest request, Model model) throws Exception {
		HttpSession session = request.getSession(false);
		Cart cartinfo = (Cart) session.getAttribute("result");
		String id = cartinfo.getSession_id();
		System.out.println(id);
		String session_id = (String) request.getSession().getId();
		System.out.println(session_id);
		int cart_id = Integer.parseInt(request.getParameter("cart_id"));
		int product_id = Integer.parseInt(request.getParameter("product_id"));
		String image_address = request.getParameter("image_product_name");
		String product_name = request.getParameter("product_name");
		int qty = Integer.parseInt(request.getParameter("qty"));
		String size = request.getParameter("size");
		String color = request.getParameter("color");
		
		Cart cart = new Cart();
		cart.setSession_id(session_id);
		cart.setCart_id(cart_id);
		cart.setProduct_id(product_id);
		cart.setImage_address(image_address);
		cart.setProduct_name(product_name);
		cart.setQty(qty);
		cart.setSize(size);
		cart.setColor(color);
		
		service.addCart(cart);
		model.addAttribute("result", cart);
		
		return "cart";
	}
	
	@RequestMapping(value = "/cart_product", method = RequestMethod.POST)
	public String showCart(HttpServletRequest request, Model model) throws Exception {
		HttpSession session = request.getSession(false);

		String session_id = (String) request.getSession().getId();
		
		
		List<Cart> cart = (List<Cart>) service.showCart(session_id);
		model.addAttribute("result", cart);
		
		return "cart";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String deleteCart(HttpServletRequest request, Model model) throws Exception {
		HttpSession session = request.getSession(false);
		

		int cart_id = Integer.parseInt(request.getParameter("cart_id"));
		
		Cart cart = new Cart();
		cart.setProduct_id(cart_id);
		
		service.deleteCart(cart_id);
		model.addAttribute("result", cart);
		
		return "";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String updaetCart(HttpServletRequest request, Model model) throws Exception {
		HttpSession session = request.getSession(false);
		
		int cart_id = Integer.parseInt(request.getParameter("cart_id"));
		String session_id = request.getParameter("session_id");
		int product_id = Integer.parseInt(request.getParameter("product_id"));
		String image_address = request.getParameter("image_address");
		String product_name = request.getParameter("product_name");
		int price = Integer.parseInt(request.getParameter("price"));
		int qty = Integer.parseInt(request.getParameter("qty"));
		String size = request.getParameter("size");
		String color = request.getParameter("color");
		
		Cart cart = new Cart();
		cart.setCart_id(cart_id);
		cart.setSession_id(session_id);
		cart.setProduct_id(product_id);
		cart.setImage_address(image_address);
		cart.setProduct_name(product_name);
		cart.setPrice(price);
		cart.setQty(qty);
		cart.setSize(size);
		cart.setColor(color);
		
		service.updateCart(cart);
		model.addAttribute("result", cart);
		
		return "";
	}
}
