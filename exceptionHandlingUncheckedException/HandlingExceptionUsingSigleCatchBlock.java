package exceptionHandlingUncheckedException;

public class HandlingExceptionUsingSigleCatchBlock {

	public static void multipleOperation(String message)
	{
		Integer[] numsArr = { 21, 0, 23, 32 };
		
		
		try {
		
			System.out.println(numsArr[3]);
			System.out.println(message.length());
			System.out.println(numsArr[3] / numsArr[1] );
			
		} catch (ArrayIndexOutOfBoundsException | NullPointerException | ArrayStoreException  e) {
		
			
			System.out.println(e.getMessage());
				
		}
		
		
	}


public static void main(String[] args) {


multipleOperation("hi");
		




}

	
	
}
