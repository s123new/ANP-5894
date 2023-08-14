package ExceptionHandling;

import java.util.Scanner;

// Exception handling example for divide by zero

public class DivideByZeroExample {

	public static void main(String[] args) {
		
		//Scanner class for the input from the user
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter a numerator : ");
		
		// input from the user
		int a = sc.nextInt();
		
		System.out.println(" Enter a denominator : ");
		
		// input b from the user
		int b = sc.nextInt();
		
		// try for the exception
		try
		{
			int result = a / b;
			System.out.println(" Reult : " + result );
		}
		// catch for the exception
		catch(Exception e)
		{
			System.out.println(" The Exception is :"+ e.getMessage());
		}
		sc.close();

	}

}
