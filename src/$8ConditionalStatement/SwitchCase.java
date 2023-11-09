package $8ConditionalStatement;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Pepsi");
		System.out.println("2.Coke");
		System.out.println("3.Sprite");
		System.out.println("4.7Up");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		sc.close();
		switch(choice)
		{
		case 3:
			System.out.println("Sprite");
			break;
		default:
			System.out.println("Wrong Choice");
			break;
		case 1:
			System.out.println("Pepsi");
			break;
		case 4:
			System.out.println("7Up");
			break;
		case 2:
			System.out.println("Coke");
		}
			
		
	}

}
