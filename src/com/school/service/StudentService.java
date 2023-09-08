package com.school.service;

import com.school.dao.StudentDao;
import com.school.dto.Student;

public class StudentService {

	StudentDao studentDao = new StudentDao();
	
		public Student saveStudent(Student student) {
			Student s = studentDao.saveStudent(student);
			return s;
		}
		
		public boolean deleteStudentById(int id) {
			return studentDao.deleteStudentById(id);
		}

		public Student updateStudentById(Student student) {
			return studentDao.updateStudentById(student);
		}		
	
		public Student getStudentById(Student student) {
			return studentDao.getStudentById(student);
		}
		
		public Student getAllStudentById(Student student) {
			return studentDao.getAllStudentById(student);
		}
}
