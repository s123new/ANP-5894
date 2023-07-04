package oops;

// Encapsulation 2nd Example for cricketer with more objects

class Cricketer {

	private String name;
	private int age;
	private String team;
	private int networth;
	private int worldranking;
	private String bestshot;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getNetworth() {
		return networth;
	}
	public void setNetworth(int networth) {
		this.networth = networth;
	}
	public int getWorldranking() {
		return worldranking;
	}
	public void setWorldranking(int worldranking) {
		this.worldranking = worldranking;
	}
	public String getBestshot() {
		return bestshot;
	}
	public void setBestshot(String bestshot) {
		this.bestshot = bestshot;
	}
}
class cricketerMain
{
	public static void main(String[] args)
	{
	Cricketer c= new Cricketer();
	c.setName("Virat Kohli");	
	c.setAge(34);
	c.setTeam("India and RCB");
	c.setBestshot("Cover Drive");
	c.setNetworth(1065);
	c.setWorldranking(3);
	
	System.out.println("Cricketer Name : " + c.getName() );
	System.out.println("Age : " + c.getAge());
	System.out.println("Plays for teams : " + c.getTeam());
	System.out.println("Best shot : " + c.getBestshot());
	System.out.println("Net Worth : " + c.getNetworth()+ " crore rs.");
	System.out.println("World Ranking : " + c.getWorldranking());
	
	}
}
