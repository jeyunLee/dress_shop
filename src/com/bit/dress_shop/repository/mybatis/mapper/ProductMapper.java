package com.bit.dress_shop.repository.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bit.dress_shop.domain.Product;

public interface ProductMapper {
	public List<Product> showCategory(@Param("category_id") int category_id);
	public List<Product> showItem(@Param("item_id") int item_id);
	public boolean deleteProduct(@Param("product_id") int product_id);
	public boolean updateProduct(Product product);
	public Product showProduct(int product_id);
	public boolean addProduct(Product product);
}
