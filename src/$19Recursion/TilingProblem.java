package $19Recursion;

public class TilingProblem {
	public static int tilingProblem(int n) {
		//root size (2*n)
		//base case
		if(n==0||n==1)
		{
			return 1;
		}
		//logical work
		//vertical choice
		int fnm1=tilingProblem(n-1);
		//horizontal choice
		int fnm2=tilingProblem(n-2);
		
		int totWays=fnm1+fnm2;
		return totWays;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tile size (2*1)
		System.out.println(tilingProblem(4));

	}

}
