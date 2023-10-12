package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class DaoImpl implements EmployeeDao {

	@Autowired
	JdbcTemplate jdbc;

	@Override
	public void save(Employee emp) {
		jdbc.update("insert into employee values(?,?,?,?)", emp.getId(), emp.getName(), emp.getSalary(),
				emp.getEmail());

	}

	@Override
	public List<Employee> getAll() {
		
		 List<Employee> query = jdbc.query("select * from employee", new BeanPropertyRowMapper<>(Employee.class));
		 
		 return query;
	}

	@Override
	public void update(Employee emp) {
		String q="update employee set name=?,salary=?,email=? where id=?";
		int i = jdbc.update(q,new Object[] { emp.getName(),emp.getSalary()
				,emp.getEmail(),emp.getId()});
		System.out.println(i);
		
	}

	@Override
	public void delete(int id) {
		String d="delete from employee where id=?";
		jdbc.update(d,id);
		
	}

	@Override
	public List<Employee> getbyid(int id) {
		return jdbc.query("select * from employee where id=?", new BeanPropertyRowMapper<>(Employee.class),id);
	}

	@Override
	public List<Employee> getbyname(String name) {
		return jdbc.query("select * from employee where name=?", new BeanPropertyRowMapper<>(Employee.class),name);
	}

	@Override
	public List<Employee> getByEmail(String email) {
		return jdbc.query("select * from employee where email=?", new BeanPropertyRowMapper<>(Employee.class),email);
	} 
		
	

}
