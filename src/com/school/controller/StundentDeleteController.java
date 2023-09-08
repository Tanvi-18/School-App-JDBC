package com.school.controller;

import com.school.service.StudentService;

public class StundentDeleteController {
	
	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		
		boolean res = studentService.deleteStudentById(3);
		System.out.println(res);
		
		
	}

}
