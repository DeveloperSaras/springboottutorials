package com.sks.service;

import java.util.List;

import com.sks.model.Student;


public interface StudentServiceI {
	
	public boolean add(Student student);
	
	public List<Student> listStudent();

}
