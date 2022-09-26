package file_handling_writing_stream_based_output;


import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WritingToAFIleBufferOutputStream {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\amuth\\Downloads\\test.txt";
		BufferedOutputStream bos = null;
		Scanner s = new Scanner(System.in);
		String message;
		
		try {
			bos = new BufferedOutputStream(new FileOutputStream(path, true));
			System.out.println("Input a string message");
			message = s.nextLine();
			
			bos.write('\n');
			for(int i=0; i<message.length(); i++) {
				bos.write((int)message.charAt(i));
			}
			
		} catch (IOException e) {
			System.out.println("File not found...");
			e.printStackTrace();
		}
		finally {
			try {
				bos.close();
				System.out.println("File closed...");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

		
		
		
	}

}
