package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.cj.jdbc.JdbcPreparedStatement;
//import com.mysql.cj.jdbc.ServerPreparedStatement;
import com.school.configuartion.HelperClass;
import com.school.dto.Student;

public class StudentDao {
	
	HelperClass helperClass = new HelperClass();
	Connection connection = null;
		
	// to save a student data
	public Student saveStudent(Student student) {
		
		connection = helperClass.getConnection();
		
		String sql = "INSERT INTO student VALUES(?,?,?)";
		
		
		
			try {
				// create statement
				PreparedStatement preparedstatement = connection.prepareStatement(sql);
				
				//passed the values to delimiters/placeholder ---> ???
				preparedstatement.setInt(1, student.getId());
				preparedstatement.setString(2, student.getName());
				preparedstatement.setString(3, student.getEmail());
				
				//execute
				preparedstatement.execute();
				
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
			
		return student;
				
	}
	
	
	
	//  to delete a student data
	public boolean deleteStudentById(int id) {
		
		connection = helperClass.getConnection();
		
		String sql = "DELETE FROM student WHERE ID=?";
		
		int i=0;
		
		
			try {
				
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setInt(1, id);
				
				 i = preparedStatement.executeUpdate();
				
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
		
		if(id>0) {
			return true;
		}
		else {
			return false;
		}	
		
	}
	
	
	
	// to update a student data
	public Student updateStudentById(Student student) {
		
		connection = helperClass.getConnection();
		
		String sql = "UPDATE student SET name=? , email=? WHERE ID =?";
		
		
		
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
								
				preparedStatement.setString(1, student.getName());
				preparedStatement.setString(2, student.getEmail());
				preparedStatement.setInt(3, student.getId());
	
							
				int i =preparedStatement.executeUpdate();
				
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
		return student;
		
	}
	
	
	// to get data of a student
	public Student getStudentById(Student student) {
		
		connection = helperClass.getConnection();

		String sql = "SELECT * FROM student WHERE ID = ?";
		
	
			try {
				
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setInt(1,  student.getId());
				
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
			return student;
			
	}
	
	
	// to get all the records from the student table
	public Student getAllStudentById(Student student) {
		
		connection = helperClass.getConnection();

		String sql = "SELECT * FROM student";
		
	
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
			return student;
			
	}
	
	
	
	
		
}
