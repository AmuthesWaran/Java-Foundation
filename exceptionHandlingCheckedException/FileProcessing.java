package exceptionHandlingCheckedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileProcessing {

	public static void main(String[] args) {
			
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\amuth\\Music\\text.txt");
			System.out.println("File Processing..");
			fis.read();
			System.out.println("Sucessfully read the file..");
			Thread.sleep(5000);
			System.out.println("The main thread woke up...");			
			
		} catch (FileNotFoundException e) {
			 System.out.println(e.getMessage());
		} catch( IOException e ) {
			 System.out.println(e.getMessage());
		} catch  ( InterruptedException ie ) {
			System.out.println(ie.getMessage());
		}
		
		finally {
			//
		}
		
			
		
		
	}

}
