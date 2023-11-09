package $6Variable_DataStructure;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		float r = sc.nextFloat();
		// float area=3.14*r*r; gives error
		// by default 3.14 will be treated as double
		float area = 3.14f * r * r;
		System.out.println(area);
		sc.close();
	}

}
