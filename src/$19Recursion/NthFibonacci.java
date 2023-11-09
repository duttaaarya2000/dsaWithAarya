package $19Recursion;

//TC-> O(2^n)
//SC-> O(N)
public class NthFibonacci {
	public static int fibonacci(int n) {
		if(n==0||n==1)
		{
			return n;
		}
		int fnm1=fibonacci(n-1);
		int fnm2=fibonacci(n-2);
		int fn=fnm1+fnm2;
		return fn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(6));

	}

}
