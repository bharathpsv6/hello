package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmpService {

	
	  @Autowired private 
	  EmployeeRepo repo;
	  
	  public List<Employee> findall(){
		 return repo.findAll();
	  }
	  
	  public List<Employee> findByname(String keyword){ 
	  return repo.findByEnameContainingIgnoreCaseOrderByEnameDesc(keyword); 
	  }
	  
	 public List<Employee> findBygreaterage(int age){
		 return repo.findByAgeGreaterThan(age);
	 }

	 public List<Employee> findBylessage(int age){
		 return repo.findByAgeLessThan(age);
	 }
	 
	 public List<Employee> findByOrderDesc(int age){
		 return repo.findByAgeOrderByEnameDesc(age);
	 }
	 
	 public List<Employee> findBySalAndAge(int sal,int age){
		 return repo.findBySalAndAge(sal, age);
	 }
	 
	 public List<Employee> findbetsal(int sal,int sal2){
		 return repo.findBySalBetween(sal, sal2);
	 }
	 
	 public void saves(Employee employee, String emails) {
		 employee = new Employee(10,"sam",emails,15000,23);
		 if(emails.equals(employee.getEmail())) {
			 throw new RuntimeException("Already record is exits");
		 }else {
		 repo.save(employee);
		 }
	 }
	 
	 public Employee findByEmail(String email) {
		return repo.findByEmail(email);
	 }
	 
	 public Employee getEmployeeById(int eid) {
		 return repo.findById(eid).get();
	 }
	 
	 public Employee getEmployeeBySal(int sal) {
		 return repo.findBySal(sal);
	 }
}
