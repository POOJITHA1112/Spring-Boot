package com;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.entity.Phone;
import com.service.ServiceImpl;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	ServiceImpl impl;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		LocalDate date = LocalDate.of(1996, Month.JULY, 1);
		
//		String s="2015-03-31";
//		Date d=Date.valueOf(s);
//		
//		Phone p=new Phone(2, "Infinix Hot 8", 6999.00,d, 4, "purple", 50000);
//		impl.save(p);
//		impl.delete(1);
		
		
		
	}

}
