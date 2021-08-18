package com.sks.response;

import com.sks.model.Student;

public class AddStudentResponse extends BaseResponse {

	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "AddStudentResponse [student=" + student + "]";
	}
	
	
	
	
}
