package $12Patterns_Part2_Advanced;

public class SolidRhombus {
	public static void solidRhombus(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solidRhombus(5);
	}

}
