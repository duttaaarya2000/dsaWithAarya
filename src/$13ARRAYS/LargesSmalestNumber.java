  package $13ARRAYS;
//Time Complexity =O(N)
public class LargesSmalestNumber {
	public static int getLargest(int num[])
	{
		int largest=Integer.MIN_VALUE;//+infinity
		int smallest=Integer.MAX_VALUE;//-infinity
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>largest)
				largest=num[i];
			if(num[i]<smallest)
				smallest=num[i];
		}
		System.out.println("Smallest number is: "+smallest);
		return largest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,2,3,6,5};
		System.out.println("Largest number is: "+getLargest(num));
	}

}
