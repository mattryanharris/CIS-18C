//bubbleSort
public class A {

	public static void main(String[] args) {
		int []myArray = {5, 90, 35, 45, 150, 3};
		System.out.println("Before Sorted: ");
		for(int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		
		bubbleSort(myArray);
		
		System.out.println("\n\nAfter Sorted: ");
		for(int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
	}
	
	private static void bubbleSort(int[] a) {
		int n = a.length;
		int temp = 0;
		int switchCount = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < (n - i); j++) {
				if(a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
					switchCount++;
				}
			}
		}
		System.out.print("\n\nSwitch Count: " + switchCount);
	}
}
