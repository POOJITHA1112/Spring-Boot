package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AbcRepository;
import com.entity.Abc;

@Service
public class ServiceImpl implements AbcService{

	@Autowired
	AbcRepository repo;
	
	@Override
	public Abc save(Abc a) {
		return repo.save(a);
	}
	

}
