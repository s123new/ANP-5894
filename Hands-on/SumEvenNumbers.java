package loops;
import java.util.Scanner;
/*
  Write a program that prompts the user to enter a series of integers.
  The program should calculate the sum of all the even numbers entered,
  skipping any negative numbers. Use the continue statement to skip negative numbers.
 */
import java.util.*;

public class SumEvenNumbers 
{

	public static void main(String[] args) 
	{
		// input from the user
		Scanner sc = new Scanner (System.in);
		
		// Get the number of iterations from the user
		System.out.println(" Enter a count of integers : ");
		
		int count = sc.nextInt();
		
		//declaring integer sum
		int sum = 0;
		
		for ( int i =1; i<= count ; i++)
		{
			System.out.println(" Enter num"+ i + " : ");
			
			int number = sc.nextInt();
			
			if ( number %2 == 0)
			{
				sum += number;
			}
			if ( number < 0)
			{
				// Skip this iteration and continue to the next one
				continue ;
			}
			System.out.println(" The sum of entered integer series is : "+ sum );
			
		}
		//System.out.println(" The sum of entered integer series is : "+ sum );
		
		sc.close();
		
	}

}
