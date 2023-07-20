package Operator;

import java.util.Scanner;

/*
 * Write a Java program that prompts the user to enter their age.
 *  The program should check if the age is greater than or
equal to 18 and print "You are an adult" if true, or "You are a minor" otherwise.
 */
public class AdultMinor 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter your age : ");
		
		//input from the user
		int age = sc.nextInt();
		
		//comparison operator
		boolean adult = age >= 18;
		
		boolean minor = age < 18;
		
		if  ( age >= 18 )
		{
			System.out.println(" You are an adult. ");
		}
		
		else
		{
			System.out.println("You are an  minor . ");
		}
		sc.close();
	}

}
