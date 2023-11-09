package $8ConditionalStatement;

import java.util.Scanner;

public class CalculatorSwitch{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner("System.in");
		System.out.println("Enter 1st Number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b=sc.nextInt();
		System.out.println("Enter operator +/-%*");
		char ch=sc.next().charAt(0);
		sc.close();
		switch(ch)
		{
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		case '%':
			System.out.println(a%b);
			break;
		default:
			System.out.println("Wrong operator");
			
		}
	}

}
