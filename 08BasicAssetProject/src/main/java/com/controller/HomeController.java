package com.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.model.Asset;
import com.service.ServiceImpl;

@Controller
public class HomeController {
	
	@Value("${app.uploadfolder")
	private String UPLOAD_FOLDER;
	
	
	@Autowired
	ServiceImpl impl;
	
	
	@GetMapping("/save")
	public String home() {
		return "save";
	}
	
	@PostMapping("/saveEmp")
	public String save(Asset a,@RequestParam("photo")MultipartFile photo) {
		System.out.println(photo.getOriginalFilename());
		
		try {
			byte[] bytes = photo.getBytes();
            String photoUrl = UPLOAD_FOLDER + photo.getOriginalFilename();
			a.setPhotoUrl(photo.getOriginalFilename());
			Path path=Paths.get(photoUrl);
			Files.write(path, bytes);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		impl.save(a);
		return "redirect:/listEmps";
		
	}
	
	@GetMapping("/listEmps")
	public ModelAndView get() {
		List<Asset> all = impl.getAll();
		return new ModelAndView("list", "asset",all);
	}
	
	@GetMapping("/update")
	public ModelAndView getbyid(@RequestParam int id) {
		return new ModelAndView("update", "as", impl.getbyid(id));
	}
	
	@PostMapping("/updateEmp")
	public String update(Asset a) {
		impl.update(a);
		return "redirect:/listEmps";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam int id) {
		impl.delete(id);
		return "redirect:/listEmps";
	}

}
