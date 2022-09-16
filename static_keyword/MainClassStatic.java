package static_keyword;

public class MainClassStatic {

	static {
		System.out.println("Static block of Main Class");
	}
	
	
	public static void main(String[] args) {
			
			System.out.println();
			System.out.println("Main Method Executed");
		
			System.out.println();
			Citizen citizen1 = new Citizen(123, "Citizen 1", 23);
			System.out.println();
			Citizen citizen2 = new Citizen(124, "Citizen 2", 22);
			
			System.out.println();
			citizen1.displayDetails();
			System.out.println();
			citizen2.displayDetails();
			
			System.out.println();
			Citizen.wishTheCountry();
			
	}

}
