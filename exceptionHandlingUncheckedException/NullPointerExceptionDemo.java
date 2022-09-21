package exceptionHandlingUncheckedException;

public class NullPointerExceptionDemo {

	public static void displayLength( String message )
	{
	
//		try {
				System.out.println("message length :" + message.length());
//			}
//		catch(NullPointerException npe)
//			{
//				System.out.println(npe.getMessage());
//			}
		
	}
	
	public static void main(String[] args) {
		
		try {
	displayLength(null);	
			}
		catch(NullPointerException npe)
			{
				System.out.println(npe.getMessage());
			}
		
		
		
		
		
		
		
	}

}
