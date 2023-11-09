package $17Bit_Manupulation;

/*Count no of set bits(i.e 1's) 
in the binary form of the number*/
public class CountSetBits {
	public static int countSetBits(int n)
	{
		int count = 0;
		while (n>0) {
			if ((n & 1) != 0)//Check LSB
			{
				count++;
			} 
			n=n>>1;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSetBits(10));
		System.out.println(countSetBits(11));
	}

}
