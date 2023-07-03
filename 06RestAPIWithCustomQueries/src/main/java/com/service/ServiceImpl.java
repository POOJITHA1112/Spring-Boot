package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.model.Product;
import com.repository.ProductRepository;

@Service
public class ServiceImpl implements ProductService {

	@Autowired
	ProductRepository dao;
	
	@Override
	public void save(Product pr) {
		dao.save(pr);
		
		
	}

	@Override
	public List<Product> getAll() {
		return (List<Product>) dao.findAll();
		
	
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
		
		
	}

	@Override
	public void update(Product pr) {
		dao.save(pr);
		
		
	}

	@Override
	public Optional<Product> getbyid(int id) {
		return dao.findById(id);
	}

}
