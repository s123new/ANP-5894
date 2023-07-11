package loops;

import java.util.Scanner;

class Leapyear {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		System.out.println(" Enter a year : ");
		
		int a = l.nextInt();
		
		if ( a%4==0 && a%100==0 && a%400==0 )
		{
			System.out.println("It is a Leap Year");
		}
		else {
			System.out.println("Not a Leap year");
		}
	

	}

}
