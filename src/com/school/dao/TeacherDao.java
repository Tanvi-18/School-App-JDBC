package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.school.configuartion.HelperClass;
import com.school.dto.Teacher;


public class TeacherDao {
	
	HelperClass helperClass = new HelperClass();
	Connection connection = null;
		
	// to save teacher data
	public void saveMultipleTeachers(List<Teacher> teachers) {
		
		connection = helperClass.getConnection();
		
		String sql = "INSERT INTO teacher VALUES(?,?,?)";
		
		PreparedStatement preparedstatement = null;
		
		for(Teacher t : teachers) {				
			try {
				// create statement
				preparedstatement = connection.prepareStatement(sql);
				
				preparedstatement.setInt(1, t.getId());
				preparedstatement.setString(2, t.getName());
				preparedstatement.setString(3, t.getSubject());
				
				//execute
				preparedstatement.addBatch();
				preparedstatement.executeBatch();
				
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		try {
			connection.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

	}
			
				
	
	//  to delete teacher data
	public void deleteMultipleTeachers(List<Teacher> teachers) {
		
		connection = helperClass.getConnection();
		
		String sql = "DELETE FROM teacher WHERE ID=?";
		
		PreparedStatement preparedstatement = null;
		
		for(Teacher t : teachers) {
			
			try {

				preparedstatement = connection.prepareStatement(sql);
				
				preparedstatement.setInt(1, t.getId());
				
				preparedstatement.addBatch();
				preparedstatement.executeBatch();
			
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		try {
			connection.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
					
			
	// to update a teacher data
	public void updateMultipleTeachers(List<Teacher> teachers) {
		
		connection = helperClass.getConnection();
		
		String sql = "UPDATE teacher SET name=?, subject=? WHERE ID =?";
		
		PreparedStatement preparedstatement = null;
		
		for(Teacher t : teachers) {	
			
			try {
				// create statement
				preparedstatement = connection.prepareStatement(sql);
				
				preparedstatement.setString(1, t.getName());
				preparedstatement.setString(2, t.getSubject());
				preparedstatement.setInt(3, t.getId());
				
				//execute
				preparedstatement.addBatch();
				preparedstatement.executeBatch();
				
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		try {
			connection.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	// to get data of a student
	public Teacher getTeacherById(Teacher teacher) {
		
		connection = helperClass.getConnection();

		String sql = "SELECT * FROM teacher WHERE ID = ?";
		
	
			try {
				
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setInt(1,  teacher.getId());
				
				ResultSet resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					System.out.print(resultSet.getInt(1)+" "+"| ");
					System.out.print(resultSet.getString(2)+" "+"| ");
					System.out.println(resultSet.getString(3)+" "+"| ");
					System.out.println("===========================");
				}		
				
				
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		return teacher;
			
	}
	
	
	// to get all the records from the student table
	public Teacher getAllTeachers(Teacher teacher) {
		
		connection = helperClass.getConnection();

		String sql = "SELECT * FROM teacher";
		
	
			try {
				
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				
				ResultSet resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					System.out.print(resultSet.getInt(1)+" "+"| ");
					System.out.print(resultSet.getString(2)+" "+"| ");
					System.out.println(resultSet.getString(3)+" "+"| ");
					System.out.println("===========================");
				}		
								
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
					System.out.println("All Good");
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		return teacher;
			
	}

}
