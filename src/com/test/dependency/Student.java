package com.test.dependency;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	//primitive
	private int rollno;
	private String name;
	//non-primitive
	private List<String> booklist;
	private Set<Long> phno;
	private Map<String,Double> courses; //name,price
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getBooklist() {
		return booklist;
	}
	public void setBooklist(List<String> booklist) {
		this.booklist = booklist;
	}
	public Set<Long> getPhno() {
		return phno;
	}
	public void setPhno(Set<Long> phno) {
		this.phno = phno;
	}
	public Map<String, Double> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, Double> courses) {
		this.courses = courses;
	}
	
}
