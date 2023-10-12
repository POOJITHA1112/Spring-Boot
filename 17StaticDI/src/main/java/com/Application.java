package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dao.AbcRepository;
import com.entity.Abc;
import com.service.AbcService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	static AbcService ab;

	@Autowired
	AbcRepository abc;

	@Override
	public void run(String... args) throws Exception {

		Abc a1 = new Abc("balaji", 70000.00);
		Abc a2 = new Abc("rajasri ", 90000.00);
		abc.save(a2);
//		ab.save(a1);

	}

}
