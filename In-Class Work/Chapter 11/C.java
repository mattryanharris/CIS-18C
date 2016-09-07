import java.util.InputMismatchException;
import java.util.Scanner;

public class C {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("How old are you? ");
		int age = getAge();
		
		if (age != 0) {
			System.out.println("You are " + age + " years old.");
		}
		
		else {
			System.out.print("Zero is not acceptable");
		}
	
	}
	
	public static int getAge() {
		try {
			return scan.nextInt();
		}
		
		catch (InputMismatchException e) {
			scan.next();
			System.out.println("Invalid Data...");
			
			return 0;
		}
	}

}
