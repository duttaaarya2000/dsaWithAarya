package $13ARRAYS;

//Prefix Sum method
public class MaxSubArray1 {
	public static void maxSubarraySum(int num[]) {
		int prefixsum[] = new int[num.length];
		int sum;
		prefixsum[0] = num[0];
		int maxSum = Integer.MIN_VALUE;
		for (int i = 1; i < prefixsum.length; i++) {
			prefixsum[i] = num[i] + prefixsum[i - 1];
		}
//		for (int i = 1; i < prefixsum.length; i++) {
//			System.out.println(prefixsum[i]);		}
		for (int i = 0; i < num.length; i++) {
			int start = i;
			sum=0;
			for (int j = 0; j < num.length; j++) {
				int end = j;
				sum = start == 0 ? prefixsum[end] : prefixsum[end] - prefixsum[start - 1];
				//System.out.println(sum);
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
		}
		System.out.println("MaxSubArraySum=" + maxSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num[] = { 1, -2, 6, -1, 3 };
		int num[] = { 2, 4, 6, 8, 10 };
		maxSubarraySum(num);

	}

}
