package $13ARRAYS;

public class PairsInArray {

	private static void pairs(int[] num) {
		// TODO Auto-generated method stub
		int tp=0;
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				System.out.print("("+num[i]+","+num[j]+")"+" ");
				tp++;
			}
			System.out.println();
		}
		System.out.println("Total pairs="+tp);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,4,6,8,10};
		pairs(num);

	}

}
