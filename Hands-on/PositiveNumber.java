package Operator;

import java.util.Scanner;

//Write a Java program that takes an integer as user input and checks if it is a positive number.

public class PositiveNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter a Integer : ");
		
		int integer = sc.nextInt();
		
		boolean isPositive = integer >0;
		
		if ( integer >0)
		{
			System.out.println(" Positive number .");
		}
		else
		{
			System.out.println(" Negative number .");
		}
	}

}
