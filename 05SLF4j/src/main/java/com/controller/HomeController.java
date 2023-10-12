package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Employee;
import com.service.ServiceImpl;

@Controller
public class HomeController {

	@Autowired
	ServiceImpl impl;
	
	private static final Logger lg=LoggerFactory.getLogger(ServiceImpl.class);


	@GetMapping("/home")
	public String home(Model model) {
		
		return "save";
	}

	@PostMapping("/saveemp")
	public String save(Employee emp) {
		impl.save(emp);
		lg.debug( "controller save method");
		return "redirect:/listemp";
	}

	@GetMapping("listemp")
	public ModelAndView getAllEmp() {
		lg.info("controller getAll");
		return new ModelAndView("list", "emps", impl.getAll());
	}
	
	
	@GetMapping("/updateEmp")
	public String up(@RequestParam int id,Model md) {
		Employee emp1=impl.getbyid(id);
		md.addAttribute("emp",emp1);
		lg.debug("controller getbyid",impl.getbyid(id));
		return "update";
	}
	
	@PostMapping("/update")
	public String update(Employee e) {
		impl.update(e);
		lg.info("controller update");
		return "redirect:/listemp";
	}
	
	@GetMapping("deleteEmp")
	public String delete(@RequestParam int id) {
		impl.delete(id);
		lg.info("controller delete");
		return "redirect:/listemp";
	}

}
