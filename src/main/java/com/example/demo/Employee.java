package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	public Employee() {}
	@Id
	private int eid;
	private String ename;
	private String email;
	private int sal;
	private int age;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", sal=" + sal + ", age=" + age + "]";
	}
	
	public Employee(int eid, String ename, String email, int sal, int age) {
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.sal = sal;
		this.age = age;
	}

}
