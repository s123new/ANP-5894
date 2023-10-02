package com.jdbc.demo;

/*create crude operation for students details accepting the  input from user for confirming the operations
1.enter the student details, 
2.Retrieve the students details,
3.delete the students details, 
4.edit the students details.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//Creating a class with a name StudentDB
public class StudentDB 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        // Step 1: Load the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver"); 

        // Step 2: Establish a database connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "root");

        // Step 3: Create a Statement
        Statement stmt = connection.createStatement();

        //Scanner class to take input from user
        Scanner sc = new Scanner(System.in);
        
        //Integer input for variable choice
        int choice;

        do 
        {
            // Display menu for CRUD operations
            System.out.println("Student CRUD Operations:");
            System.out.println("1. Create");
            System.out.println("2. Retrive");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            // Consume newline
            sc.nextLine(); 

            // Use a switch statement to perform different actions based on the user's choice
            switch (choice) 
            {
                case 1:
                    // Create operation: Add a new student record to the database
                    System.out.print("Enter student first name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter student last name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter student age: ");
                    int age = sc.nextInt();
                    // Consume newline
                    sc.nextLine(); 
                    System.out.print("Enter student grade: ");
                    String grade = sc.nextLine();

                    // SQL query to insert a new student record
                    String createSql = "INSERT INTO Students (first_name, last_name, age, grade) VALUES (?, ?, ?, ?)";
                   
                    // Creating a PreparedStatement object for executing the SQL query
                    try (PreparedStatement createStatement = connection.prepareStatement(createSql)) 
                    {
                        createStatement.setString(1, firstName);
                        createStatement.setString(2, lastName);
                        createStatement.setInt(3, age);
                        createStatement.setString(4, grade);
                        int rowsAffected = createStatement.executeUpdate();
                       
                        // Check if any rows were affected (record added successfully) and provide appropriate feedback.
                        if (rowsAffected > 0) 
                        {
                            System.out.println("Student added successfully.");
                        } else 
                        {
                            System.out.println("Failed to add student.");
                        }
                    }
                    //jump out of the loop
                    break;

                case 2:
                    // Read operation: Retrieve and display student records from the database
                    String readSql = "SELECT * FROM Students";
                    
                    // Creating a Statement object for executing the SQL query.
                    try (Statement readStatement = connection.createStatement()) 
                    {
                        ResultSet resultSet = readStatement.executeQuery(readSql);
                        
                        // While Loop through the ResultSet to extract and display student information.
                        while (resultSet.next()) 
                        {
                            int studentId = resultSet.getInt("student_id");
                            String studentFirstName = resultSet.getString("first_name");
                            String studentLastName = resultSet.getString("last_name");
                            int studentAge = resultSet.getInt("age");
                            String studentGrade = resultSet.getString("grade");
                            // Display the extracted student information
                            System.out.println(
                                    "ID: " + studentId + ", Name: " + studentFirstName + " " + studentLastName + ", Age: " + studentAge + ", Grade: " + studentGrade);
                        }
                    }
                    break;

                case 3:
                	// Update operation
                	// Prompt for student ID and update choice
                    System.out.print("Enter student ID to update: ");
                    int studentIdToUpdate = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter new grade: ");
                    String newGrade = sc.nextLine();

                    String updateSql = "UPDATE Students SET grade = ? WHERE student_id = ?";
                    try (PreparedStatement updateStatement = connection.prepareStatement(updateSql)) 
                    {
                        updateStatement.setString(1, newGrade);
                        updateStatement.setInt(2, studentIdToUpdate);
                        int rowsAffected = updateStatement.executeUpdate();
                        if (rowsAffected > 0) 
                        {
                            System.out.println("Student updated successfully.");
                        } else 
                        {
                            System.out.println("Student not found or update failed.");
                        }
                    }
                    break;
                    
                   

                case 4:
                    // Delete operation: Remove a student record from the database
                    System.out.print("Enter student ID to delete: ");
                    int studentIdToDelete = sc.nextInt();

                    // SQL query to delete a student record
                    String deleteSql = "DELETE FROM Students WHERE student_id = ?";
                    try (PreparedStatement deleteStatement = connection.prepareStatement(deleteSql)) 
                    {
                        deleteStatement.setInt(1, studentIdToDelete);
                        int rowsAffected1 = deleteStatement.executeUpdate();
                        if (rowsAffected1 > 0) 
                        {
                            System.out.println("Student deleted successfully.");
                        } else 
                        {
                            System.out.println("Student not found or delete failed.");
                        }
                    }
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting program, Thank Yoy.");
                    break;

                default:
                	//handles any invalid user input.
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        // This loop continues as long as the user's choice (operation) is not equal to 5.
        while (choice != 5);

        // Close resources and connections
        sc.close();
        stmt.close();
        connection.close();
    }
}