package com.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {


	@Query("select a from Product a")
	public List<Product>getAll();
	
	
	
	
}
