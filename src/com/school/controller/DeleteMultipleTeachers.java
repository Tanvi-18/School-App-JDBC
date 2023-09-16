package com.school.controller;

import java.util.ArrayList;

import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class DeleteMultipleTeachers {
	
	public static void main(String[] args) {
		
		TeacherService teacherService = new TeacherService();
		
		ArrayList<Teacher> al = new ArrayList<Teacher>();
		
		Teacher teacher1 = new Teacher();
		teacher1.setId(101);
		
		Teacher teacher2 = new Teacher();
		teacher2.setId(103);
				
		al.add(teacher2);
		al.add(teacher1);
		
		teacherService.deleteMultipleTeachers(al);
		System.out.println("All Good");
		
		
	}

}
