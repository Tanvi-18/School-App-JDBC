package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentUpdateController {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(4);
		student.setName("MANISH");
		student.setEmail("manish@mail.com");
		
		
		StudentService studentService = new StudentService();
		Student s = studentService.updateStudentById(student);
		
		if(s!=null) {
			System.out.println(s.getId() + " Updated Successfully");
		}
		
	}

}
