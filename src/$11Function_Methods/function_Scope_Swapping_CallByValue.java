package $11Function_Methods;

public class function_Scope_Swapping_CallByValue {
	public static void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("In swap method");
		System.out.println("a =" + a);
		System.out.println("b =" + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 66;
		swap(a, b);
		System.out.println("In main method");
		System.out.println("a =" + a);
		System.out.println("b =" + b);

	}

}
