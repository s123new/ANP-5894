package oops;

//Create a class called Shape with a method calculateArea() 
//that prints "Calculating area of the shape." Create a child class 
//Rectangle that inherits from Shape and overrides the calculateArea() 
//method to calculate and print the area of a rectangle

 class Shape 
 {
	 public void CalculateArea()
	 {
		 System.out.println("Calculating area of the shape.");
	 }
 }

 class Rectangle extends Shape{
	 
 
 
	 public void ClaculateRArea()
	 {
		 System.out.println("Calculate the area of the Reactangle.");
	 }
 } 
 
 class ShapeMain
 {
	 public static void main (String[] args)
	 {
		 Rectangle r = new Rectangle();
		 r.ClaculateRArea();
	
	 }
 }
