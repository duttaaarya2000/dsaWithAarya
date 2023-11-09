package $9Loops_FlowControl;

import java.util.Scanner;

public class Sum1toNWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range");
		int N=sc.nextInt();
		sc.close();
		int count=1; 
		int sum=0;
		while(count<=N)
		{
			System.out.print(count+" ");
			sum+=count;
			count++;
		}
		System.out.println("Sum is:"+sum);
	}

}
