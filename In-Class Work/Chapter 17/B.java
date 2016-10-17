//selection
public class B {

	public static void main(String[] args) {
		int []myArray = {5, 90, 35, 45, 150, 3};
		System.out.println("Before Sorted: ");
		for(int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		
		selectionSort(myArray);
		
		System.out.println("\n\nAfter Sorted: ");
		for(int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
	}
	
	private static void selectionSort(int[] a) {
		
		int switchCount = 0;
		int n = a.length;
		
		for(int i = 0; i < n - 1; i++) {
			int index = i;
			for(int j = i + 1; j < n; j++) {
				if(a[j] < a[index]) {
					index = j;
				}
			}
			int smallNumber = a[index];
			a[index] = a[i];
			a[i] = smallNumber;
			switchCount++;
		}
		
		
		System.out.print("\n\nSwitch Count: " + switchCount);
	}
}
