package $152D_Array;

public class RowSum {
	public static int rowsum(int nums[][]) {
		int sum = 0;
		for (int j = 0; j < nums[0].length; j++) {
			sum += nums[1][j];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
		System.out.println("Sum of row 1:" + rowsum(nums));
	}

}
