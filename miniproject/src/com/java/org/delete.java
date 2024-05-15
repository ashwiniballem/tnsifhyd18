package com.java.org;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class delete {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "A@25";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "DELETE FROM employee WHERE name=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "ashwin");
		     
		    int rowsDeleted = statement.executeUpdate();
		    if (rowsDeleted > 0) {
		        System.out.println("A user was deleted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}




