package $152D_Array;
//Diagonal sum in square matrix
public class DiagonalSum {
	// O(N^2)
	public static void diagonalsum1(int matrix[][]) {
		int sum=0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				//left diagonal sum
				if(i==j)
				{
					sum+=matrix[i][j];
				}
				//right diagonal sum
				else if(i+j==matrix.length-1)
				{
					sum+=matrix[i][j];
				}
			}
		}
		System.out.println("Diagonal sum using brute force method="+sum);
	}

	// O(N)
	public static void diagonalsum2(int matrix[][]) {
		int sum=0;
		for(int i=0;i<matrix.length;i++)
		{
			//left diagonal sum
			sum+=matrix[i][i];
			//right diagonal sum
			if(i!=matrix.length-1-i)
			{
				sum+=matrix[i][matrix.length-1-i];
			}
		}
		System.out.println("Diagonal sum using optimised method="+sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		diagonalsum1(matrix);
		diagonalsum2(matrix);
	}

}
