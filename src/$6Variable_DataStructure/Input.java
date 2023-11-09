package $6Variable_DataStructure;

//importing Scanner class from util package
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sc is an object of Scanner class
		Scanner sc = new Scanner(System.in);
		// next() input a word,doesnot create a new line
		System.out.println("Enter a Word");
		String i = sc.next();
		// nextLine() input a Sentence
		System.out.println("Enter a Sentence");
		sc.nextLine();// to move the object to next line
		String j = sc.nextLine();
		// nextInt() input a int variable
		System.out.println("Enter a Integer");
		int k = sc.nextInt();
		// nextDouble() input a double variable
		System.out.println("Enter a Double");
		double l = sc.nextDouble();
		// nextFloat() input a float variable
		System.out.println("Enter a Float");
		float m = sc.nextFloat();
		// nextBoolean() input a boolean variable
		System.out.println("Enter a Boolean");
		boolean n = sc.nextBoolean();
		// nextShort() input a short variable
		System.out.println("Enter a Short");
		short o = sc.nextShort();
		// nextLong() input a long variable
		System.out.println("Enter a Long");
		long p = sc.nextLong();
		// nextByte() input a byte variable
		System.out.println("Enter a Byte");
		byte q = sc.nextByte();
		System.out.println("Outputs are:");
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("k=" + k);
		System.out.println("l=" + l);
		System.out.println("m=" + m);
		System.out.println("n=" + n);
		System.out.println("o=" + o);
		System.out.println("p=" + p);
		System.out.println("q=" + q);
		sc.close();
	}

}
