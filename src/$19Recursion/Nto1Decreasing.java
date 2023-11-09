package $19Recursion;

public class Nto1Decreasing {
	public static void printDecreasing(int n) {
		if(n==1)
		{
			System.out.println(1);
			return;
		}
		System.out.println(n);
		printDecreasing(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDecreasing(10);

	}

}
