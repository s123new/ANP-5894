package loops;

import java.util.Scanner;

/*
  Prompt the user to enter a numerical grade (0-100).
Use a switch case statement to determine the corresponding letter grade based on the following scale:
90-100: A
80-89: B
70-79: C
60-69: D
0-59: F
Display the letter grade to the user.
Handle input validation to ensure the grade is within the valid range.
 */

public class GradeCalculator 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter numerical Grade (0-100) : ");
		
		int grade = sc.nextInt();

		char LetterGrade;
		
		if ( grade > 0 || grade < 100) 
		{
		
			switch(grade/10) {
			case 10:
			case 9:
				LetterGrade = 'A';
				//break is used to jump out of the loop
				break ;
				
				
			case 8:
				LetterGrade = 'B';
				//break is used to jump out of the loop
				break ;
				
				
			case 7:
				LetterGrade = 'C';
				//break is used to jump out of the loop
				break ;
				
			case 6:
				LetterGrade = 'D';
				//break is used to jump out of the loop
				break ;
				
			default:
				LetterGrade = 'F';
				//break is used to jump out of the loop
				break ;
				
			}
			System.out.println(" The Letter Grade is : "+ LetterGrade);
			
	        } else 
	           {
		      System.out.println(" Enter a valid grade between 0-100");
	           }
		sc.close();
	}
}
