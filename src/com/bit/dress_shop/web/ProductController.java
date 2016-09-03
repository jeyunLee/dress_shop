package com.bit.dress_shop.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.dress_shop.domain.Product;
import com.bit.dress_shop.service.ProductService;

@Controller
public class ProductController {

	Logger log = Logger.getLogger(this.getClass());

	@Autowired
	private ProductService service;

	@RequestMapping(value = "/cloth_outer", method = RequestMethod.GET)
	public String showCategory(HttpServletRequest request, Model model) throws Exception {
		
		int category_id = Integer.parseInt(request.getParameter("category_id"));
		
		
		List<Product> product = (List<Product>) service.showCategory(category_id);
		model.addAttribute("result", product);

		return "outer";
	}
	
	
	@RequestMapping(value = "/outer_item)", method = RequestMethod.GET)
	public String showItem(HttpServletRequest request, Model model) throws Exception {
		
		int item_id = Integer.parseInt(request.getParameter("item_id"));
		
		
		List<Product> product = (List<Product>) service.showItem(item_id);
		model.addAttribute("result", product);

		return "outer_result";
	}
	

	@RequestMapping(value = "/product_delete", method = RequestMethod.GET)
	public String deleteProduct(HttpServletRequest request, Model model) throws Exception {
		
		int product_id = Integer.parseInt(request.getParameter("product_id"));
		
		Product product = new Product();
		product.setProduct_id(product_id);
		
		service.deleteProduct(product_id);
		model.addAttribute("result", product);

		return "outer_delete_result";
	}
	
	@RequestMapping(value = "/product_update", method = RequestMethod.POST)
	public String updateProduct(HttpServletRequest request, Model model) throws Exception {
		
		int category_id = Integer.parseInt(request.getParameter("category_id"));
		int item_id = Integer.parseInt(request.getParameter("item_id"));
		int product_id = Integer.parseInt(request.getParameter("product_id"));
		String product_name = request.getParameter("product_name");
		int price = Integer.parseInt(request.getParameter("price"));
		String description = request.getParameter("description");
		String size = request.getParameter("size");
		String color = request.getParameter("color");
		String image_address = request.getParameter("image_address");
		
		Product product = new Product();
		
		product.setCategory_id(category_id);
		product.setItem_id(item_id);
		product.setProduct_id(product_id);
		product.setProduct_name(product_name);
		product.setPrice(price);
		product.setDescription(description);
		product.setSize(size);
		product.setColor(color);
		product.setImage_address(image_address);
		
		service.updateProduct(product);
		model.addAttribute("result", product);

		return "product_change_result";
	}
	
	@RequestMapping(value = "/product_list", method = RequestMethod.GET)
	public String showProduct(HttpServletRequest request, Model model) throws Exception {
		
		int product_id = Integer.parseInt(request.getParameter("product_id"));
		
		
		Product product = (Product) service.showProduct(product_id);
		model.addAttribute("result", product);

		return "outer_update";
	}
	
	@RequestMapping(value = "/insert_product", method = RequestMethod.POST)
	public String addProduct(HttpServletRequest request, Model model) throws Exception {
		
		int category_id = Integer.parseInt(request.getParameter("category_id"));
		int item_id = Integer.parseInt(request.getParameter("item_id"));
		int product_id = Integer.parseInt(request.getParameter("product_id"));
		String product_name = request.getParameter("product_name");
		int price = Integer.parseInt(request.getParameter("price"));
		String description = request.getParameter("description");
		String size = request.getParameter("size");
		String color = request.getParameter("color");
		String image_address = request.getParameter("image_address");
		
		Product product = new Product();
		
		product.setCategory_id(category_id);
		product.setItem_id(item_id);
		product.setProduct_id(product_id);
		product.setProduct_name(product_name);
		product.setPrice(price);
		product.setDescription(description);
		product.setSize(size);
		product.setColor(color);
		product.setImage_address(image_address);
		
		
		service.addProduct(product);
		model.addAttribute("result", product);

		return "add_product_result";
	}
	
}
