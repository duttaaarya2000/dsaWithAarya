package $9Loops_FlowControl;

import java.util.Scanner;

public class Print1toNWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range");
		int N=sc.nextInt();
		sc.close();
		int count=1;
		while(count<=N)
		{
			System.out.print(count+" ");
			count++;
		}

	}

}
