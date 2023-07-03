package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.Phone;


public interface PhoneService {

	Phone save(Phone phone);
	
	List<Phone>getAll();
	
	Phone update(Phone phone);
	
	void delete(Integer id);
	
	Phone getbyid(Integer id);
	
}
