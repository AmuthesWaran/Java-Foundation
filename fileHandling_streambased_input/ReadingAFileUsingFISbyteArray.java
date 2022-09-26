package fileHandling_streambased_input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingAFileUsingFISbyteArray {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		String path = "C:\\Users\\amuth\\Downloads\\test.txt";
		
		try {
			fis = new FileInputStream(path);
			System.out.println("File opened and reading");
			byte b[] = new byte[fis.available()];
			fis.read(b);
			
			System.out.println(new String(b));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				fis.close();
				System.out.println("file closed successfully");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
