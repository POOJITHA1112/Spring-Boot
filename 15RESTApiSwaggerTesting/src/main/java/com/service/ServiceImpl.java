package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Lab;
import com.repository.LabRepository;
@Service
public class ServiceImpl implements LabService {

	@Autowired
	private  LabRepository labRepository;
	
	
	@Override
	public Lab save(Lab lab) {
		return labRepository.save(lab);
	}

	@Override
	public Lab update(Lab lab) {
		return labRepository.save(lab);
	}

	@Override
	public List<Lab> findAll() {
		return labRepository.findAll();
	}

	@Override
	public void deleteById(int id) {
		labRepository.deleteById(id);
	}

	@Override
	public Lab findById(int id) {
		return labRepository.findById(id).get();
	}

	@Override
	public Lab findByName(String name) {
		return labRepository.findByName(name);
	}

	@Override
	public Lab findByLocation(String location) {
		return labRepository.findByLocation(location);
	}

	@Override
	public Lab findByNameAndLocation(String name, String location) {
		return labRepository.findByNameAndLocation(name, location);
	}

}
