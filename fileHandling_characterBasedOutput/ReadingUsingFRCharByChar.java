package fileHandling_characterBasedOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingUsingFRCharByChar {

	public static void main(String[] args) {

		String path = "C:\\Users\\amuth\\Downloads\\test.txt";
		FileReader fr = null;
		
		try {
			fr = new FileReader(path);
			int ascii;
			
			while((ascii = fr.read())!=-1) {
				System.out.print((char)ascii);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());		
		}
		
		finally {
			try {
				fr.close();
				System.out.println("\nFile Closed File");
			} catch (IOException e) {
				System.out.println("Unable to close the file");
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
