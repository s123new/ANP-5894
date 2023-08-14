package ExceptionHandling;

import java.util.Scanner;

/*
  Write a program that takes an integer input from the user 
  and throws this custom exception if the input is negative. 
  Catch the exception and display an error message accordingly.
*/

public class CustomException 
{	
	public static void main(String[] args) 
	{
		// Scanner for the input from the user
		Scanner sc = new Scanner (System.in);
		
		
		try
		{
			// Scanner class for the input from the user
			System.out.println(" Enter an Integer : ");
			
			// Input from the user
			int number = sc.nextInt();
			
			if ( number < 0)
			{
				System.out.println(" You entered a negative number , negative number is not allowed.");
			}
			System.out.println("You entered: " + number);
		}
		catch(Exception e)
		{
			System.out.println(" Its a positive number " + e.getMessage());
		}
		finally
		{
			sc.close();
		}

	}

}
