package com.bit.dress_shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.dress_shop.domain.Product;
import com.bit.dress_shop.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> showCategory(int category_id) {
		return productRepository.showCategory(category_id);
	}
	
	public List<Product> showItem(int item_id) {
		return productRepository.showItem(item_id);
	}
	
	public boolean deleteProduct(int product_id) {
		return productRepository.deleteProduct(product_id);
	}
	
	public boolean updateProduct(Product product) {
		return productRepository.updateProduct(product);
	}
	
	public Product showProduct(int product_id) {
		return productRepository.showProduct(product_id);
	}
	
	public boolean addProduct(Product product) {
		return productRepository.addProduct(product);
	}
} 
