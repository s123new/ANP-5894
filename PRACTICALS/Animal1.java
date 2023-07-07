package oops;

abstract class Animal1 {
	
	public abstract void sound();
	

public void sleep()
{
	System.out.println("Animal Sleeps...");
}
}
class Monkey extends Animal1
{
	public void sound()
	{
		System.out.println("Monkey sounds as a Human....");
	}
}
class Animal1Main
{
	public static void main (String[] args)
	{
		Monkey m = new Monkey();
		m.sound();
		m.sleep();
	}
}