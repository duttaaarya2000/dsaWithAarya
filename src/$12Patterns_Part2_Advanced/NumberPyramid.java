package $12Patterns_Part2_Advanced;

public class NumberPyramid {
	public static void numberPyramid(int n) {
		//outer loop
		for(int i=1;i<=n;i++)
		{
			//spaces n-i
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			//stars i
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberPyramid(5);

	}

}
