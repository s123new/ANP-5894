package String;

import java.util.Scanner;

public class ReverseString 
{
    public static void main(String[] args) 
    {
    	// Scanner class for the input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversed = reverseString(input);
        
        System.out.println("Reversed string: " + reversed);
        
        scanner.close();
    }
    
    public static String reverseString(String str) 
    {
        StringBuffer reversed = new StringBuffer(str).reverse();
        return reversed.toString();
    }
}
