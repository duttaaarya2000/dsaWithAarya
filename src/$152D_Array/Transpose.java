package $152D_Array;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=2;
		int col=3;
		int arr[][]= {{2,3,7},{5,6,7}};
		System.out.println("Original matrix");
		printmatrix(arr);
		int transpose[][]=new int[col][row];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				transpose[j][i]=arr[i][j];
			}
		}
		System.out.println("Transpose matrix");
		printmatrix(transpose);

	}

	private static void printmatrix(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
