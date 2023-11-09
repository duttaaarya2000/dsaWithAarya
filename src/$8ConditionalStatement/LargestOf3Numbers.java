package $8ConditionalStatement;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b=sc.nextInt();
		System.out.println("Enter 3rd Number");
		int c=sc.nextInt();
		sc.close();
		//if the first condition is false it doesnot check the second condition
		if((a>=b)&&(a>=c))
		{
			System.out.println(a+" is largest");
		}
		else if(b>=c)
		{
			System.out.println(b+" is largest");
		}
		else
		{
			System.out.println(c+" is largest");
		}

	}

}
