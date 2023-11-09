package $9Loops_FlowControl;

import java.util.Scanner;

//Keep Entering numbers till user enters a multiple of 10
public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		do {
			System.out.println("Enter a number");
			int n=sc.nextInt();
			if(n%10==0)
			{
				break;
			}
		}
		while(true);
		System.out.println("I am out of loop");
		sc.close();

	}

}
