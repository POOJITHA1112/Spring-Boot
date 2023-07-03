package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.model.Product;
import com.repository.ProductRepository;

@SpringBootApplication
public class Application implements
 CommandLineRunner{
	
	@Autowired
	ProductRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Product> a = repo.getAll();
		a.forEach(e->{System.out.println(e);});
		
		
	}

}
