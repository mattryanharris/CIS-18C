import java.io.*;

public class E {

	public static void main(String[] args) {
		try {
			getFile("myFile.txt");
		}
		
		catch(IOException e) {
			System.out.print("Error: An IO error occured.");
		}
	}
	
	public static void getFile(String fileName) throws IOException, FileNotFoundException {
		FileInputStream file = new FileInputStream(fileName);
	}

}
