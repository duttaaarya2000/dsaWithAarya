package $12Patterns_Part2_Advanced;

import java.util.Scanner;

public class HollowRectangle {
	public static void hollowRectangle(int row, int col) {
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i==1||i==row||j==1||j==col)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Rows");
		int row = sc.nextInt();
		System.out.println("Enter Total Columns");
		int col = sc.nextInt();
		hollowRectangle(row, col);

	}

}
