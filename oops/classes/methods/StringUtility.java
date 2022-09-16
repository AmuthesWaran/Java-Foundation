package oops.classes.methods;

public class StringUtility {

		public void sayHello() 
			{
				System.out.println("Hello World");
			}
	
		public String getName(String name) 
		{
			return name;
		}
		
		
		public String getName1() 
		{
			return "Dinesh Kumar";
		}
		
		
		public int getNameLen(String name)
			{
				return name.length();
			}
		
		public char get1stChar(String name)
			{
			 	return name.charAt(0); 
			}
		
		public String getFullName(String Fname, String Lname)
			{
			 return Fname + " " + Lname;
			}
		
		public String toUpperCase(String name)
			{
				return name.toUpperCase();
				
			}
		
		
		
}
