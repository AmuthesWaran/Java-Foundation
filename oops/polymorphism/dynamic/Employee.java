package oops.polymorphism.dynamic;

public class Employee {
		
	Employee(){
		this("");
		
		System.out.println("Default Constructor - Parent");
		
	}
	
	
	Employee(String msg){
		
		System.out.println("Parametric Constructor - Parent");
		
	}
	
	
	
	public void work()
				{
					System.out.println("Employee Works");
				}
	
	
	public void sal()
				{
					System.out.println("Employee Gets Paid");
				}
	
	
	
}
