package loops;

import java.util.Scanner;

public class SwitchCaseExample 
{

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" Enter a day (1-7) : ");
		
		int day = sc.nextInt();
		
		String dayname;

	
	switch(day)
	{
	case 1:
		dayname="Monday";
		//break is used to jump out of the loop
		break;
		
	case 2:
		dayname="Tuesday";
		//break is used to jump out of the loop
		break;
		
	case 3:
		dayname="Wednesday";
		//break is used to jump out of the loop
		break;
		
	case 4:
		dayname="Thursday";
		//break is used to jump out of the loop
		break;
		
	case 5:
		dayname="Friday";
		//break is used to jump out of the loop
		break;
		
	case 6:
		dayname="Saturday";
		//break is used to jump out of the loop
		break;
		
	case 7:
		dayname="Sunday";
		//break is used to jump out of the loop
		break;
		
	default:
		dayname="Invalid day";
		//break is used to jump out of the loop
		break;
		
	}
	
	 System.out.println(" The day is : "+ dayname);	

   sc.close();
   }

}
