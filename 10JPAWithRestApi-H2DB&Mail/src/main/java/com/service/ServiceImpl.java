package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Employee;
import com.repository.EmployeeRepository;
import com.util.EmailUtil;

@Service
public class ServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmailUtil emailUtil;
	
	@Override
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	@Override
    public Employee save(Employee employee) {
        Employee emp =  employeeRepository.save(employee);
        emailUtil.sendSimpleEmail(employee.getEmail(), "Employee registration form", "Employee registered successfully with "+ "Registration id:"+emp.getId()+" Name:"+emp.getName());
        return emp;
    }

	@Override
	public Employee getbyid(int id) {
		 return employeeRepository.findById(id).get();
	}

	@Override
	public Employee update(Employee emp) {
		return employeeRepository.save(emp);
	}

	@Override
	public void delete(int id) {
		employeeRepository.deleteById(id);
		
	}

}
