package ExceptionHandling;

import java.util.*;
/*
 * Hands-on:Develop a program that takes a user's age as input 
 * and determines if they are eligible to vote (age >= 18). 
 * If the user enters non-numeric text or a negative number, 
 * catch the NumberFormatException and IllegalArgumentException 
 * respectively, displaying appropriate error messages.
*/

public class ExceptionHandson 
{
	public static void main(String[] args) 
	{
		// Scanner for the input from the user
	    Scanner sc = new Scanner (System.in);
	
	    System.out.println(" Enter your age : ");
	
	    // input from the user
	    int age = sc.nextInt();
	
	    try 
	    // try block to catch the exception
	     {
		   if(age>0)
		   {
		   if (age >= 18)
		   {
			System.out.println(" Eligible to vote . ");
		   }
		    else
		    {
			   System.out.println(" Not Eliglible to vote! ");
		    }
		    }
		    else
		    {
			  System.out.println(" Error : age cannot be negative. ");
		    }
	}
	catch(NumberFormatException e)
	{
		System.out.println(" Error occured . enter a valid number ");
	}
	catch(IllegalArgumentException e)
	{
		System.out.println(" Error occured. "+ e.getMessage());
	}

	}

}
