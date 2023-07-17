package loops;

import java.util.Scanner;

/*
 Prompt the user to enter a temperature in Celsius.
Provide a menu to choose the conversion type: Fahrenheit, Kelvin, or Rankine.
Use a switch case statement to perform the selected conversion and display the result.
Handle invalid conversion choices appropriately.
 */

public class TemperatureConversion 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter a temperature in celcius : ");
		
		int celcius = sc.nextInt();
		
		System.out.println(" Available conversions ");
		System.out.println(" 1.Fahrenheit");
		System.out.println(" 2.Kelvin");
		System.out.println(" 3.Rankine");
		System.out.println(" Enter a conversion number : ");
		
		int number = sc.nextInt();
		int fahrenheit;
		double  Kelvin;
		double Rankine;
		
		switch(number)
		{
		case 1:
			fahrenheit = celcius + 32 ;
			System.out.println(" The temperature in Fahrenheit is : "+ fahrenheit);
			//break is used to jump out of the loop
			break ;
			
		case 2:
			Kelvin = celcius + 273.15 ;
			System.out.println(" The temperature in Kelvin is : "+ Kelvin);
			//break is used to jump out of the loop
			break ;
			
		case 3:
			Rankine = (celcius * 9/5) + 491.67 ;
			System.out.println(" The temperature in Rankine is : "+ Rankine);
			//break is used to jump out of the loop
			break ;
			
			default :
				System.out.println(" Please enter a valid input.");
				//break is used to jump out of the loop
				break ;
		}

		sc.close();
	}

}
