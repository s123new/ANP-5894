package oops;

// Example of Encapsulation

class Encapsulation {

	private String name;
	private int age;
	
	//  get name method 
	 public String getName() {
		return name;
	}
    // setting name method
	public void setName(String name) {
		this.name = name;
	}
    //get age method
	public int getAge() {
		return age;
	}
    //set age method
	public void setAge(int age) {
		this.age = age;
	}
}
class Main
{ 
	public static void main (String[] args)
{
	
	// Creating instance of class encapsulation
	Encapsulation e=new Encapsulation();
	
	// Setting the values 
	e.setName("Shivam");
	e.setAge(22);
	
	//Getting i.e. printing the values
	System.out.println(" My name is " + e.getName()+".");
	
	System.out.println(" My age is " + e.getAge()+".");
}
}