package $19Recursion;

public class _1toNIncreasing {
	public static void printIncreasing(int n) {
		if(n==1)
		{
			System.out.println(1);
			return;
		}
		printIncreasing(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printIncreasing(10);

	}

}
