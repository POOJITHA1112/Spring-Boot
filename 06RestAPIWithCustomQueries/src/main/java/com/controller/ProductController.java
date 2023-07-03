package com.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;
import com.service.ServiceImpl;

@RestController

public class ProductController {
	
	@Autowired
	ServiceImpl impl;
	
	@PostMapping("/add")
	public Product add(@RequestBody Product pr) {
		impl.save(pr);
		System.out.println("saved");
		return pr;
	}
	
	@GetMapping("/getAll")
	public Iterable<Product>getAll(){
		return impl.getAll();
	}
	
	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable int id) {
		impl.delete(id);
		return "product deleted successfully";
		
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Product pr) {
		 impl.save(pr);

	}
	
	@GetMapping("/getbyid/{id}")
	public Optional<Product> getbyid(@PathVariable int id) {
		return impl.getbyid(id);
	}
	
	
	
}
