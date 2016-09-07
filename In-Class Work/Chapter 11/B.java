
import java.util.Scanner;

public class B {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			int number1;
			int number2;
			int answer;
			
			System.out.print("Number 1: ");
			number1 = scan.nextInt();
			
			System.out.print("Number 2: ");
			number2 = scan.nextInt();
			
			answer = number1 / number2;
			
			System.out.println(answer);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Error: division by zero is not possible.");
			System.out.println("Error: " + e.getMessage());
			System.out.println("Error: " + e.toString());
			e.printStackTrace();
		}

	}
	
	

}
