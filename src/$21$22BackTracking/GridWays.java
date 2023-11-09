package $21$22BackTracking;
//Find number of ways to each to reach (0,0) to (n-1,m-1) in a N*M Grid
//TC->O(2^n+m)
public class GridWays {
	private static int gridWays(int i, int j, int n, int m) {
		// TODO Auto-generated method stub
		//base
		if(i==n-1 && j==m-1)//condition for last cell
		{
			return 1;
		}
		else if(i==n||j==n)//boundary cross condition
		{
			return 0;
		}
		//kaam
		int w1=gridWays(i+1, j, n, m);
		int w2=gridWays(i, j+1, n, m);
		return w1+w2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3, m = 3;
		System.out.println(gridWays(0, 0, n, m));

	}

}
