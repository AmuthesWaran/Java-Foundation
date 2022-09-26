package fileHandling_streambased_input;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFromFileUsingBIS_ByteByByte {

	public static void main(String[] args) {

		BufferedInputStream bis = null;
		String path = "C:\\Users\\amuth\\Downloads\\test.txt";
		
		try {
			int ascii;
			bis = new BufferedInputStream(new FileInputStream(path));
			
			while((ascii = bis.read())!=-1) {
				System.out.print((char)ascii);
			}
			bis.read();
			
			
		} catch (IOException e) {

			System.out.println(e.getMessage());
		}
		
		finally {
			try {
				bis.close();
				System.out.println("\nFile Closed Successfully");
			} catch (IOException e) {
				System.out.println("Unable to close the file");
			}
			
		}
	}

}
