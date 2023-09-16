package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentGetController {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(2);
		
		
		StudentService studentService = new StudentService();
				
		studentService.getStudentById(student);
						
	}

}
