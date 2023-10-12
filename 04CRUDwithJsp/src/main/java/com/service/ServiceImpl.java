package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.DaoImpl;
@Service

public class ServiceImpl implements EmployeeService{

	@Autowired
	DaoImpl dao;
	
	
	@Override
	public void save(Employee emp) {
		dao.save(emp);
	}

	@Override
	public List<Employee> getAll() {
		return dao.getAll();
	}

	@Override
	public void update(Employee emp) {
		dao.update(emp);
		
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
		
	}

	@Override
	public List<Employee> getbyid(int id) {
		return dao.getbyid(id);
		
	}

	@Override
	public List<Employee> getbyname(String name) {
		return dao.getbyname(name);
	}

	@Override
	public List<Employee> getbyemail(String email) {
		return dao.getByEmail(email);
	}
	

}
