package com.java.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class update {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "A@25";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "UPDATE employee SET id=?, name=?, age=? WHERE salary=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "1");
		    statement.setString(2, "ashwin");
		    statement.setString(3, "21");
		    statement.setString(4, "70000");
		     
		    int rowsUpdated = statement.executeUpdate();
		    if (rowsUpdated > 0) {
		        System.out.println("An existing user was updated successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	



}
