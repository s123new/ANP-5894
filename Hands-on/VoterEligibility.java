package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.*;

public class VoterEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age <= 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }

            if (age >= 18) {
                System.out.println("You are eligible to vote!");
            } else {
                System.out.println("You are not eligible to vote.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number for age.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}