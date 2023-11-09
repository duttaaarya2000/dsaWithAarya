package $10Patterns_Part1;

public class INVERTED_STAR_PATTERN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
