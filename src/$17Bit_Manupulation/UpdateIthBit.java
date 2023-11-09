package $17Bit_Manupulation;

public class UpdateIthBit {
	public static int updateIthBit1(int n, int i, int newBit) {
		if(newBit==0)
		{
			return ClearIthBit.clearIthBit(n,i);
		}
		else
		{
			return SetIthBit.setIthBIt(n,i);
		}
	}

	public static int updateIthBit2(int n, int i, int newBit) {
		int nb=ClearIthBit.clearIthBit(n,i);
		int bitmask=newBit<<i;
		return nb|bitmask;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(updateIthBit1(10, 2, 1));
		System.out.println(updateIthBit2(10, 2, 1));

	}

}
