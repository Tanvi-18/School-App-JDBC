package com.school.controller;

import java.util.ArrayList;

import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class UpdateMultipleTeachers {
	
	public static void main(String[] args) {
		
		TeacherService teacherService = new TeacherService();
		
		ArrayList<Teacher> al = new ArrayList<Teacher>();
		
		Teacher teacher1 = new Teacher();
		teacher1.setId(102);
		teacher1.setName("ghi");
		teacher1.setSubject("Physics");
		
		Teacher teacher2 = new Teacher();
		teacher2.setId(105);
		teacher2.setName("uvw");
		teacher2.setSubject("Chemistry");
		
		al.add(teacher1);
		al.add(teacher2);
		
		teacherService.updateMultipleTeachers(al);
		
		System.out.println("All Good");
		
		
	}

}
