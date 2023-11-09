package $11Function_Methods;

public class BinomialCoefficient {
	public static int factorial(int n) {
		int prod = 1;
		if (n == 0)
			return 1;
		for (int i = 1; i <= n; i++) {
			prod *= i;
		}
		return prod;

	}

	public static int BinomialCoefficient(int n, int r) {
		int fact_n = factorial(n);
		int fact_r = factorial(r);
		int fact_nmr = factorial(n - r);
		int bincoeff = fact_n / (fact_r * fact_nmr);
		return bincoeff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(BinomialCoefficient(5, 2));
		System.out.println(BinomialCoefficient(6, 3));
		System.out.println(BinomialCoefficient(7, 3));
	}

}
