package $8ConditionalStatement;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=sc.nextInt();
		sc.close();
		if(age>=18)
		{
			System.out.println("Adult");
		}
		if(age>=13)
		{
			System.out.println("Teenager");
		}
		else
		{
			System.out.println("Not Adult");
		}

	}

}
