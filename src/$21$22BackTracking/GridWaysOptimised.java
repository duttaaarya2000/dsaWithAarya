package $21$22BackTracking;

//TC->O(N)
public class GridWaysOptimised {
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static int gridWays(int n, int m) {
		int ways=factorial(n-1+m-1)/(factorial(n-1)*factorial(m-1));
		return ways;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3, m = 3;
		System.out.println(gridWays(n, m));
	}

}
