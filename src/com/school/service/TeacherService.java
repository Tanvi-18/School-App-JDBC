package com.school.service;

import java.util.List;

import com.school.dao.TeacherDao;
import com.school.dto.Teacher;

public class TeacherService {
	
	TeacherDao teacherDao = new TeacherDao();
	
	public void saveMultipleTeachers(List<Teacher> teachers) {
		teacherDao.saveMultipleTeachers(teachers);
	}
	
	public void deleteMultipleTeachers(List<Teacher> teachers) {
		teacherDao.deleteMultipleTeachers(teachers);
	}
	
	public void updateMultipleTeachers(List<Teacher> teachers) {
		teacherDao.updateMultipleTeachers(teachers);
	}

	public Teacher getTeacherById(Teacher teacher) {
		return teacherDao.getTeacherById(teacher);
	}

	public Teacher getAllTeachers(Teacher teacher) {
		return teacherDao.getAllTeachers(teacher);
	}

	

}
