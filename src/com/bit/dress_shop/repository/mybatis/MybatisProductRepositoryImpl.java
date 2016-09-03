package com.bit.dress_shop.repository.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit.dress_shop.domain.Product;
import com.bit.dress_shop.repository.ProductRepository;
import com.bit.dress_shop.repository.mybatis.mapper.ProductMapper;

@Repository
public class MybatisProductRepositoryImpl implements ProductRepository {
	
	@Autowired
	private ProductMapper productMapper;

	@Override
	public List<Product> showCategory(int category_id) {
		return productMapper.showCategory(category_id);
	}

	@Override
	public List<Product> showItem(int item_id) {
		return productMapper.showItem(item_id);
	}

	@Override
	public boolean deleteProduct(int product_id) {
		return productMapper.deleteProduct(product_id);
	}

	@Override
	public boolean updateProduct(Product product) {
		return productMapper.updateProduct(product);
	}

	@Override
	public Product showProduct(int product_id) {
		return productMapper.showProduct(product_id);
	}

	@Override
	public boolean addProduct(Product product) {
		return productMapper.addProduct(product);
	}
	
	
}
