package fileHandling_streambased_input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFromAFileusingascii {
	public static void main(String[] args) {
		String path = "C:\\Users\\amuth\\Downloads\\test.txt";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
			System.out.println("File opened and reading");

			int ascii=0;
//			-1 means end of file
			while((ascii = fis.read())!=-1)
			{
			System.out.print((char)ascii);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
		
		finally {
			
			try {
				fis.close();
				System.out.println("\nClosed the file...");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	}

}
