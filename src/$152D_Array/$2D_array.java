package $152D_Array;

import java.util.Scanner;

public class $2D_array {
	public static boolean search(int matrix[][], int key) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(key==matrix[i][j])
				{
					System.out.println(key+"is found at index ("+i+","+j+")");
					return true;
				}
			}
		}
		return false;
	}
	public static void minmax(int matrix[][])
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j]>max)
				{
					max=matrix[i][j];
				}
				if(matrix[i][j]<min)
				{
					min=matrix[i][j];
				}
			}
		}
		System.out.println("Maximum="+max);
		System.out.println("Minimum="+min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = new int[3][3];
		int n = matrix.length;
		int m = matrix[0].length;
		Scanner sc = new Scanner(System.in);
		// Entering elements in 2D array
		System.out.println("Enter elements of 2D array 3x3");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		// Printing elements in 2D array
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		//Searching element
		search(matrix, 5);
		
		//Finding max and min from 2D array
		minmax(matrix);
		sc.close();
	}

}
