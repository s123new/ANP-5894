package loops;

import java.util.*;
class Nestedif {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int a = n.nextInt();
		
		if(a%2==0 && a%3==0) {
			System.out.println("Divisible by both.");
		 }
		else if (a%2==0) {
			System.out.println("Divisible by 2.");
		}
		else if(a%3==0) {
			System.out.println("Divisible by 3.");
		}
		else {
			System.out.println("Not divisible both");
		}
		
		}
		
	}


