package Operator;

/*Write a Java program that prompts the user to enter a three-digit number. 
 * The program should check if the number is a palindrome,
 *  which means it reads the same forwards and backwards.
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();

        // Check if the number is a three-digit number
        if (number >= 100 && number <= 999) {
            // Extract digits from the number
            int originalNumber = number;
            int reverse = 0;
            while (number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number /= 10;
            }

            // Check if the original number is equal to its reverse
            if (originalNumber == reverse) {
                System.out.println("The number is a palindrome.");
            } else {
                System.out.println("The number is not a palindrome.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid three-digit number.");
        }

        scanner.close();
    }
}