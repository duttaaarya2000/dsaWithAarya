package $7Operators;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=4;
		//a & b are operand and '+' is the operator
		//BINARY OPERATORS
		int c=a+b;
		System.out.println("Addition="+c);
		System.out.println("Subtraction="+(a-b));
		System.out.println("Multiplication="+(a*b));
		System.out.println("Division="+(a/b));
		System.out.println("Modulo(Reminder)="+(a%b));
		//UNARY OPERATORS
		/*
		 * PRE-first value change then value use 
		 * POST-first value use then value change
		 */
		//PRE-INCREMENT
		int x1=10;
		int y1=++x1;
		System.out.println("PRE-INCREMENT");
		System.out.println("x="+x1);
		System.out.println("y="+y1);
		//PRE-DECREMENT
		int x2=10;
		int y2=--x2;
		System.out.println("PRE-DECREMENT");
		System.out.println("x="+x2);
		System.out.println("y="+y2);
		//POST-INCREMENT
		int x3=10;
		int y3=x3++;
		System.out.println("POST-INCREMENT");
		System.out.println("x="+x3);
		System.out.println("y="+y3);
		//POST-DECREMENT
		int x4=10;
		int y4=x4--;
		System.out.println("POST-DECREMENT");
		System.out.println("x="+x4);
		System.out.println("y="+y4);
	}

}
