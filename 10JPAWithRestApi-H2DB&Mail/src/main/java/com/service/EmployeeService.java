package com.service;

import java.util.List;

import com.entity.Employee;

public interface EmployeeService {
	
	List<Employee>getAll();
	
	Employee save(Employee emp);
	
	Employee getbyid(int id);
	
	Employee update(Employee emp);
	
	void delete(int id);

}
