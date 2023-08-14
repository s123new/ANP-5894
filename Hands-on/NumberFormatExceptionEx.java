package ExceptionHandling;

import java.util.Scanner;

public class NumberFormatExceptionEx 
{
	public static void main(String[] args) 
	{	
		// Scanner for input from the user
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println(" Enter a number : ");			
			
			 int number = Integer.parseInt(sc.nextLine()); // This line can throw NumberFormatException
			 
			 System.out.println( " You entered: "+ number);
			 
		}
		catch(Exception e)
		{
			System.out.println( " Invalid input please enter a valid number.");
		}
		System.out.println( " Program continues...");
			
	}

}
