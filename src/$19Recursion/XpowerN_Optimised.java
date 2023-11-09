package $19Recursion;

public class XpowerN_Optimised {
	public static int OptimisedPower(int x, int n) {
		//base case
		if(n==0)
		{
			return 1;
		}
		//kaam
		int halfPower=OptimisedPower(x,n/2);
		int halfPowerSquare=halfPower*halfPower;
		if(n%2!=0)
		{
			return halfPowerSquare*x;
		}
		return halfPowerSquare;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(OptimisedPower(2, 4));
	}

}
