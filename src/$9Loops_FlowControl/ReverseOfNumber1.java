package $9Loops_FlowControl;

public class ReverseOfNumber1 {
	public static void main(String args[]) {
		int n=10899;
		while(n!=0)
		{
			int lastdigit=n%10;
			System.out.print(lastdigit);
			n/=10;
		}
	}

}
