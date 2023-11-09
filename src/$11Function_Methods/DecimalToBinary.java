package $11Function_Methods;

public class DecimalToBinary {
	public static int getBinary(int decNum)
	{
		int pow=0;
		int binNum=0;
		while(decNum>0)
		{
			int rem=decNum%2;
			binNum+=rem*Math.pow(10,pow);
			decNum/=2;
			pow++;
		}
		return binNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Binary of 10 is: " + getBinary(10));
		System.out.println("Binary of 21 is: " + getBinary(21));
		System.out.println("Binary of 31 is: " + getBinary(31));

	}

}
