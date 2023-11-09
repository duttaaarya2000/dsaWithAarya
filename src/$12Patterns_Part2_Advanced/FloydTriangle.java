package $12Patterns_Part2_Advanced;

import java.util.Scanner;

public class FloydTriangle {
	public static void FloydTriangle(int n)
	{
		//outer
		int counter=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(counter++ +" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		FloydTriangle(n);

	}

}
