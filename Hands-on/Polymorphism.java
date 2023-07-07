package oops;

class Polymorphism {

	public int product(int a,int b)
	{
		return a*b;
	}
	public int product(int a, int b, int c)
	{
		return a*b*c;
	}
	public double product(double a, double b)
	{
		return a*b;
	}
	
}
class PolymorphismMain
{
	public static void main(String[] args)
	{
		
		Polymorphism p = new Polymorphism();
		
		System.out.println("The product is "+  p.product(5, 8));
		System.out.println("The product is "+ p.product(4, 10, 5));
		System.out.println("The product is "+ p.product(10.00,5.50));
	}
}
