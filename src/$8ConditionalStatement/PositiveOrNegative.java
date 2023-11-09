package $8ConditionalStatement;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		if (x > 0) {
			System.out.println("x is greater than 0");
		} else {
			System.out.println("x is less than or equal 0");
		}

	}

}
