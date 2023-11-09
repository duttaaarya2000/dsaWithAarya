package $17Bit_Manupulation;

public class Swap2Numbers {
	public static void main(String args[]) {
		int x = 5;
		int y = 9;
		System.out.println("Before Swapping x="+x+" and y="+y);
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("After Swapping x="+x+" and y="+y);

	}
}
