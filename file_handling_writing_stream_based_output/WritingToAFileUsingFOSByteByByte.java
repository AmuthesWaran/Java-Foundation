package file_handling_writing_stream_based_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WritingToAFileUsingFOSByteByByte {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		String path = "C:\\Users\\amuth\\Downloads\\test.txt";
		Scanner s = new Scanner(System.in);
		String message;
		
		try {
			fos = new FileOutputStream(path, true);
			System.out.println("Input a string message");
			message = s.nextLine();
			fos.write('\n');
			fos.write(message.getBytes());
			
		} catch (IOException e) {
			
			System.out.println("File not found");
		}
		
		finally {
			try {
				fos.close();
				System.out.println("file closed successfully");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
