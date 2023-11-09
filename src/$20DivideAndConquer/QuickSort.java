package $20DivideAndConquer;

public class QuickSort {
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void quickSort(int arr[], int si, int ei) {
		// base case last element
		if (si >= ei) {
			return;
		}
		int pidx = partition(arr, si, ei);
		quickSort(arr, si, pidx-1);
		quickSort(arr, pidx+1, ei);
	}

	private static int partition(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int pivot=arr[ei];
		int i=si-1;
		for(int j=si;j<ei;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				//swap
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		i++;
		//to put the pivot in correct position
		int temp=pivot;
		arr[ei]=arr[i];
		arr[i]=temp;
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 7, 5, 3, 1, 4 };
		quickSort(arr, 0, arr.length - 1);
		printArray(arr);

	}

}
