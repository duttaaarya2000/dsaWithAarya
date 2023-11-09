package $11Function_Methods;

public class BinaryToDecimal {
	public static int getDecimal(int binary) {
		int pow = 0;
		int decNum = 0;
		while (binary >0) {
				int lastDigit = binary % 10;
				decNum += lastDigit * Math.pow(2, pow);
				binary = binary / 10;
				pow++;
		}
		return decNum;
	}

	public static void main(String args[]) {
		System.out.println("Decimal of 1010 is: " + getDecimal(1010));
		System.out.println("Decimal of 10101 is: " + getDecimal(10101));
		System.out.println("Decimal of 11111 is: " + getDecimal(11111));
	}
}
