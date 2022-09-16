package java8Features.functionalInterface.extn;

public interface CarLicence {
	void visitRtoOffice();
	
	 	default void applyForLLR() 
				{
	 				System.out.println("Applied LLR");
				}
}
