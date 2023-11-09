package $19Recursion;

public class FriendsPairingProblem {
	public static int friendsPairing(int n) {
		if(n==1||n==2)
		{
			return n;
		}
		//choice-single
		int fnm1=1*friendsPairing(n-1);
		//choice-pair
		int fnm2=friendsPairing(n-2);
		int pairWays=(n-1)*fnm2;
		//totWays
		int totWays=fnm1+pairWays;
		return totWays;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(friendsPairing(3));

	}

}
