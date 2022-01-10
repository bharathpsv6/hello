package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

		
	 List<Employee> findByEnameContainingIgnoreCaseOrderByEnameDesc(String keyword); 
	 List<Employee> findByAgeGreaterThan(int age); 
	 List<Employee> findByAgeLessThan(int age); 
	 List<Employee> findByAgeOrderByEnameDesc(int age);
	 List<Employee> findBySalAndAge(int sal,int age);
	 List<Employee> findBySalBetween(int sal,int sal2);
	 Employee findByEmail(String email);
	 Employee findBySal(int sal);

} 
