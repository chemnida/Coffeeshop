package com.shop.cafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.cafe.dao.ProductDao;
import com.shop.cafe.dto.Product;

@Service //성격을 알려줄 수 있는 이름으로
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public List<Product> getAllProducts() throws Exception {
		return productDao.getAllProducts();
	}
}
