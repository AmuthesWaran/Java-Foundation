package exceptionHandlingUncheckedException;

public class HandlingMultipleException {

		public static void multipleOperation(String message)
			{
				Integer[] numsArr = { 21, 0, 23, 32 };
				
				
				try {
				
					System.out.println(numsArr[3]);
					System.out.println(message.length());
					System.out.println(numsArr[3] / numsArr[1] );
					
				} catch (ArrayIndexOutOfBoundsException e) {
				
					System.out.println(e.getMessage());
						
				}
				
				
				 catch (NullPointerException e) {
					
					System.out.println(e.getMessage());
				}
				
				
				 catch (ArithmeticException e) {
					
					System.out.println(e.getMessage());
					
				}
				
				finally {
					System.out.println("Finally Excecuted");
				}
				
			}
	
	
	public static void main(String[] args) {
		
		
		multipleOperation("hi");
				
		
		
		

	}

}
