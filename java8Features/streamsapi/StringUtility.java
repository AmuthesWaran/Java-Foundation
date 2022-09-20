package java8Features.streamsapi;

public class StringUtility {
			
	private String message;

	public StringUtility(String message) {
		System.out.println("Message Received");
		System.out.println("Using Constructor");
	}
	
	public void printMessage(String message)
	{
		
		System.out.println("message received: "+message);
		System.out.println("Using non static method");
		
	}
	
	public static void diplayMessage(String message)
	{
		
		System.out.println("message received: "+message);
		System.out.println("Using static method");
		
	}
	
	
	public static boolean isBigMessage(String message)
				{
					System.out.println("Message Received: "+message);
					System.out.println("Using Static Method");
					return message.length()>5;
				}
	
	
			
			
			
		
	
}
