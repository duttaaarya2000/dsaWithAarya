package $19Recursion;
//TC->O(n)
//SC->O(n)
public class Array1stOccurence {
	public static int firstOccurence(int arr[],int key,int i)
	{
		if(i==arr.length-1)
		{
			return -1;
		}
		if(arr[i]==key)
		{
			return i;
		}
		return firstOccurence(arr, key, i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 7, 3, 5, 1, 2, 7, 4 };
		System.out.println("First occurence of 5 is index:" + firstOccurence(arr1, 5, 0));
		//returning index:-1 because it is unable to find it and reached the end of the array
		System.out.println("First occurence of 9 is index:" + firstOccurence(arr1, 9, 0));

	}

}
