package $19Recursion;
//TC->O(n)
//SC->O(n)
public class ArrayLastOccurence {
	public static int lastOccurence(int arr[],int key,int i)
	{
		if(i==arr.length-1)
		{
			return -1;
		}
		int isfound=lastOccurence(arr, key, i+1);
		if(arr[i]==key && isfound==-1)
		{
			return i;
		}
		return isfound;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 7, 3, 5, 1, 2, 5, 4 };
		System.out.println("Last occurence of 5 is index:" + lastOccurence(arr1, 5, 0));
		//returning index:-1 because it is unable to find it and reached the end of the array
		System.out.println("Last occurence of 9 is index:" + lastOccurence(arr1, 9, 0));

	}

}
