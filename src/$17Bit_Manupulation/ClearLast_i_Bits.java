package $17Bit_Manupulation;

public class ClearLast_i_Bits {
	public static int clearLast_i_Bits(int n,int i)
	{
		int bitmask=(~0)<<i;
		return n&bitmask;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(clearLast_i_Bits(15, 2));
	}

}
