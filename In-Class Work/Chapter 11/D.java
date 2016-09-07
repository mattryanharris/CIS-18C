import java.io.*;

public class D {

	public static void main(String[] args) {
		getFile("MyFile.txt");
	}
	
	public static void getFile(String FileName) {
		try {
			FileInputStream file = new FileInputStream(FileName);
		}
		
		// Specific Exception
		
		catch(FileNotFoundException e) {
			System.out.println("Error: File not found");
		}
		
		// Default Exception
		
		catch(Exception e) {
			System.out.println("Error: an error occured");
		}
		
		finally {
			System.out.println("Do this...");
		}
	}

}
