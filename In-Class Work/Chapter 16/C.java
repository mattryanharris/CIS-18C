import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		int disks;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number of Disks: ");
		disks = input.nextInt();
		
		towers(disks, 'A', 'B', 'C');
	}
	
	public static void towers(int top, char from, char inter, char to) {
		if(top == 1) 
			System.out.println("Disk 1 from " + from + " to " + to);
		else {
			towers(top - 1, from, to, inter);
			System.out.println("Disk " + top + " from " + from + " to " + to);
			
			towers(top - 1, inter, from, to);
;		}
	}

}
