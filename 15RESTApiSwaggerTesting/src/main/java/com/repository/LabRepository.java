 package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Lab;

@Repository
public interface LabRepository extends JpaRepository<Lab, Integer>{

	Lab findByName(String name);

	Lab findByLocation(String location);

	Lab findByNameAndLocation(String name, String location);
	
}
