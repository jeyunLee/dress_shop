package com.bit.dress_shop.repository;

import java.util.List;

import com.bit.dress_shop.domain.Product;

public interface ProductRepository {
	public List<Product> showCategory(int category_id);
	public List<Product> showItem(int item_id);
	public boolean deleteProduct(int product_id);
	public boolean updateProduct(Product product);
	public Product showProduct(int product_id);
	public boolean addProduct(Product product);
}
