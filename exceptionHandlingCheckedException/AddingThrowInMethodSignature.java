package exceptionHandlingCheckedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AddingThrowInMethodSignature {

	public static void openFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\Users\\amuth\\Music\\text.txt");
		System.out.println("File availble and Opened...");
	}
	
	public static void callOpenFile1() throws FileNotFoundException {
		openFile();
	}
	
	public static void callOpenFile2() throws FileNotFoundException {
		callOpenFile1();
	}
	
	


	
	
	public static void main(String[] args) {

		try {
			callOpenFile2();
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("Unable to open the file");
			
		}
	}
		
	

}
