
public class A {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};
		
		for(int i = 0; i <= numbers.length; i++) {
			try {
				System.out.println(numbers[i]);
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Out of bounds...");
			}
		}
	}

}
