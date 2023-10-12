package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bean.Employee;

public interface EmployeeService {

	void save(Employee emp);

	List<Employee> getAll();

	void update(Employee emp);

	void delete(int id);

	Employee getbyid(int id);
}
