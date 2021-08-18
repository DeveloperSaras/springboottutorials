package com.sks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.sks.model.Student;
import com.sks.response.AddStudentResponse;
import com.sks.response.ListStudentResponse;

@SpringBootTest
public class StudentControllerTest {
	
	
	@Autowired
	private RestTemplate restTemplate;	
	
	private String serviceUrl = "http://localhost:8082/student/list";
	
	private String postUrl = "http://localhost:8082/student/add";
	
	@Test
	public void consumeService() {
		
		ListStudentResponse result = restTemplate.getForObject(serviceUrl, ListStudentResponse.class);
		System.out.println("Result of the service is " + result);
		
		Assertions.assertNotNull(result);
		
	}
	
	@Test
	public void consumePostEndPoint() {
		
		Student student = new Student();
		
		student.setId(100);
		student.setName("Joe");
		student.setSurName("Root");
		
		ResponseEntity<AddStudentResponse> response = restTemplate.postForEntity(postUrl, student, AddStudentResponse.class);
		
		Assertions.assertEquals(200, response.getStatusCodeValue());
		
		Assertions.assertEquals("Joe", response.getBody().getStudent().getName());
		
		System.out.println("Add student Post Response is : " + response.getBody());
		
		
		
		
		
	}
	
	
	
	
	

}
