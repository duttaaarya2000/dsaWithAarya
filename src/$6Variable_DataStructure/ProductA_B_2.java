package $6Variable_DataStructure;

import java.util.Scanner;

public class ProductA_B_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A");
		int a=sc.nextInt();
		System.out.println("Enter value of B");
		int b=sc.nextInt();
		sc.close();
		//assigning the value of a+b to sum
		int product=a*b;
		System.out.println("Product:"+product);
		
	}

}
