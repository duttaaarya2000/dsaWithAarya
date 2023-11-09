package $20DivideAndConquer;

public class MergeSort {
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void mergeSort(int arr[],int si,int ei) {
		//base
		if(si>=ei)
		{
			return;
		}
		//kaam
		int mid=si+(ei-si)/2;//(si+ei)/2
		mergeSort(arr, si, mid);
		mergeSort(arr,mid+1,ei);
		merge(arr,si,mid,ei);
	}

	private static void merge(int[] arr, int si, int mid, int ei) {
		// TODO Auto-generated method stub
		int temp[]=new int[ei-si+1];
		int i=si;//Iterator for left part
		int j=mid+1;//Iterator for right part
		int k=0;//Iterator for temp array
		while(i<=mid && j<=ei) {
			if(arr[i]<arr[j])
			{
				temp[k]=arr[i];
				i++;
			}
			else
			{
				temp[k]=arr[j];
				j++;
			}
			k++;
		}
		//for left over element of 1st sorted array
		while(i<=mid)
		{
			temp[k]=arr[i];
			i++;
			k++;
		}
		//for left over element of 2nd sorted array
		while(j<=ei)
		{
			temp[k]=arr[j];
			j++;
			k++;
		}
		//copy temp to original array
		for(k=0,i=si;k<temp.length;k++,i++) {
			arr[i]=temp[k];
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,7,5,3,1,4};
		mergeSort(arr, 0,arr.length-1);
		printArray(arr);

	}

}
