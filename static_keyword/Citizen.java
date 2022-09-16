package static_keyword;

public class Citizen {
			
		// Non static variables
	int citizenId;
	String citizenName;
	int age;
		
		//Static variables
	static String nationality;

	static 
		{
			nationality = "Indian";
			System.out.println("Static Block of Citizen Class");
			System.out.println();
		}
	
	
		public Citizen(int citizenId, String citizenName, int age) {
			super();
			this.citizenId = citizenId;
			this.citizenName = citizenName;
			this.age = age;
			System.out.println("Constructor");
			
			
		}
		
		
	 void displayDetails() {
		System.out.println(citizenId);
		System.out.println(citizenName);
		System.out.println(age);
		System.out.println(nationality);
	}
	 
	 
	 static void wishTheCountry() 
	 	{
		 	System.out.println("I Love India");
	 	}
	 
	
//  static methods we can access only static variables 
//	static void displayDetails() {
//		System.out.println(citizenId);
//		System.out.println(citizenName);
//		System.out.println(age);
//		System.out.println(nationality);
//	}
	
			
	
}
