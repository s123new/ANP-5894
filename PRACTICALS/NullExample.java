
package ExceptionHandling;

import java.util.Scanner;

public class NullExample
{
    public static void main(String[] args)
    {
    	// input from the user
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Enter input : ");
        
        String input = sc.nextLine();
    	
    	try
    	{
    		int length = input.length();   // This line will throw a NullPointerException
    		
    		System.out.println("Length of input: " + length);
    	}
    	catch(Exception e )
    	{
            System.out.println(" Error occured : "+ e.getMessage());
    	}
        
    	sc.close();
    	
    }
}