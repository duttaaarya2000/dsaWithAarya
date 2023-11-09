package $8ConditionalStatement;

import java.util.Scanner;

public class Else_If {

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
		else if(age>=13)
		{
			System.out.println("Teenager");
		}
		else
		{
			System.out.println("Not Adult");
		}

	}

}
