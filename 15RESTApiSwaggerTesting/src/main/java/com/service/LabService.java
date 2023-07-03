package com.service;

import java.util.List;

import com.entity.Lab;

public interface LabService {

	Lab save(Lab lab);

	Lab update(Lab lab);

	List<Lab> findAll();

	void deleteById(int id);

	Lab findById(int id);

	Lab findByName(String name);

	Lab findByLocation(String location);

	Lab findByNameAndLocation(String name, String location);

}
