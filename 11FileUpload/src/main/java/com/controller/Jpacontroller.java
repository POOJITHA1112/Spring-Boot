package com.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Phone;
import com.service.ServiceImpl;

@Controller
public class Jpacontroller {
	
	
	private static final String UPLOAD_FOLDER="C:\\Users\\User\\StsWorkSpace\\SpringBoot\\11FileUpload\\src\\main\\resources\\static\\img\\";

	
	@Autowired
	ServiceImpl impl;
	
	@GetMapping("/insert")
	public String home() {
		return "savePhone";
	}
	
	@PostMapping("/insertPhone")
	public String save(Phone phone,@RequestParam("photo") MultipartFile img) {
		
		try {
			byte[] bytes = img.getBytes();
			Path path=Paths.get(UPLOAD_FOLDER+img.getOriginalFilename());
			phone.setPhotoUrl(img.getOriginalFilename());
			Files.write(path, bytes);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		impl.save(phone);
		return "redirect:/getAll";
		
	}
	
	@GetMapping("/getAll")
	public ModelAndView getAll() {
		return new ModelAndView("list-phone", "phones", impl.getAll());
	}
	
	@GetMapping("/updatep")
	public ModelAndView getbyid(@RequestParam("id") Integer id) {
		return new ModelAndView("update", "p", impl.getbyid(id));
		
	}
	
	@PostMapping("/updatePhone")
	public String update(Phone phone) {
		impl.update(phone);
		return "redirect:/getAll";
	}
	
	@GetMapping("/deletep")
	public String delete(@RequestParam Integer id) {
		impl.delete(id);
		return "redirect:/getAll";
	}

}
