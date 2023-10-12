package com.dao;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class DaoImpl implements EmployeeDao {

	@Autowired
	JdbcTemplate jdbc;
	
	private static final Logger lg=org.slf4j.LoggerFactory.getLogger(DaoImpl.class);

	@Override
	public void save(Employee emp) {
		lg.info("dao save method started");
		jdbc.update("insert into employee values(?,?,?,?)", emp.getId(), emp.getName(), emp.getSalary(),
				emp.getEmail());
		lg.info("dao save method ended");

	}

	@Override
	public List<Employee> getAll() {
		lg.info("dao get all started");
		 List<Employee> query = jdbc.query("select * from employee", new BeanPropertyRowMapper<>(Employee.class));
		 lg.info("dao get all ended here");
		 return query;
	}

	@Override
	public void update(Employee emp) {
		lg.info("dao update started");
		String q="update employee set name=?,salary=?,email=? where id=?";
		int i = jdbc.update(q,new Object[] { emp.getName(),emp.getSalary()
				,emp.getEmail(),emp.getId()});
		System.out.println(i);
		lg.info("dao update ended here");
		
	}

	@Override
	public void delete(int id) {
		lg.info("dao delete started here");

		String d="delete from employee where id=?";
		jdbc.update(d,id);
		lg.info("dao delete ended here");

		
	}

	@Override
	public Employee getbyid(int id) {
		lg.info("dao getbyid started here");

		return jdbc.queryForObject("select * from employee where id=?", new BeanPropertyRowMapper<>(Employee.class),id);
		//System.out.println(o);
	}

}
