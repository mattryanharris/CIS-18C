//insertion sort
public class C {

	public static void main(String[] args) {
		int []myArray = {5, 90, 35, 45, 150, 3, 12, 28, 50, 61, 82, 59, 54};
		System.out.println("Before Sorted: ");
		for(int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		
		insertionSort(myArray);
		
		System.out.println("\n\nAfter Sorted: ");
		for(int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
	}
	
	private static void insertionSort(int[] a) {
		
		int switchCount = 0;
		int n = a.length;
		int temp;
		
		for(int i = 1; i < n; i++) {
			for(int j = i; j > 0; j--) {
				if(a[j] < a[j - 1]) {
					temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
					switchCount++;
				}
			}
		}
		
		
		
		System.out.print("\n\nSwitch Count: " + switchCount);
	}
}
