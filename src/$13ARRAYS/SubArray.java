package $13ARRAYS;

public class SubArray {
	public static void printsubarray(int num[]) {
		int maxsum=Integer.MIN_VALUE;
		int totalSubarray=0;
		System.out.println("Subarrays are:");
		for(int i=0;i<num.length;i++)
		{
			int start=i;
			for(int j=i;j<num.length;j++)
			{
				int end=j,sum=0;
				for(int k=start;k<=end;k++)
				{
					System.out.print(num[k]+" ");
					sum=sum+num[k];
				}
				totalSubarray++;
				System.out.print(" sum="+sum);
				System.out.println();
				if(sum>maxsum)
					maxsum=sum;
			}
		}
		System.out.println("MaxSum="+maxsum);
		System.out.println("Total Subarray="+totalSubarray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 2, 4, 6, 8, 10 };
		printsubarray(num);

	}

}
