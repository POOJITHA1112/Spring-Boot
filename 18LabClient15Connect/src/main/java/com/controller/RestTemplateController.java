package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Lab;
import com.service.ServiceConsumer;

@RestController
public class RestTemplateController {

	
	@Autowired
	private ServiceConsumer serviceConsumer;
	
	@GetMapping("/getAllLabs")
	public String getAllLabs() {
		return serviceConsumer.findAll();
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public Lab save() {
		return serviceConsumer.save();
	}
//	@GetMapping("/getAllcitiesByCountry/{countryName}")
//	public String getAllLabs(@PathVariable("countryName") String countryName) {
//		return serviceConsumer.findAllCitiesNyCountry(countryName);
//	}
	
//	@GetMapping("/getById/{id}")
//	public String getById(@PathVariable  int id) {
//		return serviceConsumer.getById(id);
//	}
//	
//	@GetMapping("/getByName/{name}")
//	public String getByName(@PathVariable  String name) {
//		return serviceConsumer.getByName(name);
//	}
//	
//	@DeleteMapping("/delete/{id}")
//	public String deleteById(@PathVariable int id) {
//		 serviceConsumer.delete(id);
//		 return "deleted";
//	}
	
	
}

