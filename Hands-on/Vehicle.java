package oops;

//Create a class called Vehicle with attributes brand and year.
//Implement a method displayInfo() in the Vehicle class that prints the brand and year of the vehicle.
//Create a child class Car that inherits from Vehicle and adds an attribute model.
//Create another child class SportsCar that inherits from Car and adds an attribute topSpeed.
//Override the displayInfo() method in the SportsCar class to display the brand, model, year,
//and top speed of the sports car.


class Vehicle {
  String brand;
  int year;
	public void displayinfo()  
	  {
System.out.println("BMW");
System.out.println("2020");
  }
}

class Car extends Vehicle
{
	String model;
	{
		System.out.println("BMW Z9");
	}
}
class SportsCar extends Car
{
	int attributespeed;
	{
		System.out.println("250");
	}
}

class VehicleMain
{
	public static void main(String[] args)
	{
		SportsCar s =new SportsCar();
			
		s.brand= "BMW.";
		s.year=(2020);
		s.model=(" BMW Z9.");
		s.attributespeed =(250);
		System.out.println("The Brand name is "+ s.brand);	
		System.out.println("Year is "+ s.year);
		System.out.println("Model of car is "+ s.model);
		System.out.println("The Attribute speed is "+ s.attributespeed);
	}
}