package $19Recursion;

//TC-> O(N)
//SC-> O(N)
public class FactorialOfN {
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		int fnm1 = factorial(n - 1);
		int fn = n * fnm1;
		return fn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));

	}

}
