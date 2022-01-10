package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
	  
	  @Autowired 
	  private EmpService service;
	  
	  @RequestMapping("/") 
	  public String home(Model model) 
	  { 
		  List<Employee> emp = service.findall();
		  model.addAttribute("listemp", emp);
		  return "home.html"; 
		  
		  }
	  
	  @GetMapping("/empes") 
	  public String view(Model model,@Param("keyword") String keyword) {
	  List<Employee> emp = service.findByname(keyword);
	  model.addAttribute("listemp", emp); 
	  //model.addAttribute("eid", eid); 
	  return "home.html"; 
	  }
	  
	  @GetMapping("/gage/{age}")
	  public String findGAge(@PathVariable("age") int age,Model model){
		  List<Employee> emp = service.findBygreaterage(age);
		  model.addAttribute("listemp", emp);
		  return "home.html";
	  }
	  
	  @GetMapping("/lage")
	  public String findLAge(@Param("age") int age,Model model){
		  List<Employee> emp = service.findBylessage(age);
		  model.addAttribute("listemp", emp);
		  return "home.html";
	  }
	  
	  @GetMapping("/oage")
	  public String findorderage(@Param("age") int age,Model model) {
		  List<Employee> emp = service.findByOrderDesc(age);
		  model.addAttribute("listemp", emp);
		  return "home.html";
	  }
	 
	  @GetMapping("/salage")
	  public String findsalage(@Param("sal,age") int sal ,int age,Model model) {
		  List<Employee> emp = service.findBySalAndAge(sal, age);
		  model.addAttribute("listemp", emp);
		  return "home.html";
	  }
	  
	  @GetMapping("/bet")
	  public String findbetsal(@Param("sal,sal2") int sal,int sal2,Model model) {
		  List<Employee> emp = service.findbetsal(sal, sal2);
		  model.addAttribute("listemp", emp);
		  return "home.html";
	  }
	  
	  @RequestMapping("/save")
	  public String saveEmp(Employee employee,@PathVariable(value="email") String email) {
		 service.saves(employee,email);  
		  return "home.html";
	  }
	  
	  @GetMapping("/email/{email}")
	  public String femail(@PathVariable("email") String email,Model model) {
		  Employee emp = service.findByEmail(email);
		  model.addAttribute("listemp", emp);
		  return "home.html";
	  }
	  
	  @GetMapping("/emp/{eid}")
	  public String getEmployeeById(@PathVariable("eid") int eid,Model model){
		  Employee emp = service.getEmployeeById(eid);
		  model.addAttribute("listemp", emp);
		  return "home.html";
	  }
	  
	  @GetMapping("/emps/{sal}")
	  public String getEmployeeBysal(@PathVariable("sal") int sal,Model model){
		  Employee emp = service.getEmployeeBySal(sal);
		  model.addAttribute("listemp", emp);
		  return "home.html"; 
	  }
	  
	  @RequestMapping("/welcome")
	  public String welcome(Model model) {
		  model.addAttribute("msg", "Hello World Spring Boot");
		  String s = null;
		  s.length();
		  return "home.html";
	  }
	  
	  @RequestMapping("/welcome1")
	  public String welcome1(Model model) {
		  Employee emp =new Employee();
		emp.getEmail().length();
		  return "home.html";
	  }
}
