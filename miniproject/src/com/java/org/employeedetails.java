package com.java.org;
import java.sql.*;

public class employeedetails {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "A@25";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    if (conn != null) {
		        System.out.println("Connected to the database");
		        conn.close();
		    }
		} catch (SQLException ex) {
			ex.printStackTrace();
		    		

		}
	} 


	}


