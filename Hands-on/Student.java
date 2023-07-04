package oops;
// code for Encapsulation example for student details
class Student {
    
	private String name;
	private int rollnumber;
    private int age;
    private String address;
    
    
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollnumber() {
		return rollnumber;
	}
	
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
        
	}

class StudentMain
{
 public static void main(String[] args)
	{ 
	Student s=new Student ();
	
	s.setName("Shivam");
	s.setAge(22);
	s.setRollnumber(3);
	s.setAddress("Rabale Navi Mumbai.");
	
	System.out.println("Student name:"+ s.getName());
	System.out.println("Student age:"+ s.getAge());
	System.out.println("Student Roll Number:" + s.getRollnumber());
	System.out.println("Student Address:"+ s.getAddress());
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	