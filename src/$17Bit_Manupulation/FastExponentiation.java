package $17Bit_Manupulation;
//TC O(logN+1)
public class FastExponentiation {
	//a^n
	public static int fastExpo(int a,int n)
	{
		int ans=1;
		while(n>0)
		{
			if((n&1)!=0)//check LSB
			{
				ans=ans*a;
			}
			a=a*a;
			n=n>>1;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fastExpo(5, 3));
		System.out.println(fastExpo(3, 5));
	}

}
