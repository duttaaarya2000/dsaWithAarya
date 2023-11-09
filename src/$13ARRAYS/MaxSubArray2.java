package $13ARRAYS;

//Kadane's Algorithm
public class MaxSubArray2 {
	public static void kadane(int num[]) {
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			currentSum+=num[i];
			maxSum=Math.max(maxSum, currentSum);
			if(currentSum<0)
			{
				currentSum=0;
			}
			
		}
		System.out.println("Max subarray sum="+maxSum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int num[] = { -2, -3, -4, -11, -2, -11, -5, -3 };
		kadane(num);

	}

}
