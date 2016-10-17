import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		int number, factorial;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		number = input.nextInt();
		
		factorial = fact(number);
		System.out.println("Factorial: " + factorial);
	}

	static int fact(int n) {
		int output;
		
		if(n == 0) {
			return 1;
		}
		
		output = fact(n - 1) * n;
		return output;
	}
}
