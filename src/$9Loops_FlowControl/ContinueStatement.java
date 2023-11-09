package $9Loops_FlowControl;
//To Skip an Iteration
public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("I am out of loop");
	}

}
