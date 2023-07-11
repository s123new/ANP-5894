package loops;
import java.util.*;

class Divisible {

	public static void main(String[] args) {
	
		Scanner d = new Scanner(System.in);
		
		System.out.println(" Enter a number : ");
		
		int a = d.nextInt();
		
		if (a%5==0 && a%11==0)
		{
			System.out.println("Divisible.");
		}
		else {
			System.out.println("Not Divisible.");
		}

		
	}

}
