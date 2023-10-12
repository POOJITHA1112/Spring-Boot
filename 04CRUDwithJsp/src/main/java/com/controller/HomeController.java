package com.controller;

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
import com.login.LoginPage;
import com.service.ServiceImpl;

@Controller
public class HomeController {

	@Autowired
	ServiceImpl impl;
	
	@GetMapping("/home")
	public String home(Model model) {
		return "save";
	}
	
	@RequestMapping("/getLogin")
	public String loginpage() {
		return "login";
	}
	
	@GetMapping("/getmapping")
	public ModelAndView login(@RequestParam String username,@RequestParam String  password,LoginPage loginpage) {
		if(username.equals("poojitha")&&password.equals("poojitha")) {
			ModelAndView m=new ModelAndView("redirect:/listemp");
			return m;
		}
		ModelAndView m=new ModelAndView("errorpage");
		return m;
		
	}

	@PostMapping("/saveemp")
	public String save(Employee emp) {
		impl.save(emp);
		return "redirect:/listemp";
	}

	@GetMapping("listemp")
	public ModelAndView getAllEmp() {
		return new ModelAndView("list", "emps", impl.getAll());
	}
	
	
	@GetMapping("/updateEmp")
	public String getbyID(@RequestParam int id,Model md) {
		Employee emp1=(Employee) impl.getbyid(id);
		md.addAttribute("emp",emp1);
		return "update";
	}
	
	@PostMapping("/update")
	public String update(Employee e) {
		impl.update(e);
		return "redirect:/listemp";
	}
	
	@GetMapping("deleteEmp")
	public String delete(@RequestParam int id) {
		impl.delete(id);
		return "redirect:/listemp";
	}
	
	@GetMapping("/getbyid")
	public String getbyid() {
		return "getbyid";
	}
	
	@GetMapping("/getidemp")
	public String getId(@RequestParam int id,Model model) {
		model.addAttribute("emps", impl.getbyid(id));
		return "list";
	}
	
	@GetMapping("/getbyname")
	public String getbyname() {
		return "getbyname";
	}
	
	@GetMapping("/getname")
	public String getbyname(@RequestParam String name,Model md) {
		md.addAttribute("emps",impl.getbyname(name));
		return "list";
	}
	
	@GetMapping("/getbyemail")
	public String getbyemail() {
		return "getbyemail";
	}
	
	@GetMapping("/getemail")
	public String email(@RequestParam String email,Model mod) {
		mod.addAttribute("emps",impl.getbyemail(email));
		return "list";
	}

}
