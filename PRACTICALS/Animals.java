package oops;
// Example of single level inheritance
// base class or parent class or super class

class Animal {
	
	// Fields and methods 

	String name;
	public void eat()
	{
		System.out.println("Animal Eat ......");
	}
	

}
// Inherit from Animal
class Dog extends Animal
{
	// Fields and methods of Animal class 
	// Fields and methods of Dog class
	
	public void sound()
	{
		System.out.println("Dog Barks ......");
	}
}
// Inherit from Dog class
class Puppy extends Dog
{
	// Fields and methods of Animal Class
	// Fields and methods of Dog class
	// Fields and methods of Puppy class
	public void colour()
	{
		System.out.println("Black and White ......");
	}
}
class AnimalMain
{
	public static void main(String[] args)
	{
		// Creating a object of sub class
		
		Puppy d= new Puppy();
		
		d.name="Moti";
		{
			System.out.println("The name of the dog is "+ d.name+".");
		}
		d.eat();
		d.sound();
		d.colour();
	}
}