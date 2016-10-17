//Tail Recurision

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		int num1, num2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		num1 = input.nextInt();
		
		System.out.print("Enter number 2: ");
		num2 = input.nextInt();
		
		System.out.println("GCD: " + gcd(num1, num2));
	}
	
	public static int gcd(int n1, int n2) {
		if (n1 % n2 == 0)
			return n2;
		else
			return gcd(n2, n1 % n2);
	}
}
