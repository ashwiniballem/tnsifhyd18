package com.java.org;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "A@25";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "INSERT INTO employee (id,name,age,salary) VALUES (?, ?, ?, ?)";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "5");
		    statement.setString(2, "money");
		    statement.setString(3, "25");
		    statement.setString(4, "60000");
		     
		    int rowsInserted = statement.executeUpdate();
		    if (rowsInserted > 0) {
		        System.out.println("A new user was inserted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}
}
