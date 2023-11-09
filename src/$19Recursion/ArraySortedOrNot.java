package $19Recursion;

public class ArraySortedOrNot {
	public static boolean isSorted(int arr[], int i) {
		if(i==arr.length-1)
		{
			return true;
		}
		if(arr[i]>arr[i+1])
		{
			return false;
		}
		return isSorted(arr,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 3, 4, 9, 6 };
		System.out.println("Array is sorted: " + isSorted(arr1, 0));
		int arr2[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Array is sorted: " + isSorted(arr2, 0));

	}

}
