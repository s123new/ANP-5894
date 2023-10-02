package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySecondJdbcDemo 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");  // Step 1
	 	
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");      // Step 2 
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from employee " );
		
		int id, salary;
		
		String name,designation;
		
		System.out.println(" Employee details .");
		
		System.out.println(" =================== ");
		
		while (rs.next())
		{
			id= rs.getInt(1);
			name = rs.getString(2);
			salary = rs.getInt(3);
		    designation = rs.getString(4);
		    
		    System.out.println( id + " . "+ "name of the employee is "+ name + " and his salary is "+ salary + " with the desigbation " + designation );
			
		}

	}

}
