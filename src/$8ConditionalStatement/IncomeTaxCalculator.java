package $8ConditionalStatement;

import java.util.Scanner;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Income");
		int income=sc.nextInt();
		sc.close();
		int tax;
		if(income<=500000)
		{
			tax=0;
		}
		else if(income>500000 && income<=1000000)
		{
			tax=(int) (income*0.20);
		}
		else
		{
			tax=(int) (income*0.30);
		}
		System.out.println("Your Tax is "+tax);

	}

}
