package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertData {

	public static void main(String[] args) throws SQLException {
	  
		try {
			//String sql="insert into employee(id ,emp_name,emp_city,emp_sal) "
					//+ "values(3,'raj','Pune','100')";
			
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/sample","root","root");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//  Statement stmt=connection.createStatement();
				
		//	stmt.execute(sql);
			PreparedStatement stmt = con.prepareStatement
					("insert into employee(emp_name,emp_city,emp_sal)values(?,?,?)");
			
		
			stmt.setString(1, "shravan" ); 
			stmt.setString(2, "mumbai");
			stmt.setString(3, "2100");
			
			
			


			
			int i=stmt.executeUpdate(); 
			System.out.println("Record is inserted."+i);
			System.out.println(" Insertion Sucessfully...");
				
			con.close();
			stmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		//System.out.println(e);

	}

	}
}
