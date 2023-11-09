package $17Bit_Manupulation;

public class ClearIthBit {
	public static int clearIthBit(int n,int i) {
		int bitmask=~(1<<i);
		return n&bitmask;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(clearIthBit(10, 1));
		System.out.println(clearIthBit(10, 2));
	}

}
