package exceptionHandling;

import java.util.Scanner;

public class ArrayIndexOutofBounce {

	static String [] result = { "Arun", "Ajay", "Ishan", "Bala" };
	
	public static String[] getRecords() {
		return result;
	}
	
	public static String getARecord(int index) 
	{
		String recordRetrieved = "";
		
		try {
			recordRetrieved = result[index];
			System.out.println("Receord retrieved Successfully ");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Requested record not found...");
		}
		
		return recordRetrieved;
	}
	
	public static void main(String[] args) {
			
				Scanner s = new Scanner(System.in);
				System.out.println("Input the index of the record you want to visit :");
				
				int index = s.nextInt();
				 String record = getARecord(index);
				 
	}

}
