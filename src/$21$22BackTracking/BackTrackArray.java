package $21$22BackTracking;

public class BackTrackArray {
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void changeArr(int arr[],int i,int val)
	{
		//base case
		if(i==arr.length) {
			System.out.println("Printing in base case");
			printArray(arr);
			return;
		}
		//recursion
		arr[i]=val;
		changeArr(arr,i+1,val+1);//function call step
		arr[i]=arr[i]-2;//back tracking step
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		changeArr(arr, 0, 1);
		System.out.println("Printing in main method");
		printArray(arr);

	}

}
