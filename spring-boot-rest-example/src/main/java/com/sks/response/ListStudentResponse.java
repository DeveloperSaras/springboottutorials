package com.sks.response;

import java.util.List;

import com.sks.model.Student;

public class ListStudentResponse extends BaseResponse {

	
	private List<Student> students;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "ListStudentResponse [students=" + students + "]";
	}
	
	
	
}
