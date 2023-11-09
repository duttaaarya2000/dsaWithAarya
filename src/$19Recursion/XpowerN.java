package $19Recursion;
//TC->O(n)
//SC->O(n)
public class XpowerN {
	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int xpownm1 = power(x, n - 1);
		int xpown = x * xpownm1;
		return xpown;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 4));

	}

}
