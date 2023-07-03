package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.entity.Lab;
import com.service.LabService;

@SpringBootApplication
public class Application  {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Autowired
//	private LabService labService;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//		Lab l = new Lab();
//		l.setName("hyd name");
//		l.setLocation("hyd loc");
//		
//		labService.save(l);
//		
//		
//	}

}
