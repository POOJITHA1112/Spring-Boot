package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.model.Product;

public interface ProductService {
	
	void save(Product pr);
	
	List<Product>getAll();

	void delete(int id);
	
	void update(Product pr);
	
	Optional<Product> getbyid(int id);
}
