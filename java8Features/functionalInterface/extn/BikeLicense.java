package java8Features.functionalInterface.extn;

public interface BikeLicense {
		
		void visitRtoOffice();
		
		default void applyForLLR() 
		{
				System.out.println("Applied LLR");
		}
		
}
