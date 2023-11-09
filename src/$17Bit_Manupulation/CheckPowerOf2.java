package $17Bit_Manupulation;

public class CheckPowerOf2 {
	public static boolean isPowerOf2(int n)
	{
		return (n&(n-1))==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Is Power of 2:"+isPowerOf2(9));
		System.out.println("Is Power of 2:"+isPowerOf2(8));
	}

}
