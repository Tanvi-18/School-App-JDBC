package com.school.controller;

import java.util.ArrayList;

import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class SaveMultipleTeachers {
	
	public static void main(String[] args) {
		
		TeacherService teacherService = new TeacherService();
		
		ArrayList<Teacher> al = new ArrayList<Teacher>();
		
		Teacher teacher1 = new Teacher();
		teacher1.setId(101);
		teacher1.setName("abc");
		teacher1.setSubject("Physics");
		
		Teacher teacher2 = new Teacher();
		teacher2.setId(102);
		teacher2.setName("pqr");
		teacher2.setSubject("Chemistry");
		
		Teacher teacher3 = new Teacher();
		teacher3.setId(103);
		teacher3.setName("lmn");
		teacher3.setSubject("Maths");
		
		Teacher teacher4 = new Teacher();
		teacher4.setId(104);
		teacher4.setName("xyz");
		teacher4.setSubject("Biology");
		
		Teacher teacher5 = new Teacher();
		teacher5.setId(105);
		teacher5.setName("uvw");
		teacher5.setSubject("CS");
						
		al.add(teacher5);
		al.add(teacher4);
		al.add(teacher3);
		al.add(teacher2);
		al.add(teacher1);
		
		teacherService.saveMultipleTeachers(al);
		System.out.println("All Good");
		
		
	}

}
