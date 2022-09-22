package exceptionHandlingUncheckedException;

import java.io.IOException;

import exceptionHandlingCheckedException.StudentNotFoundException;

public class CustomExceptionHandling {

	public static void findARecord(int sid) throws StudentNotFoundException {
		
		//code to connect to the db and read a particular record from it.
		if (sid > 50) {
			throw new StudentNotFoundException("Student not found");
		}
	}
	
	public static void insertARecord(int sid, String sName, String location) throws StudentAlreadyExistException{
		//code to check if data is available
		if (sid==100) {
			throw new StudentAlreadyExistException("Student already exists, cant insert again");
		}
	}
	
	public static void main(String[] args) {
		
		
		try {
			findARecord(51);
			System.out.println("Record Found");
			
			insertARecord(100, "Dinesh", "Chennai");
			System.out.println("Record inserted succesfully");
		}
		catch (StudentNotFoundException | StudentAlreadyExistException e  ) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	

}
