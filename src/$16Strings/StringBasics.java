package $16Strings;

import java.util.Scanner;

public class StringBasics {
	public static void main(String args[]) {
		char abc[]= {'a','b','c','d','e'};
		System.out.println(abc);
		//Store string as literal
		String str="abcde";
		System.out.println(str);
		//Store string as object
		String str2=new String("abcde");
		System.out.println(str2);
		//Length of String
		System.out.println("Length of String:"+str.length());
		//Input&Output of String
		Scanner sc=new Scanner(System.in);
		String input1=sc.next();//Stores string but donot store after space or enter
		sc.close();
		System.out.println("Input1="+input1);
		String input2=sc.nextLine();//Stores string also store after space or enter
		System.out.println("Input2="+input2);
	}

}
