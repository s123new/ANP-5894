package loops;

// Simple if else program
import java.util.*;
class Ifelse {

	public static void main(String[] args) {
		{
			// Scanner class to take input from the user
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a value ");
			
			// integer input from the user
			int a = s.nextInt();
			
			//condition
			if (a>=18)
			{
				System.out.println(" Eligible for voting.");
			}
			else {
				System.out.println(" Not eligible for voting.");
			}
		}

	}

}
