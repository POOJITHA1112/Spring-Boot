package com;

import java.sql.Date;
import java.text.SimpleDateFormat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Dao.DaoImpl;
import com.model.Asset;
import com.service.ServiceImpl;

@SpringBootApplication
public class Application  implements CommandLineRunner{

	@Autowired
	DaoImpl dao;
	
	@Autowired
	ServiceImpl impl;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		String d="dd/MM/yy";
//		Date d1=new Date(22/07/12);
//		SimpleDateFormat sd=new SimpleDateFormat(d);
//		Date date = sd.parse(d1);
//		date.setDate(date);
		
//		String s="2015-03-31";
//		Date d=Date.valueOf(s);
		
		
		
		
//		Asset a1=new Asset(2,"def", "DEF345", "Lab2", "DEF");
//		a1.setInstallationDate(d);
//		Asset a2=new Asset(10, "jkl", "JKL546",d, "lab3", "JKL");
		
//		Asset save = dao.save(a2);
//		Asset save=impl.save(a1);
//		System.out.println(save);
		
//		List<Asset> a = dao.getAll();
//		a.forEach(e->{System.out.println(e);});
		
//		Asset u = dao.update(a1);
//		System.out.println(u);
		
//		int delete = dao.delete(0);
//		System.out.println(delete);
		
//		List<Asset> all = impl.getAll();
//		all.forEach(e->{System.out.println(e);});
		
//		Asset getbyid = impl.getbyid(1);
//		System.out.println(getbyid);
		
	}

}
