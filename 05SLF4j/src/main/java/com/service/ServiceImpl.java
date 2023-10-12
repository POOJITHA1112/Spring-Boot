package com.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.DaoImpl;
@Service

public class ServiceImpl implements EmployeeService{

	@Autowired
	DaoImpl dao;
	
	private static final Logger lg=LoggerFactory.getLogger(ServiceImpl.class);
	
	
	@Override
	public void save(Employee emp) {
		lg.info("service save method");
		dao.save(emp);
	}

	@Override
	public List<Employee> getAll() {
		lg.info("service getAll method");
		return dao.getAll();
	}

	@Override
	public void update(Employee emp) {
		lg.info("service update");
		dao.update(emp);
		
	}

	@Override
	public void delete(int id) {
		lg.info("service delete");
		dao.delete(id);
		
	}

	@Override
	public Employee getbyid(int id) {
		lg.info("service getbyid");
		return dao.getbyid(id);
		
	}
	

}
