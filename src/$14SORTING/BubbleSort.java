package $14SORTING;

public class BubbleSort {
	public static void bubblesort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int swap=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap++;
				}
			}
			if(swap==0)
				break;
		}
	}
	public static void printarr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[])
	{
		int arr[]= {5,4,1,3,2};
		bubblesort(arr);
		printarr(arr);
	}

}
