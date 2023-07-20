package Operator;

import java.util.Scanner;

/*Write a Java program that prompts the user to enter their age. 
The program should check if the age is between 18 and 30 (inclusive) 
and print "Eligible for Job" if true, or "Not Eligible for Job" otherwise.
*/
public class JobEligible 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter Your Age : ");
		
		// input from the user
		int age = sc.nextInt();
		
		// Check if the age is between 18 and 30 (inclusive)
		if (age >= 18 && age <= 30)
		{
		System.out.println(" Eligible for job. ");
		}
		else
		{
			System.out.println(" Not eligible for job.");
		}

		sc.close();
	}

}
