package $11Function_Methods;

import java.util.Scanner;

public class function_syntax_parameters_sumOf2Nos {
	public static int calculateSum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b = sc.nextInt();
		sc.close();
		int sum = calculateSum(a, b);
		System.out.println("Sum is:" + sum);

	}

}
