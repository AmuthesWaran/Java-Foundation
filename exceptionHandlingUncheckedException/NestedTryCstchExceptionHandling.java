package exceptionHandlingUncheckedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

public class NestedTryCstchExceptionHandling {
	
	public static void openfile() {
		FileInputStream fis = null;
		String filePath1 = "";
		String filePath2 = "";
	
	
	try {
		fis = new FileInputStream(filePath1);
		System.out.println("File 1 is availble and opened");
	}
	
	catch(FileNotFoundException e) {
		System.out.println("File 1 not found.. Trying to open file 2");
		
		try {
			fis = new FileInputStream(filePath2);
			System.out.println("File 2 is availble and opened");
		}
		
		catch(FileNotFoundException f){
			System.out.println("File 2 is not avaiable");
		}
		finally {
			try {
				fis.close();
				System.out.println("file 2 has been closed..");
			}
			catch(IOException g){
				System.out.println(g.getMessage() );
			}
			
			
		}
	
	}
	
		
	
	

	}	
	
	public static void main(String[] args) {
		
		openfile();
				
		
	}

}
