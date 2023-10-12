package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Phone;
import com.repository.PhoneRepository;

@Service
public class ServiceImpl implements PhoneService{

	@Autowired
	PhoneRepository phoneRepository;
	
	@Override
	public Phone save(Phone phone) {
		return phoneRepository.save(phone);
		
		
	}

	@Override
	public List<Phone> getAll() {
		return phoneRepository.findAll();
				
	}

	@Override
	public Phone update(Phone phone) {
		return phoneRepository.save(phone);
	}

	@Override
	public void delete(Integer id) {
		 phoneRepository.deleteById(id);
				
				
	}

	@Override
	public Phone getbyid(Integer id) {
		return phoneRepository.findById(id).get();
	}

}
