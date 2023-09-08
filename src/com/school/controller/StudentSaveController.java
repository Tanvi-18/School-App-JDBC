package com.school.controller;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentSaveController {
	
	public static void main(String[] args) {
			
			Student student = new Student();
			student.setId(5);
			student.setName("XYZ");
			student.setEmail("xyz@mail.com");
			
			StudentService studentService = new StudentService();
			Student s = studentService.saveStudent(student);
			
			if(s!=null) {
				System.out.println(s.getId() + " Saved Successfully");
			}
					
	}

}


