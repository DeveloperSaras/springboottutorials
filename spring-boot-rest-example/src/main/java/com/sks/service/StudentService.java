package com.sks.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sks.model.Student;


@Service
public class StudentService implements StudentServiceI {
	
	private static List<Student> students = new ArrayList<Student>();

	@Override
	public boolean add(Student student) {
		
		students.add(student);
		
		return true;
	}

	@Override
	public List<Student> listStudent() {
		
		return students;
	}

}
