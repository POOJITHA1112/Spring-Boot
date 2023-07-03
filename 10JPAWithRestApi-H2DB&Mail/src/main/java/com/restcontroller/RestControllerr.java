package com.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class RestControllerr {
	
	@Autowired
	private EmployeeService employeeService;

	
	
	@GetMapping
	public List<Employee>getAll(){
		return employeeService.getAll();
	}
	
	@PostMapping
	public Employee save(@RequestBody Employee emp) {
		return employeeService.save(emp);
	}
	
	@PutMapping("/update")
	public Employee update(@RequestBody Employee emp) {
		return employeeService.update(emp);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		employeeService.delete(id);
	}
	
	@GetMapping("/getbyid/{id}")
	public Employee getbyid(@PathVariable int id) {
		return employeeService.getbyid(id);
	}
	
}
