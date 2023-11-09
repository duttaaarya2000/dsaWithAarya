package $19Recursion;

//TC-> O(N)
//SC-> O(N)
public class SumOFNaturalNumbers {
	public static int sum(int n) {
		if (n == 1) {
			return 1;
		}
		int snm1 = sum(n - 1);
		int sn = n + snm1;
		return sn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(5));

	}

}
