package $12Patterns_Part2_Advanced;

import java.util.Scanner;

public class InvertedRotatedHalfPyramid {
	public static void invertedRotatedHalfPyramid(int n)
	{
		//outer
		for(int i=1;i<=n;i++)
		{
			//spaces
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			//stars
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		invertedRotatedHalfPyramid(n);

	}

}
