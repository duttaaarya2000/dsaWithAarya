package $152D_Array;

public class SortedMatrixSearch {

	private static boolean staircasesearch(int matrix[][], int key) {
		// TODO Auto-generated method stub
		// TC O(n+m)
		int row = 0;
		int col = matrix[0].length - 1;
		while (row < matrix.length && col >= 0) {
			if (key == matrix[row][col]) {
				System.out.println("Key found at index:(" + row + "," + col + ")");
				return true;
			} else if (key < matrix[row][col]) {
				col--;
			} else {
				row++;
			}

		}
		System.out.println("Key Not found!");
		return false;

	}

	private static boolean binarysearch(int matrix[][], int key) {
		// TODO Auto-generated method stub
		// TC O(nlogN)
		for (int i = 0; i < matrix.length; i++) {
			int start = 0;
			int end = matrix[0].length - 1;
			while (start <= end) {
				int mid = (start + end) / 2;
				if (matrix[i][mid] == key) {
					System.out.println("Key found at index:(" + i + "," + mid + ")");
					return true;
				}
				if (matrix[i][mid] < key) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		System.out.println("Key Not found!");
		return false;

	}

	private static boolean bruteforce(int matrix[][], int key) {
		// TODO Auto-generated method stub
		// TC O(N^2)
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (key == matrix[i][j]) {
					System.out.println("Key found at index:(" + i + "," + j + ")");
					return true;
				}
			}
		}
		System.out.println("Key Not found!");
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
		int key = 33;
		bruteforce(matrix, key);
		binarysearch(matrix, key);
		staircasesearch(matrix, key);
	}

}
