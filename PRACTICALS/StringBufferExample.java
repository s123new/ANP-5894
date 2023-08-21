package String;

// A String Buffer example

public class StringBufferExample 
{
	public static void main(String[] args) 
	{		
		StringBuffer s = new StringBuffer();
		
		// Appending a String
		s.append("King Kohli");
		
		// Replacing the value
		s.replace(0, 4, "Run Machine");
		
		// Inserting a String
		s.insert(0, "Captain ");
		
		// Deleting the String from a specific value
		s.delete(0, 19);
		
		// Reversing the available String
		s.reverse();
		
		// Inserting a String
		s.insert(6, " retsam ");
		
		// Reversing a String
		s.reverse();
		
		// Printing Statement for the updated String
		System.out.println(s.toString());

	}

}
