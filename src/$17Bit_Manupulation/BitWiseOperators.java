
package $17Bit_Manupulation;

public class BitWiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=6;
		System.out.println(a&b);//Bitwise AND
		System.out.println(a|b);//Bitwise OR
		System.out.println(a^b);//Bitwise XOR
		System.out.println(a^a);//x^x is always 0
		System.out.println(b^b);//x^x is always 0
		/*
		 * During NOT operator Most Significant Bit(leftmost) changes 
		 * so we need to find the 2s Complement
		 * (1s Complement+1)
		 */
		System.out.println(~a);//Bitwise NOT operator
		System.out.println(~0);//+ve become negative and vice versa
		System.out.println(a<<2);//Left Shift operator
		System.out.println(b>>1);//Right Shift operator
	}

}
