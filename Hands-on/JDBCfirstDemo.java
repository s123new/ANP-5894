package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCfirstDemo {

	public static void main() throws ClassNotFoundException, SQLException
	{
		//Step : Register the driver class 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step : Create the connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		//Step 3 :Create the statement object
		Statement stmt = con.createStatement();
		
		//Step 4 : execute statement
		int a = stmt.executeUpdate("insert into employee values ( 1, 'Shivam' , 'employee' , 216511 ");
		
		System.out.println(" Successfully added the employee . " + a);
		
		// Step 5 : Close Data base resources
		
		con.close();
		
	} 
}
   