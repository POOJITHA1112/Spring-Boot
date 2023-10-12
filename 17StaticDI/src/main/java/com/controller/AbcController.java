package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Abc;
import com.service.AbcService;

@RestController
@RequestMapping("/abc")
public class AbcController {

	@Autowired
	AbcService ser;
	
	public Abc save(@RequestBody Abc a) {
		return ser.save(a);
	}
	
}
