package $12Patterns_Part2_Advanced;

import java.util.Scanner;

public class InvertedHalfPyramidNumbers {
	public static void invertedHalfPyramidNumbers(int n) {
		for(int i=1;i<=n;i++)
		{
			//inner-numbers
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		invertedHalfPyramidNumbers(n);

	}

}
