package $9Loops_FlowControl;

import java.util.Scanner;

//Display all numbers entered by user except multiples of 10
public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		do {
			System.out.println("Enter a number");
			int n=sc.nextInt();
			if(n%10==0)
			{
				continue;
			}
			System.out.println("Number was:"+n);
		}
		while(true);

	}

}
