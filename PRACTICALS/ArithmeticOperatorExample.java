package Operator;

/*Program where user is prompted to enter two numbers, 
which are stored in the variables num1 and num2.
Then, we perform various arithmetic operations on these numbers, 
such as addition, subtraction, multiplication, division, and modulus.
*/

import java.util.Scanner;

public class ArithmeticOperatorExample 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter first number : ");
		// input for the 1st number
		int num1 = sc.nextInt();
		
		System.out.println(" Enter second number : ");
		// input for the 2nd number
		int num2 = sc.nextInt();
		
		//operations
		int sum = num1 + num2;
		int difference = num1 - num2;
		int Product = num1 * num2;
		int Quotient = num1 / num2;
		int remainder = num1 % num2;
		
		// printing operations values
		System.out.println(" The sum of both numbers is : " + sum);
		System.out.println(" The difference of both numbers is : " + difference);
		System.out.println(" The Product of both numbers is : " + Product);
		System.out.println(" The Quotient of both numbers is : " + Quotient);
		System.out.println(" The remainder of both numbers is : " + remainder);

		sc.close();
	}

}
