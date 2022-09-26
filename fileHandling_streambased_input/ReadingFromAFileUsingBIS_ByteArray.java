package fileHandling_streambased_input;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class ReadingFromAFileUsingBIS_ByteArray {

	public static void main(String[] args) {

		String path = "C:\\Users\\amuth\\Downloads\\test.txt";
		BufferedInputStream bis = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(path));
			System.out.println("File opened and reading");
			byte b[] = new byte[bis.available()];
			
			bis.read(b);
			
			System.out.println(new String(b));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
			bis.close();
			System.out.println("file closed successfully");
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		
	}

}
