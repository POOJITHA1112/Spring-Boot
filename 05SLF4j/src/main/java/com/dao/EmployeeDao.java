package com.dao;


import java.util.List;

import com.bean.Employee;

public interface EmployeeDao {

	void save(Employee emp);
	
	List<Employee> getAll();
	
	void update(Employee emp);
	
	void delete(int id);
	
	Employee getbyid(int id);
	
	
	
}
