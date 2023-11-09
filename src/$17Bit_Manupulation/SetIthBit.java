package $17Bit_Manupulation;

public class SetIthBit {
	public static int setIthBIt(int n,int i)
	{
		int bitmask=1<<i;
		return n|bitmask;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(setIthBIt(10,2));
		System.out.println(setIthBIt(10,3));
	}

}
