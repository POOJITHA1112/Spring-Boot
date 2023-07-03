package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.model.Student;
import com.repository.JPARepositoryy;

@SpringBootApplication
public class Application  implements CommandLineRunner{

	@Autowired
	JPARepositoryy repo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student s=new Student("pandey", 42000.00);

//		repo.save(s);
		
//		repo.deleteById(11);
		
		
//		List<Student> n = repo.findByName("pooja");
//		n.forEach(e->{System.out.println(e);});
		
//		List<Student> a = repo.findByFee(43000.00);
//		a.forEach(e->{System.out.println(e);});
		
		
//		List<Student> b = repo.findByNameStartingWith("p");
//		b.forEach(e->{System.out.println(e);});
		
		
//		List<Student> c=repo.findByNameEndsWith("a");
//		c.forEach(e->{System.out.println(e);});
		
		
//		List<Student> d = repo.findByNameAndFee("pooja", 34000.00);
//		d.forEach(e->{System.out.println(e);});
		
		
		List<Student> f = repo.findByFeeGreaterThan(34000.00);
		f.forEach(e->{System.out.println(e);});
		
	}

}
