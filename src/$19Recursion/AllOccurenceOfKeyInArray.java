package $19Recursion;

public class AllOccurenceOfKeyInArray {
	public static void findkey(int arr[], int index, int key) {
		// base
		if (index > arr.length - 1) {
			return;
		}
		// kaam
		if (arr[index] == key) {
			System.out.println(index);
		}
		findkey(arr, index + 1, key);
	}

	public static void main(String args[]) {
		int arr[] = { 1, 3, 2, 3, 6, 7, 5, 3 };
		int key = 3;
		findkey(arr, 0, key);

	}

}
