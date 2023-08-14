package ExceptionHandling;

import java.util.Scanner;

public class CustomExceptionExample 
{
    public static void main(String[] args) 
    {
 	Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int userInput = sc.nextInt();

            if (userInput < 0) {
                //throw new NegativeInputException("Negative input is not allowed.");
            	System.out.println(" Negative input is not allowed. ");
            }

            System.out.println("You entered: " + userInput);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } //catch (Exception e) {
            //System.out.println("An error occurred: " + e.getMessage());
       // } 
    finally {
            sc.close();
         }
       }
    }