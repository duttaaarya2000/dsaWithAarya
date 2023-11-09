package $152D_Array;

public class Frequency_of_7 {

	private static int frequency(int[][] arr, int key) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (key == arr[i][j]) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String args[]) {
		int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
		System.out.println("Frequency of 7 in 2D array is:" + frequency(arr, 7));
	}

}
