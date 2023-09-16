package com.school.controller;

import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class GetTeacherById {
	
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		teacher.setId(104);

		
		TeacherService teacherService = new TeacherService();
		teacherService.getTeacherById(teacher);
							
	}

}
