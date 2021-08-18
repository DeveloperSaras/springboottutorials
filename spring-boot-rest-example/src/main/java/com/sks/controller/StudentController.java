package com.sks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sks.model.Student;
import com.sks.response.AddStudentResponse;
import com.sks.response.ListStudentResponse;
import com.sks.service.StudentServiceI;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	@Autowired
	StudentServiceI service;
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/add", consumes = "application/xml", produces = "application/xml")
	@ResponseBody
	public AddStudentResponse addStudent(@RequestBody Student student) {
		
		service.add(student);
		
		AddStudentResponse response = new AddStudentResponse();
		response.setResponseStatus("100");
		response.setResponseMessage("Request processed successfully.");
		response.setStudent(student);
		
		return response;
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/list")
	@ResponseBody
	public ListStudentResponse listStudent() {
		
		List<Student> studentList = service.listStudent();
		
		ListStudentResponse response = new ListStudentResponse();
		response.setResponseStatus("100");
		response.setResponseMessage("Request processed successfully.");
		response.setStudents(studentList);
		
		return response;
	}

}
