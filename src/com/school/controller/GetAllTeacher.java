package com.school.controller;

import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class GetAllTeacher {
	
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		
		TeacherService teacherService = new TeacherService();
		teacherService.getAllTeachers(teacher);
		
	}

}
