package ExceptionHandling;

import java.util.Scanner;

// Exception handling example for array index out of bounds.

public class ArrayIndexOutOfBoundsExceptionExample 
{
	public static void main(String[] args) 
	{		
		// Scanner class for the input from the user
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the size of the Array : ");
		
		// Input from the user
		int size = sc.nextInt();
		int[] array = new int[size];
		
		System.out.println(" Enter the elements of the array.");
		
		// for loop for input from the user for elements
		for ( int i = 0; i < size ; i++)
		{
			System.out.println(" Element "+i+" : " );
			
			array[i]= sc.nextInt();
		}
		
		System.out.println(" Enter an index retreive a element : ");
		int index = sc.nextInt();
		
		try
		{
			int element = array[index];
			//printing the required index value 
			System.out.println(" Error : The element at the index "+index+" is : "+ element);
			
		}
		catch(Exception e)
		{
			// Printing the exception statement
			System.out.println(" The entered index is out of the bounds! ");
		}
		sc.close();
	}

}
