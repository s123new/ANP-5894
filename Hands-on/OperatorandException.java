package ExceptionHandling;

import java.util.*;

/*
   Hands-on:Write a program that takes two numbers and
   an operator (+, -, *, /) from the user. Perform the 
   corresponding arithmetic operation and display the result. 
   Handle exceptions for invalid operators and division by zero.
*/

public class OperatorandException 
{
	public static void main(String[] args) 
	{
		//Scanner for the input from the user
		Scanner sc = new Scanner (System.in);
		
		// printing statement for the input
		System.out.println(" Enter first number : ");
		
		Double num1 = sc.nextDouble();
		
		System.out.println(" Enter a operator( + - * / ) : ");
		
		// input for operator to be used
	    char operator =  sc.next().charAt(0);
		
        System.out.println(" Enter second number : ");
		
        // input for the second number
        Double num2 = sc.nextDouble();
		
        try    // try block to catch the exception
        {
        Double sum = num1 + num2;
        Double product = num1 * num2;
        Double substraction = num1 - num2;
        Double division = num1 / num2;
		
		if(operator == '+')
		{		
			System.out.println(" The sum is : "+ sum);
		}
		else if (operator == '*')
		{
			System.out.println(" The product is : "+ product);
		}
		else if (operator == '-')
		{
			System.out.println(" The substraction is : "+ substraction);
		}
		else if (operator == '/')
		{

			if (num2 == 0)
			{
				System.out.println(" Error num2 cannot be zero for division. Enter a valid number ");
			}
			else
			{		
				System.out.println(" The division is : "+ division);
			}
		}
		else
		{
			System.out.println(" Operator entered is invalid, enter a valid input. ");
		}
        }
        catch(Exception e)
        {
        	System.out.println(" Invalid input : Enter a valid number and a operator. "+ e.getMessage());
        }
		sc.close();
	}
	
}
