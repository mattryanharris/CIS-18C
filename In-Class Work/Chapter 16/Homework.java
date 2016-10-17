import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		String word;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		boolean check;
		
		System.out.print("What is your word: ");
		word = scan.nextLine();
		
		check = palCheck(word, count);
		
		System.out.println("It is " + check);
		
	}
	
	public static boolean palCheck(String w, int i) {
		if(w.charAt(i) == w.charAt((w.length() - 1 - i)) && (i <= (w.length() - 1) - i))   {
			i++;
			palCheck(w, i);
			return true;
		}
		
		else 
			return false;
	}

}
