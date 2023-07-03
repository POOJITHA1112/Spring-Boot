package com.controller;

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

import com.entity.Lab;
import com.service.LabService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/lab")
public class LabController {
	
	@Autowired
	private LabService labService;
	
	@Operation
	(summary = "save lab record")
	@PostMapping("/insert ")
	public Lab save(@RequestBody Lab lab) {
		return labService.save(lab);
	}
	
	@Operation
	(summary = "update lab record")
	@PutMapping
	public Lab update(@RequestBody Lab lab) {
		return labService.update(lab);
	}
	
	@Operation
	(summary = "Retrieve all labrecords")
	@GetMapping
	public List<Lab>findAll(){
		return labService.findAll();
	}
	
	@DeleteMapping("/{id}")
	@Operation
	(summary = "delete the record")
	public String deleteById(@PathVariable int id) {
		 labService.deleteById(id);
		 return "deleted";
	}
	
	@Operation
	(summary = "get the record by id")
	@GetMapping("/findById/{id}")
	public Lab findById(@PathVariable int id) {
		 return labService.findById(id);
	}
	
	@Operation
	(summary = "get the record  by name")
	@GetMapping("/findByName/{name}")
	public Lab findByName(@PathVariable String name) {
		return labService.findByName(name);
	}
	
	@Operation
	(summary = "get the record by location")
	@GetMapping("/findByLocation/{location}")
	public Lab findbyLocation(@PathVariable String location) {
		return labService.findByLocation(location);
	}
	
	@Operation
	(summary = "get the record by name and location")
	@GetMapping("/findByNameAndLocation/{name}/{location}")
	public Lab findbyNameAndLocation(@PathVariable String name,@PathVariable String location) {
		return labService.findByNameAndLocation(name,location);
	}
	
	 
	
	

}
