package $6Variable_DataStructure;

import java.util.Scanner;

/*Automatic Widening Conversion
It happens when source type<destination type
byte < short < int < long < float < double*/
public class ImplicitTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 25;
		long b = a;
		System.out.println(b);
		// Lossy conversion
		/*
		 * Cannot convert long to int 
		 * long c=25;
		 * int d=c;
		 * System.out.println(b);
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Integer number:");
		float num=sc.nextInt();
		sc.close();
		System.out.println(num);
		//Lossy Conversion
		//int num=sc.nextFloat();
	}

}
