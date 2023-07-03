package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public interface JPARepositoryy extends JpaRepository<Student, Integer> {

	public List<Student> findByName(String name);
	
	public List<Student> findByFee(double fee);
	
	public List<Student> findByNameStartingWith(String name);
	
	public List<Student> findByNameEndsWith(String name);
	
	public List<Student> findByNameAndFee(String name,double fee);
	
	public List<Student> findByFeeGreaterThan(double fee);
	
}
