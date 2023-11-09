package $17Bit_Manupulation;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenOrOdd(3);
		evenOrOdd(11);
		evenOrOdd(8);

	}

	private static void evenOrOdd(int i) {
		// TODO Auto-generated method stub
		//for even number n & 1 is 0
		//for odd number n &1 is 1
		int BitMask=1;
		if((i&BitMask)==1)
		{
			System.out.println("Odd number");
		}
		else
		{
			System.out.println("Even number");
		}
		
	}

}
